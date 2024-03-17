package awesomecucumber.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
  //  public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver initializeDriver(String browser) {
        WebDriver driver;
        switch(browser){
            case "chrome":
                System.setProperty("webdriver.chrome.driver",
                        "D:\\Aparna\\Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver=new FirefoxDriver();
                break;
            default:
              throw new IllegalStateException("INVALID Browser "+browser);
        }

        driver.manage().window().maximize();
        //DriverFactory.driver.set(driver);
        return driver;
    }

   /* public static WebDriver getDriver() {
        return driver.get();
    }*/
}
