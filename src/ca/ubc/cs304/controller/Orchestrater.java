package ca.ubc.cs304.controller;

import ca.ubc.cs304.database.DatabaseHandler;
import ca.ubc.cs304.delegates.LoginWindowDelegate;
import ca.ubc.cs304.delegates.TransactionWindowDelegate;
import ca.ubc.cs304.ui.LoginWindow;
import ca.ubc.cs304.ui.TransactionWindow;

public class Orchestrater implements LoginWindowDelegate, TransactionWindowDelegate {

    private DatabaseHandler dbHandler = null;
    private LoginWindow loginWindow = null;
    private TransactionWindow TransactionWindow = null;

    public Orchestrater() {
        dbHandler = new DatabaseHandler();
    }

    private void start() {
        loginWindow = new LoginWindow();
        loginWindow.showFrame(this);
    }

    public void login(String username, String password) {
        boolean didConnect = dbHandler.login(username, password);

        if (didConnect) {
            // Once connected, remove login window and start text transaction flow
            loginWindow.dispose();

            TransactionWindow = new TransactionWindow();
            TransactionWindow.showFrame(this);
        } else {
            loginWindow.handleLoginFailed();

            if (loginWindow.hasReachedMaxLoginAttempts()) {
                loginWindow.dispose();
                System.out.println("You have exceeded your number of allowed attempts");
                System.exit(-1);
            }
        }
    }


    //This will be used for making the GUI
    //
    public void input() {

    }

    public static void main(String args[]) {
        Orchestrater orchestrater = new Orchestrater();
        orchestrater.start();
    }
}
