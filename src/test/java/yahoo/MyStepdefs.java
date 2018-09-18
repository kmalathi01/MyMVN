package yahoo;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Arun on 17/09/2018.
 */
public class MyStepdefs {

    public static WebDriver driver;
    String Url = "http://www.yahoo.com";

    @Given("^I have a yahoo page$")
    public void i_have_a_yahoo_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        System.setProperty("webdriver.chrome.driver","/Users/Arun/Documents/Projects/Sample/Driver/chromedriver");
        driver=new ChromeDriver();
        driver.get(Url);

        Assert.assertTrue(driver.getPageSource().contains("Before you continue"));
        Assert.assertTrue(driver.findElement(By.linkText("Sign in")).isEnabled());
        Assert.assertTrue(driver.findElement(By.linkText("Privacy Centre")).isEnabled());

    }

    @When("^I click SignIn$")
    public void i_click_SignIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @Then("^It should ask for a username$")
    public void it_should_ask_for_a_username() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }


    @AfterClass
    public static void writeExtentReport() {
        //Reporter.loadXMLConfig(new File("config/report.xml"));
        driver.close();

    }

}
