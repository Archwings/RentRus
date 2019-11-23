package ca.ubc.cs304.model;

import java.sql.Timestamp;

public class VehicleTypeModel {
    private final String vtname;
    private final String features;
    private final double wrate;
    private final double drate;
    private final double hrate;

    public VehicleTypeModel(int rid, Timestamp date, int odometer, String fulltank, double value, String vtname, String features, double wrate, double drate, double hrate){
        this.vtname = vtname;
        this.features = features;
        this.wrate = wrate;
        this.drate = drate;
        this.hrate = hrate;
    }
    public String getVtname() {
        return vtname;
    }
    public String getFeatures() {
        return features;
    }
    public double getWrate() {
        return wrate;
    }
    public double getDrate() {
        return drate;
    }
    public double getHrate() {
        return hrate;
    }

}
