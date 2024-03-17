package awesomecucumber.domainobject;

public class BillingDetails {

    private String billFirstName;
    private String billLastName;
    private String billStreetAddrLine1;
    private String billCity;
    private String billState;
    private String billZip;
    private String billEmail;


    public BillingDetails(String billFirstName, String billLastName, String billStreetAddrLine1, String billCity,
                          String billState, String billZip, String billEmail) {
        super();
        this.billFirstName = billFirstName;
        this.billLastName = billLastName;
        this.billStreetAddrLine1 = billStreetAddrLine1;
        this.billCity = billCity;
        this.billState = billState;
        this.billZip = billZip;
        this.billEmail = billEmail;
    }

    public String getBillFirstName() {
        return billFirstName;
    }
    public void setBillFirstName(String billFirstName) {
        this.billFirstName = billFirstName;
    }
    public String getBillLastName() {
        return billLastName;
    }
    public void setBillLastName(String billLastName) {
        this.billLastName = billLastName;
    }
    public String getBillStreetAddrLine1() {
        return billStreetAddrLine1;
    }
    public void setBillStreetAddrLine1(String billStreetAddrLine1) {
        this.billStreetAddrLine1 = billStreetAddrLine1;
    }
    public String getBillCity() {
        return billCity;
    }
    public void setBillCity(String billCity) {
        this.billCity = billCity;
    }
    public String getBillState() {
        return billState;
    }
    public void setBillState(String billState) {
        this.billState = billState;
    }
    public String getBillZip() {
        return billZip;
    }
    public void setBillZip(String billZip) {
        this.billZip = billZip;
    }
    public String getBillEmail() {
        return billEmail;
    }
    public void setBillEmail(String billEmail) {
        this.billEmail = billEmail;
    }

}
