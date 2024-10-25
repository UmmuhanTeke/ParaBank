package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import pages.LeftNav;

import java.util.List;

public class TransferFunds {
    LeftNav ln = new LeftNav();
    String randomAmount = RandomStringUtils.randomNumeric(3);

    @When("The user clicks on transfer funds from the menu")
    public void theUserClicksOnTransferFundsFromTheMenu(DataTable button) {
        List<String> links = button.asList();

        for (int i = 0; i < links.size(); i++) {
            ln.myClick(ln.getWebElement(links.get(i)));
        }
    }

    @Then("The user should be redirected to the fund transfer page")
    public void theUserShouldBeRedirectedToTheFundTransferPage() {
        ln.verifyContainsText(ln.transferFundsControl, "Amount");
    }

    @And("The user selects the following accounts for the transfer")
    public void theUserSelectsTheFollowingAccountsForTheTransfer() {
        for (int i = 0; i < ln.fromAccountSlc.size(); i++) {
            ln.myClick(ln.fromAccountSlc.get(0));
        }

        for (int i = 0; i < ln.toAccountSlc.size(); i++) {
            ln.myClick(ln.fromAccountSlc.get(0));
        }
    }

    @When("The user enters the transfer amount")
    public void theUserEntersTheTransferAmount() {
        ln.mySendKeys(ln.amountText, randomAmount);
    }

    @And("The user clicks the transfer button")
    public void theUserClicksTheTransferButton(DataTable button) {
        List<String> links = button.asList();

        for (int i = 0; i < links.size(); i++) {
            ln.myClick(ln.getWebElement(links.get(i)));
        }
    }

    @Then("The user verifies the transfer amount in the confirmation message.")
    public void theUserVerifiesTheTransferAmountInTheConfirmationMessage() {
        ln.verifyContainsText(ln.amountControl, randomAmount);
    }

    @When("The user clicks on accounts overview")
    public void theUserClicksOnAccountsOverview(DataTable button) {
        List<String> links = button.asList();

        for (int i = 0; i < links.size(); i++) {
            ln.myClick(ln.getWebElement(links.get(i)));
        }
    }

    @And("The user clicks on the receiver account number")
    public void theUserClicksOnTheReceiverAccountNumber() {
        ln.myClick(ln.tabloAmount);
    }

    @Then("The user should see the transfer listed in the account details")
    public void theUserShouldSeeTheTransferListedInTheAccountDetails() {
        ln.verifyContainsText(ln.accountDetails, "Details");
    }
}
