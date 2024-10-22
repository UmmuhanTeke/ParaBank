package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;

public class Login {
    pages.Login login = new pages.Login();

    @When("The user types username and password and clicks on the login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        login.mySendKeys(login.loginUsername, ConfigReader.getProperty("username"));

        login.mySendKeys(login.loginPassword , ConfigReader.getProperty("password"));

        login.myClick(login.loginBtn);
    }

    @Then("The user should login successfully")
    public void userShouldLoginSuccessfully() {
        login.verifyContainsText(login.loginControl ,"Account Services");
    }

    @When("The user types {string} and {string} and clicks on the login button")
    public void enterAndAndClickLoginButton(String invalidUsername, String invalidPassword) {
        login.mySendKeys(login.loginUsername,invalidUsername);

        login.mySendKeys(login.loginPassword,invalidPassword);

        login.myClick(login.loginBtn);
    }

    @Then("Error message should be displayed")
    public void messageShouldBeDisplayed() {
        login.verifyContainsText(login.errorMessage,"not be verified.");
    }
}
