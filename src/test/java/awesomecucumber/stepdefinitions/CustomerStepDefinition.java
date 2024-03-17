package awesomecucumber.stepdefinitions;

import awesomecucumber.constants.EndPoint;
import awesomecucumber.context.TestContext;
import awesomecucumber.domainobject.BillingDetails;
import awesomecucumber.pages.PageFactoryManager;
import awesomecucumber.pages.StorePage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class CustomerStepDefinition {
    private TestContext context;
    private StorePage storePage;

    public CustomerStepDefinition(TestContext context){
        this.context=context;
        storePage= PageFactoryManager.getStorePage(context.driver);
    }

    @Given("I am a guest customer")
    public void iAmAGuestCustomer() {
//        driver = DriverFactory.getDriver();
        storePage.load(EndPoint.STORE.url);
    }


    @Given("my billing details are")
    public void myBillingDetailsAre(BillingDetails billingDetails) {
        context.billingDetails = billingDetails;
    }


}
