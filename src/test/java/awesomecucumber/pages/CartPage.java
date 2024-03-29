package awesomecucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {
    @FindBy(css="td[class='product-name'] a")
    private WebElement productNameField;

    @FindBy(css="input[title='Qty']")
    private WebElement productQuantityField;

    //@FindBy(css="div[class='wc-proceed-to-checkout'] a")
    @FindBy(css = ".checkout-button")
    private WebElement proceedToCheckoutBtn;


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getProductName() {
        return wait.until(ExpectedConditions.visibilityOf(productNameField)).getText();
    }

    public Integer getProductQuantity() {
        return Integer.parseInt(wait.until(ExpectedConditions.visibilityOf(productQuantityField)).getAttribute("value"));
    }

    public void checkout() {
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutBtn)).click();
    }

}
