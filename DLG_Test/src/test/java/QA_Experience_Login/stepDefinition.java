package QA_Experience_Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {

    LoginTest objLoginTest = new LoginTest();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        objLoginTest.goHome();
    }

    @When("I fill the username with {string}")
    public void i_fill_the_username_with(String loginValue) {
        objLoginTest.enterLoginUserName(loginValue);
    }

    @When("I fill in password with {string}")
    public void i_fill_in_password_with(String passwordValue) {
        objLoginTest.enterPassword(passwordValue);
    }


    @When("I press Login")
    public void i_press_login() {
        objLoginTest.click();
    }

    @Then("I should see {string}")
    public void i_should_see(String string) {
        objLoginTest.verifyString(string);
    }

    @Then("I should get validation error {string}")
    public void i_should_get_validation_error(String string) {
        objLoginTest.verifyValidation(string);
    }

    @Then("I should see the paswords field encrypted")
    public void i_should_see_the_paswords_field_encrypted() {
        objLoginTest.verifyMaskedPassword();
    }

}