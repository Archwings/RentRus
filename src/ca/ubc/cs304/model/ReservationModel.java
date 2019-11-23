package ca.ubc.cs304.model;

import java.sql.Timestamp;

// Used to delete and store information of a single reservation
public class ReservationModel {
    private final int confNo;
    private final String license; ///foreign
    private final String cellphone; ///foreign
    private final String dlicense; ///foreign
    private final Timestamp fromDate;
    private final Timestamp toDate;


    public ReservationModel(int confNo, String license, String cellphone, String dlicense, Timestamp fromDate, Timestamp toDate) {
        this.confNo = confNo;
        this.license = license;
        this.cellphone = cellphone;
        this.dlicense = dlicense;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }
    public int getConfNo() {
        return confNo;
    }
    public String getLicense() {
        return license;
    }
    public String getCellphone() {
        return cellphone;
    }
    public String getDlicense() {
        return dlicense;
    }
    public Timestamp getFromDate() {
        return fromDate;
    }
    public Timestamp getToDate() {
        return  toDate;
    }

}

