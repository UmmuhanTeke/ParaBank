package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.LeftNav;

import java.util.List;

public class LoanApplication {
    LeftNav elements = new LeftNav();

    @When("The user clicks on Request Loan button")
    public void theUserClicksOnRequestLoanButton(DataTable dtButton) {
        List<String> buttons = dtButton.asList();

        for (int i = 0; i < buttons.size(); i++) {
            elements.myClick( elements.getWebElement(buttons.get(i)) );
        }
        Assert.assertTrue(elements.requestLoanButton.getText().contains("Loan"));
        Assert.assertTrue(elements.requestLoanButton.isDisplayed());
    }

    @And("The user types Loan Amount Box and DownPaymentBox")
    public void theUserTypesLoanAmountBoxAndDownPaymentBox(DataTable textAndBox) {
        List<List<String>> sendKeysList = textAndBox.asLists();
        for (int i = 0; i < sendKeysList.size(); i++) {
            WebElement box = elements.getWebElement(sendKeysList.get(i).get(0));
            elements.mySendKeys(box, sendKeysList.get(i).get(1));
        }
    }

    @And("The user selects the account number from the Drop-Down menu")
    public void theUserSelectsTheAccountNumberFromTheDropDownMenu() {
        for (int i = 0; i < elements.fromAccountList.size(); i++) {
            elements.myClick(elements.fromAccountList.get(0));
        }
    }

    @And("The user clicks on the Apply Now button")
    public void theUserClicksOnTheApplyNowButton(DataTable applyBtn) {
        List<String> buttons = applyBtn.asList();
        for (int i = 0; i < buttons.size(); i++) {
            elements.myClick(elements.getWebElement(buttons.get(i)));
        }
    }

    @Then("The user verifies the confirmation message")
    public void theUserVerifiesTheConfirmationMessage() {
        elements.wait.until(ExpectedConditions.visibilityOf(elements.loanReqProcessText));
        elements.verifyContainsText(elements.loanReqProcessText,"Loan");

        if (elements.loanReqProcessText.isDisplayed()) {
            elements.verifyContainsText(elements.statusApprovedText, "Approved");
            elements.verifyContainsText(elements.approvedText, "Congratulations");
        }
    }

    @And("The user clicks on new account number")
    public void theUserClicksOnNewAccountNumber() {
        elements.myClick(elements.newAccountNumberBtn);
    }

    @Then("The user verifies the details of the Account Details")
    public void theUserVerifiesTheDetailsOfTheAccountDetails() {
        elements.wait.until(ExpectedConditions.visibilityOf(elements.accountDetailsText));
        elements.verifyContainsText(elements.accountDetailsText, "Details");

        if (elements.accountDetailsText.isDisplayed()) {
            elements.verifyContainsText(elements.loanAccountText, "LOAN");
            elements.verifyContainsText(elements.balanceText, "400");
        }

        elements.wait.until(ExpectedConditions.visibilityOf(elements.noTransactionText));
        elements.verifyContainsText(elements.noTransactionText, "No");
    }

    @Then("The user displays the denied message")
    public void theUserDisplaysTheDeniedMessage() {
        elements.wait.until(ExpectedConditions.visibilityOf(elements.loanReqProcessText));
        elements.verifyContainsText(elements.loanReqProcessText,"Loan");

        if (elements.loanReqProcessText.isDisplayed()){
            elements.verifyContainsText(elements.deniedText,"Denied");
            elements.wait.until(ExpectedConditions.visibilityOf(elements.errorMessage));
            elements.verifyContainsText(elements.errorMessage, "We cannot grant");
        }
    }
}