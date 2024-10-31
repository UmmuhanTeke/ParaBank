package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.LeftNav;
import utilities.ConfigReader;

import java.util.List;

public class Transfer_Funds {
    LeftNav elements = new LeftNav();

    @When("The user clicks on transfer Funds and selects accounts")
    public void the_user_clicks_on_transfer_funds_and_selects_accounts(DataTable dataTable) {
        elements.myClick((WebElement) elements.transFerFunds);
    }

    @When("The user selects sender account as fromAccount and the receiver account as toAccount")
    public void the_user_selects_sender_account_as_from_account_and_the_receiver_account_as_to_account() {
        List<WebElement> fromAccountList = elements.fromAccount;
        List<WebElement> toAccountList = elements.toAccount;
        for (int i = 0; i < fromAccountList.size(); i++) {
            elements.fromAccount.get(0);
            for (int j = 0; j < toAccountList.size(); j++) {
                elements.toAccount.get(1);
            }
        }
    }

    @When("The user clicks on the amount field and enters an amount")
    public void the_user_clicks_on_the_amount_field_and_enters_an_amount(DataTable dataTable) {
        elements.myClick(elements.amount);
        elements.mySendKeys(elements.amount, ConfigReader.getProperty("amount"));
    }

    @When("The user navigates to the transfer button")
    public void the_user_navigates_to_the_transfer_button() {
        List<WebElement> transferButton = elements.transFer;

        for (int i = 0; i < transferButton.size(); i++) {
            elements.myClick(elements.transFer.get(i));
        }
    }

    @Then("The user checks the amount and receiver account in the confirmation message")
    public void the_user_checks_the_amount_and_receiver_account_in_the_confirmation_message() {
        elements.verifyContainsText(elements.confirmationMessage, "Transfer Complete!!");
    }

    @When("The user clicks on find transactions in the left navigation menu")
    public void the_user_clicks_on_find_transactions_in_the_left_navigation_menu(DataTable dataTable) {
        elements.myClick(elements.accountOverview);
        elements.myClick(elements.fundsTransferSent);
        elements.verifyContainsText(elements.transactionDetails,"Transaction Details");
    }

    @When("The user saves the transaction id from the transfer confirmation message")
    public void the_user_saves_the_transaction_id_from_the_transfer_confirmation_message() {
        elements.myClick(elements.findTransactions);
    }

    @When("The user enters the saved transaction id and clicks the button")
    public void the_user_enters_the_saved_transaction_id_and_clicks_the_button(DataTable dataTable) {
        elements.mySendKeys(elements.findByTransactionID, " ");
        elements.myClick(elements.findTransactionsButton);
    }

    @Then("The user verifies the transferred amount in the transaction details")
    public void the_user_verifies_the_transferred_amount_in_the_transaction_details() {
        elements.verifyContainsText(elements.accountDetails, "Account Details");
    }
}