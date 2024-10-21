package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;

public class Login {
    pages.Login login = new pages.Login();

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        login.mySendKeys(login.loginUsername, ConfigReader.getProperty("username"));

        login.mySendKeys(login.loginPassword , ConfigReader.getProperty("password"));

        login.myClick(login.loginBtn);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        login.verifyContainsText(login.loginControl ,"Account Services");
    }

    @When("Enter {string} and {string} and click login button")
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
