package awesomecucumber.context;

import awesomecucumber.domainobject.BillingDetails;
import awesomecucumber.domainobject.Cookies;
import org.openqa.selenium.WebDriver;

public class TestContext {
    public String scenarioName;
    public WebDriver driver;
    public BillingDetails billingDetails;
    public Cookies cookies;

    public TestContext(){
        cookies=new Cookies();
        cookies.setCookies(new io.restassured.http.Cookies());
    }

}
