package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.NoSuchElementException;
import pages.Login;
import utilities.ConfigReader;
import utilities.GWD;

import java.util.Locale;

public class Register {

    Login login = new Login();
    Faker faker = new Faker(new Locale("en-US"));

    @Given("The user navigates to the ParaBank website")
    public void navigateToTheParaBankWebsite() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("The user clicks on the register button and fills the areas given in the customer data and clicks on the submit button")
    public void fillsTheAreasGivenInTheCustomerData() {
        do {
            login.myClick(login.registerBtn);

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

            login.myClick(login.registerSubmitBtn);

        } while (found());
    }

    public boolean found(){
        try {
          return login.usernameError.getText().contains("already");
        }catch (NoSuchElementException e ){
            return false;
        }
    }

    @Then("Success message should be displayed")
    public void clickOnTheRegisterSubmitButton() {
        login.verifyContainsText(login.registerControl, ConfigReader.getProperty("username"));
    }
}
