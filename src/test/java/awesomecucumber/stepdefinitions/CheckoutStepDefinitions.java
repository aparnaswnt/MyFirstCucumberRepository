package awesomecucumber.stepdefinitions;

import awesomecucumber.constants.EndPoint;
import awesomecucumber.context.TestContext;
import awesomecucumber.domainobject.BillingDetails;
import awesomecucumber.pages.CartPage;
import awesomecucumber.pages.CheckoutPage;
import awesomecucumber.pages.PageFactoryManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckoutStepDefinitions {

    private TestContext context;
    private CheckoutPage checkoutPage;

    public CheckoutStepDefinitions(TestContext context){
        this.context=context;
        checkoutPage = PageFactoryManager.getCheckoutPage(context.driver);
    }



    @When("I provide billing details")
    public void iProvideBillingDetails() {
        //CheckoutPage check = new CheckoutPage(driver);
        checkoutPage.setBillingDetails(context.billingDetails);

    }

    @When("I place an order")
    public void iPlaceAnOrder() {
        checkoutPage.placeOrder();
    }

    @Then("the order should be placed successfully")
    public void theOrderShouldBePlacedSuccessfully() {
        Assert.assertEquals(checkoutPage.getNotice(), "Thank you. Your order has been received.");
    }

    @Given("I am on the Checkout page")
    public void iAmOnTheCheckoutPage() {
        checkoutPage.load(EndPoint.CHECKOUT.url);

    }







}
