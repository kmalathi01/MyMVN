package QA_Experience_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;
    public static EventFiringWebDriver e_driver;
    public static long PAGE_LOAD_TIMEOUT = 20;
    public static long IMPLICIT_WAIT = 20;

    public TestBase(){

        if(driver == null) {
            this.driver = driver;
        }
        PageFactory.initElements(driver, this);
       System.setProperty("webdriver.gecko.driver", "src/test/tools/geckodriver");

    }
    public void testBaseMethod()
    {

    }

    public static void initialization(){

            String browserName = "FF";

        if(browserName.equals("chrome")){
            if(driver == null) {
                driver = new ChromeDriver();
            }

        }
        else if(browserName.equals("FF")){
            if(driver == null) {
                driver = new FirefoxDriver();
            }
        }


//        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT,TimeUnit.SECONDS);

    }

}
