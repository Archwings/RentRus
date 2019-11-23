package ca.ubc.cs304.model;

public class VehicleModel {
    private final String license;
    private final String make;
    private final String model;
    private final String year;
    private final String color;
    private final int odometer;
    private final String status;
    private final String branch;
    private final String vtname;

    public VehicleModel(String license, String make, String model, String year, String color, String status, String branch, String vtname, int odometer){
        this.license = license;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.status = status;
        this.branch = branch;
        this.vtname = vtname;
        this.odometer = odometer;
    }
    public String getLicense() {
        return license;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String getStatus() {
        return status;
    }
    public String getBranch() {
        return branch;
    }
    public String getVtname() {
        return vtname;
    }
    public int getOdometer() {
        return odometer;
    }

}

