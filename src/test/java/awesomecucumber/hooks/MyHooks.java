package awesomecucumber.hooks;

import awesomecucumber.context.TestContext;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

import awesomecucumber.factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
public class MyHooks {
    private WebDriver driver;
    private TestContext context;

    public MyHooks(TestContext context){
        this.context=context;
        this.driver=context.driver;
   }

    @Before
    public void before(Scenario scenario) {
        context.scenarioName = scenario.getName();
        System.out.println("DI Scenario name -"+context.scenarioName);

        System.out.println("BEFORE - Thread ID : " +Thread.currentThread().threadId()+"," +
                "Scenario Name :"+ scenario.getName());
        driver=DriverFactory.initializeDriver(System.getProperty("browser","chrome"));
        context.driver = driver;
    }

    @After
    public void after() {
        driver.quit();
    }
}
