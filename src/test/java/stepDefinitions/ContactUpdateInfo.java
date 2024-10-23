package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LeftNav;

import java.util.List;

public class ContactUpdateInfo {
    LeftNav ln = new LeftNav();

    @When("The user clicks on the Update Contact Info")
    public void theUserClicksOnTheUpdateContactInfo(DataTable buttons) {
        List<String> links = buttons.asList();

        for (int i = 0; i < links.size(); i++) {
            ln.myClick(ln.getWebElement(links.get(i)));
        }
    }

    @Then("The user accesses the update profile page")
    public void theUserAccessesTheUpdateProfilePage() {
    }

    @And("The user views their information")
    public void theUserViewsTheirInformation() {
    }

    @And("The user updates the information they want")
    public void theUserUpdatesTheInformationTheyWant() {
    }

    @When("The user clicks on the Update Profile button")
    public void theUserClicksOnTheUpdateProfileButton() {
    }

    @Then("The user verifies the confirmation message on the Profile Updated page")
    public void theUserVerifiesTheConfirmationMessageOnTheProfileUpdatedPage() {
    }

    @And("The user clicks on the Log Out button")
    public void theUserClicksOnTheLogOutButton() {
    }

    @When("The user logs in to the site again")
    public void theUserLogsInToTheSiteAgain() {
    }

    @Then("The user clicks on the Update Contact Info button")
    public void theUserClicksOnTheUpdateContactInfoButton() {
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
