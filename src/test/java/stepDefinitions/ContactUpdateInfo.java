package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
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
        System.out.println(ln.updateProfileControl.getText());
        ln.verifyContainsText(ln.updateProfileControl, "Update Profile");
    }

    @And("The user views their information")
    public void theUserViewsTheirInformation() {
        List<WebElement> details = ln.updateProfileDetails;
        for (WebElement info: details){
            assert info.isDisplayed() : "Element görünür değil: " + info.getText();
        }
    }

    @And("The user updates the information they want")
    public void theUserUpdatesTheInformationTheyWant() {
        ln.mySendKeys(ln.lastName, "Teke");
        ln.mySendKeys(ln.address, "Mimar Sinan Mahallesi");
        ln.mySendKeys(ln.city, "Aydın");
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
        Assert.assertTrue(ln.updateProfileControl.isDisplayed());
        ln.verifyContainsText(ln.updateProfileControl, "Your updated");
        System.out.println("ln.updateProfileControl.getText() = " + ln.updateProfileControl.getText());
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
    }

    @And("The user deletes at least three optional fields from their contact information and leaves them blank")
    public void theUserDeletesAtLeastThreeOptionalFieldsFromTheirContactInformationAndLeavesThemBlank() {
    }

    @Then("The user verifies the warning messages for the fields left blank")
    public void theUserVerifiesTheWarningMessagesForTheFieldsLeftBlank() {
    }

}
