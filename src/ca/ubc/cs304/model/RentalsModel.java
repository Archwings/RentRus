package ca.ubc.cs304.model;


import java.sql.Date;
import java.sql.Timestamp;

public class RentalsModel {
    private final int rid;
    private final String license; ///foreign
    private final String dlicense; ///foreign
    private final Timestamp fromDate;
    private final Timestamp toDate;
    private final int odometer;
    private final String cardName;
    private final String cardNo;
    private final Date expDate;
    private final int confNo; ///foreign

    public RentalsModel(int rid, String license, String dlicense, Timestamp fromDate, Timestamp toDate, int odometer, String cardName, String cardNo, Date expDate, int confNo){
        this.rid = rid;
        this.license = license;
        this.dlicense = dlicense;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.odometer = odometer;
        this.cardName = cardName;
        this.cardNo = cardNo;
        this.expDate = expDate;
        this.confNo = confNo;
    }
    public int getRid() {
        return rid;
    }
    public String getLicense() {
        return license;
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
    public int getOdometer() {
        return odometer;
    }
    public String getCardName() {
        return cardName;
    }
    public String getCardNo() {
        return cardNo;
    }
    public Date getExpDate() {
        return expDate;
    }
    public int getConfNo() {
        return confNo;
    }

}