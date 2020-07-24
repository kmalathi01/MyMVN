package QA_Experience_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends TestBase  {

    String loginURL="https://login.dev.qa-experience.com/";

    @FindBy(name = "loginUsername")
    @CacheLookup
    WebElement loginUserName;

    @FindBy(name = "loginPassword")
    @CacheLookup
    WebElement loginPassword;

    @FindBy(tagName = "button")
    @CacheLookup
    WebElement loginButton;

    @FindBy(className ="logged-in__success")
    @CacheLookup
    WebElement successClass;

    @FindBy(className = "form-field__error")
    @CacheLookup
    WebElement errorMessageClass;




    public void goHome() {
        driver.get(loginURL);
    }

    public void enterUserName( String loginValue) {
        loginUserName.sendKeys(loginValue);
    }

    public void enterPassword(String password) {
      loginPassword.sendKeys(password);
    }

    public void clickLoginButton()
    {
       loginButton.click();

    }

    public String getSuccessMessage()
    {
      String successMessage = successClass.getText();
        return successMessage;
    }

    public String getErrorMessage(){
       String errorMessage = errorMessageClass.getText();
        return errorMessage;
    }

    public WebElement getPasswordField() {
        return loginPassword;
    }
}
