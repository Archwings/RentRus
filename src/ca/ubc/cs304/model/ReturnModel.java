package ca.ubc.cs304.model;

import java.sql.Timestamp;

public class ReturnModel {
    private final int rid;
    private final Timestamp date;
    private final int odometer;
    private final String fulltank;
    private final double value;

    public ReturnModel(int rid, Timestamp date, int odometer, String fulltank, double value){
        this.rid = rid;
        this.date = date;
        this.fulltank = fulltank;
        this.value = value;
        this.odometer = odometer;
    }
    public int getRid() {
        return rid;
    }
    public Timestamp getDate() {
        return date;
    }
    public double getValue() {
        return value;
    }
    public String getFulltank() {
        return fulltank;
    }

}
