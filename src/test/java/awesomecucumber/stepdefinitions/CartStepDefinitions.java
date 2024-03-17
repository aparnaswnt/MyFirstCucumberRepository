package awesomecucumber.stepdefinitions;

import awesomecucumber.constants.EndPoint;
import awesomecucumber.context.TestContext;
import awesomecucumber.domainobject.Product;
import awesomecucumber.pages.CartPage;
import awesomecucumber.pages.PageFactoryManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CartStepDefinitions {

    private final CartPage cartPage;

    public CartStepDefinitions(TestContext context){
        cartPage= PageFactoryManager.getCartPage(context.driver);
    }


    @Then("I should see {int} {product} in the cart")
    public void iShouldSeeInTheCart(Integer quantity, Product product) {
        Assert.assertEquals(cartPage.getProductName(), product.getName());
        Assert.assertEquals(cartPage.getProductQuantity(),quantity );

    }


}
