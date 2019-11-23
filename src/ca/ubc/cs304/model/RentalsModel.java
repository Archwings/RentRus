package ca.ubc.cs304.model;


public class RentalsModel {
    private final int rid;
    private final String license; ///foreign
    private final String dlicense; ///foreign
    private final String fromDate;
    private final String toDate;
    private final int odometer;
    private final String cardName;
    private final String cardNo;
    private final String expDate;
    private final int confNo;

    public RentalsModel(int rid, String license, String dlicense, String fromDate, String toDate, int odometer, String cardName, String cardNo, String expDate, int confNo){
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
    public String getFromDate() {
        return fromDate;
    }
    public String getToDate() {
        return toDate;
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
    public String getExpDate() {
        return expDate;
    }
    public int getConfNo() {
        return confNo;
    }

}