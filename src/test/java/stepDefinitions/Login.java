package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.TimeoutException;
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

    @When("The user types invalid username and invalid password and clicks on the login button")
    public void enterAndAndClickLoginButton() {
        login.mySendKeys(login.loginUsername,ConfigReader.getProperty("invalidUsername"));
        login.mySendKeys(login.loginPassword,ConfigReader.getProperty("invalidPassword"));
        login.myClick(login.loginBtn);
    }

    @Then("Error message should be displayed")
    public void messageShouldBeDisplayed() {
        try {
            login.verifyContainsText(login.errorMessage,"not be verified.");
        }catch (TimeoutException e){
            login.verifyContainsText(login.errorMessage,"has been logged.");
        }
    }
}