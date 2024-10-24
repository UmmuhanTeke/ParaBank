package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.LeftNav;
import utilities.ConfigReader;

import java.util.List;

public class ContactUpdateInfo {
    LeftNav ln = new LeftNav();

    @When("The user clicks on the Update Contact Info")
    public void theUserClicksOnTheUpdateContactInfo(DataTable button) {
        List<String> links = button.asList();

        for (int i = 0; i < links.size(); i++) {
            ln.myClick(ln.getWebElement(links.get(i)));
        }
    }

    @Then("The user accesses the update profile page")
    public void theUserAccessesTheUpdateProfilePage() {
        ln.verifyContainsText(ln.updateProfileControl, "Update Profile");
    }

    @And("The user views their information")
    public void theUserViewsTheirInformation() {
        List<WebElement> details = ln.updateProfileDetails;
        for (WebElement info : details) {
            assert info.isDisplayed() : "The element is not visible: " + info.getText();
        }
    }

    @And("The user updates the information they want")
    public void theUserUpdatesTheInformationTheyWant() {
        ln.mySendKeys(ln.firstName, ConfigReader.getProperty("firstName"));
        ln.mySendKeys(ln.lastName, ConfigReader.getProperty("lastName"));
    }

    @When("The user clicks on the Update Profile button")
    public void theUserClicksOnTheUpdateProfileButton(DataTable button) {
        List<String> links = button.asList();

        for (int i = 0; i < links.size(); i++) {
            ln.myClick(ln.getWebElement(links.get(i)));
        }
    }

    @Then("The user verifies the confirmation message on the Profile Updated page")
    public void theUserVerifiesTheConfirmationMessageOnTheProfileUpdatedPage() {
        ln.wait.until(ExpectedConditions.textToBePresentInElement(ln.updateProfileText, "Your updated"));
        ln.verifyContainsText(ln.updateProfileText, "Your updated");
    }

    @And("The user clicks on the Log Out button")
    public void theUserClicksOnTheLogOutButton() {
        ln.myClick(ln.logOutButton);
    }

    @When("The user logs in to the site again")
    public void theUserLogsInToTheSiteAgain() {
        ln.mySendKeys(ln.username, ConfigReader.getProperty("username"));
        ln.mySendKeys(ln.password, ConfigReader.getProperty("password"));
        ln.myClick(ln.loginButton);
    }

    @When("The user clicks on the Update Contact Info button")
    public void theUserClicksOnTheUpdateContactInfoButton(DataTable button) {
        List<String> links = button.asList();

        for (int i = 0; i < links.size(); i++) {
            ln.myClick(ln.getWebElement(links.get(i)));
        }
    }

    @And("The user verifies the updated version of their contact information")
    public void theUserVerifiesTheUpdatedVersionOfTheirContactInformation() {
        Assert.assertTrue(ln.welcomeControl.getText().contains(ConfigReader.getProperty("firstName")));
        Assert.assertTrue(ln.welcomeControl.getText().contains(ConfigReader.getProperty("lastName")));
    }

    @And("The user deletes at least three optional fields from their contact information and leaves them blank")
    public void theUserDeletesAtLeastThreeOptionalFieldsFromTheirContactInformationAndLeavesThemBlank() {
        ln.myClearBox(ln.address);
        ln.myClearBox(ln.city);
        ln.myClearBox(ln.state);
    }

    @Then("The user verifies the warning messages for the fields left blank")
    public void theUserVerifiesTheWarningMessagesForTheFieldsLeftBlank() {
        ln.verifyContainsText(ln.addressError, "required");
        ln.verifyContainsText(ln.cityError, "required");
        ln.verifyContainsText(ln.stateError, "required");
    }
}
