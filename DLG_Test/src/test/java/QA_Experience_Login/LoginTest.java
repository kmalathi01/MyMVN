package QA_Experience_Login;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

public class LoginTest extends TestBase{

    public LoginTest() {
        super();
        setUp();
    }
    LoginPage objLoginPage;

    @Before
    public void setUp(){
        initialization();
        objLoginPage = new LoginPage();
    }

    @After
    public void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }

    public void goHome(){
        objLoginPage.goHome();
    }


    public void enterLoginUserName( String loginValue) {
        objLoginPage.enterUserName(loginValue);
    }

    public void enterPassword(String password){
        objLoginPage.enterPassword(password);
    }


    public void click() {
        objLoginPage.clickLoginButton();
    }

    public void verifyString(String sucessString) {
        Assert.assertEquals("Success Message Verification",sucessString,objLoginPage.getSuccessMessage());
    }

    public void verifyValidation(String sucessString) {
        Assert.assertEquals("Validation Error",sucessString,objLoginPage.getErrorMessage());
    }

    public void verifyMaskedPassword() {
        Assert.assertTrue(objLoginPage.getPasswordField().getAttribute("type").equals("password"));
    }
}
