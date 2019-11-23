package ca.ubc.cs304.ui;

import ca.ubc.cs304.delegates.TransactionWindowDelegate;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TransactionWindow extends JFrame implements ActionListener {
    private TransactionWindowDelegate delegate = null;


    public TransactionWindow(){
        super("Transactions");
    }

    public void showFrame(TransactionWindowDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // getting fields from delgate
    }
}
