package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.LeftNav;

import java.util.List;

public class NewBankAccount {
    LeftNav ln = new LeftNav();

    @When("The user clicks on the Element in Content")
    public void clickOnTheElementInContent(DataTable buttons) {
        List<String> links = buttons.asList();

        for (int i = 0; i < links.size(); i++) {
            ln.myClick(ln.getWebElement(links.get(i)));
        }
    }

    @Then("The user is directed to the bank account creating page")
    public void theUserIsDirectedToTheBankAccountCreatingPage() {
        ln.verifyContainsText(ln.newAccountPageControl, "Open New Account");
    }

    @And("The user selects the {string} type from the drop-down menu")
    public void theUserSelectsTheTypeFromTheDropDownMenu(String accountType) {
        ln.selectByText(ln.selectMenu, accountType);
    }

    @And("The user receives a warning that the new bank account should have a minimum balance")
    public void theUserReceivesAWarningThatTheNewBankAccountShouldHaveAMinimumBalance() {
        ln.verifyContainsText(ln.minBalanceText, " minimum");
    }

    @And("The user selects the accountNumber from the Drop-Down menu")
    public void theUserSelectsTheAccountNumberFromTheDropDownMenu() {
        for (int i = 0; i < ln.selectAccountNumber.size(); i++) {
            ln.myClick(ln.selectAccountNumber.get(0));
        }
    }

    @Then("The user confirms the successful creation of the new bank account")
    public void theUserConfirmsTheSuccessfulCreationOfTheNewBankAccount() {
        ln.verifyContainsText(ln.accountOpenedText, "Congratulations");
    }

    @And("The user clicks on the generated account number.")
    public void theUserClicksOnTheGeneratedAccountNumber() {
        ln.myClick(ln.accountNumberClick);
    }

    @Then("The user verifies their information in the account details {string}")
    public void theUserVerifiesTheirInformationInTheAccountDetails(String text) {
        ln.wait.until(ExpectedConditions.textToBePresentInElement(ln.accountType, text));
        ln.verifyContainsText(ln.accountType, text);
    }
}