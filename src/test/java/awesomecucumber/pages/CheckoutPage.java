package awesomecucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import awesomecucumber.domainobject.BillingDetails;

public class CheckoutPage extends BasePage{
    @FindBy(id="billing_first_name") private WebElement billFirstNameField;
    @FindBy(css="#billing_last_name") private WebElement billLastNameField;
    @FindBy(css="#billing_address_1") private WebElement billStreetAddrLine1Field;
    @FindBy(css="#billing_city") private WebElement billCityField;
    @FindBy(css="#billing_state") private WebElement billStateField;
    @FindBy(id="select2-billing_state-container")  private  WebElement alternateBillStateDropdown;
    @FindBy(css="#billing_postcode") private WebElement billZipField;
    @FindBy(css="#billing_email") private WebElement billEmailField;
    @FindBy(css="#place_order") private WebElement placeOrderButton;
    @FindBy(css=".woocommerce-notice") private WebElement noticeText;

    private final By overlay = By.cssSelector(".blockUI.blockOverlay");

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }




    public String getFirstNameField() {
        return billFirstNameField.getText();
    }

    public CheckoutPage setFirstNameField(String firstName) {
        billFirstNameField.clear();
        billFirstNameField.sendKeys(firstName);
        return this;
    }

    public CheckoutPage setLastNameField(String lastName) {
        billLastNameField.clear();
        billLastNameField.sendKeys(lastName);
        return this;
    }

    public CheckoutPage setStreetAddrLine1Field(String streetAddrLine1) {
        billStreetAddrLine1Field.clear();
        billStreetAddrLine1Field.sendKeys(streetAddrLine1);
        return this;
    }

    public CheckoutPage setCityField(String city) {
        billCityField.clear();
        billCityField.sendKeys(city);
        return this;
    }

    public CheckoutPage setStateField(String state) {
        wait.until(ExpectedConditions.elementToBeClickable(alternateBillStateDropdown)).click();
        WebElement e =wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//li[text()='" +state+"']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",e);
        e.click();
//        Select st = new Select(billStateField);
//        st.selectByVisibleText(state);
          return this;
    }

    public CheckoutPage setZipField(String zip) {
        billZipField.clear();
        billZipField.sendKeys(zip);
        return this;
    }

    public CheckoutPage setEmailField(String email) {
        billEmailField.clear();
        billEmailField.sendKeys(email);
        return this;
    }

    public CheckoutPage placeOrder() {
        waitForOverlaysToDisappear(overlay);
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderButton)).click();
        return this;
    }

    public String getNotice() {
        return wait.until(ExpectedConditions.visibilityOf(noticeText)).getText();
    }

    public CheckoutPage setBillingDetails(BillingDetails billingDetails) {
        return setFirstNameField(billingDetails.getBillFirstName()).
                setLastNameField(billingDetails.getBillLastName()).
                setStreetAddrLine1Field(billingDetails.getBillStreetAddrLine1()).
                setCityField(billingDetails.getBillCity()).
                setStateField(billingDetails.getBillState()).
                setZipField(billingDetails.getBillZip()).
                setEmailField(billingDetails.getBillEmail());

    }



}
