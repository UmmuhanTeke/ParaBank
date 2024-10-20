package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login;
import utilities.ConfigReader;
import utilities.GWD;

import java.util.Locale;

public class Register {

    Login login = new Login();
    Faker faker = new Faker(new Locale("en-US"));

    @Given("Navigate to the ParaBank website")
    public void navigateToTheParaBankWebsite() {
        GWD.getDriver().get("https://parabank.parasoft.com/");
    }

    @When("Click on the Register button")
    public void clickOnTheRegisterButton() {
        login.myClick(login.registerBtn);
    }

    @And("Fills the areas given in the customer data")
    public void fillsTheAreasGivenInTheCustomerData() {

        login.mySendKeys(login.firstName, faker.name().firstName());

        login.mySendKeys(login.lastName, faker.name().lastName());

        login.mySendKeys(login.address, faker.address().fullAddress());

        login.mySendKeys(login.city, faker.address().city());

        login.mySendKeys(login.state, faker.address().state());

        login.mySendKeys(login.zipCode, faker.address().zipCode());

        login.mySendKeys(login.phoneNumber, faker.phoneNumber().cellPhone());

        login.mySendKeys(login.ssn, faker.idNumber().ssnValid());

        ConfigReader.updateProperty("username");

        login.mySendKeys(login.registerUsername, ConfigReader.getProperty("username"));

        ConfigReader.updateProperty("password");

        login.mySendKeys(login.registerPassword, ConfigReader.getProperty("password"));

        login.mySendKeys(login.confirmPassword, ConfigReader.getProperty("password"));

    }

    @Then("Click on the Register Submit Button and success message should be displayed")
    public void clickOnTheRegisterSubmitButton() {
        login.myClick(login.registerSubmitBtn);

        login.verifyContainsText(login.registerControl, ConfigReader.getProperty("username"));
    }
}
