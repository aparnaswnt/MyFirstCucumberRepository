package awesomecucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(plugin = {"summary","html:target/cucumber/cucumber.html"},
                snippets = CucumberOptions.SnippetType.CAMELCASE,
                glue = {"awesomecucumber"},
                features = "src/test/resources/awesomecucumber" )
public class MyTestNGRunnerTest extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }
}
