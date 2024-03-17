package awesomecucumber.stepdefinitions;

import awesomecucumber.constants.EndPoint;
import awesomecucumber.context.TestContext;
import awesomecucumber.domainobject.BillingDetails;
import awesomecucumber.domainobject.Product;
import awesomecucumber.factory.DriverFactory;
import awesomecucumber.pages.CartPage;
import awesomecucumber.pages.CheckoutPage;
import awesomecucumber.pages.StorePage;
import awesomecucumber.utils.ConfigLoader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
//import  org.junit.Assert;

public class MyStepDefinition {

    private WebDriver driver;
    public MyStepDefinition(TestContext context){
        //picocontainer dependency injection need empty constructor
        System.out.println("STEP DEF DI - " +context.scenarioName);
        this.driver=context.driver;
    }









}
