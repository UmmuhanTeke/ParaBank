package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LeftNav;

import java.util.List;

public class NewBankAccount {
    LeftNav ln=new LeftNav();

    @When("Click on the Element in Content")
    public void clickOnTheElementInContent(DataTable accountButton) {
        List<String> buttons=accountButton.asList();

        for (int i = 0; i < buttons.size(); i++) {
            ln.myClick(ln.getWebElement(buttons.get(i)));
        }
    }

    @And("The user is directed to the bank account creating page")
    public void theUserIsDirectedToTheBankAccountCreatingPage() {
     ln.verifyContainsText(ln.newAccountPageControl, "Open New Account");
    }

    @And("The user selects the {string} type from the drop-down menu")
    public void theUserSelectsTheTypeFromTheDropDownMenu(String arg0) {

    }

    @And("The user receives a warning that the new bank account should have a minimum balance")
    public void theUserReceivesAWarningThatTheNewBankAccountShouldHaveAMinimumBalance() {

    }

    @And("The user selects the accountNumber from the Drop-Down menu")
    public void theUserSelectsTheAccountNumberFromTheDropDownMenu() {
    }

    @And("Click on the Element in Button")
    public void clickOnTheElementInButton() {
    }

    @Then("The user confirms the successful creation of the new bank account")
    public void theUserConfirmsTheSuccessfulCreationOfTheNewBankAccount() {
    }
}
