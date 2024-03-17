package awesomecucumber.stepdefinitions;

import awesomecucumber.apis.CartApi;
import awesomecucumber.constants.EndPoint;
import awesomecucumber.context.TestContext;
import awesomecucumber.domainobject.Product;
import awesomecucumber.pages.CartPage;
import awesomecucumber.pages.PageFactoryManager;
import awesomecucumber.pages.StorePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class StoreStepDefinition {

    private StorePage storePage;
    private TestContext context;

    public StoreStepDefinition(TestContext context){
        this.context=context;
        storePage= PageFactoryManager.getStorePage(context.driver);
    }

    @Given("I am on the Store page")
    public void iAmOnTheStorePage() {
        //driver = DriverFactory.getDriver();
        storePage.load(EndPoint.STORE.url);
    }

    @When("I add a {product} to the cart")
    public void iAddAToTheCart(Product product)  {
        storePage.addToCart(product.getName());
    }

    @Given("I have a product in the cart")
    public void iHaveAProductInTheCart() throws InterruptedException {
       // storePage.addToCart("Blue Shoes");
        CartApi cartApi=new CartApi(context.cookies.getCookies());
        cartApi.addToCart(1215,1);
        context.cookies.setCookies(cartApi.getCookies());
        context.cookies.injectCookiesToBrowser(context.driver);

    }
}
