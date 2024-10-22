package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.LeftNav;

import java.util.List;

public class NewBankAccount {
    LeftNav ln = new LeftNav();

    @When("Click on the Element in Content")
    public void clickOnTheElementInContent() {
        ln.myClick(ln.openNewAccount);
        Assert.assertTrue(ln.openNewAccount.getText().contains("Open New"));
    }

    @And("The user is directed to the bank account creating page")
    public void theUserIsDirectedToTheBankAccountCreatingPage() {
        ln.verifyContainsText(ln.newAccountPageControl, "Open New Account");
    }

    @And("The user selects the {string} type from the drop-down menu")
    public void theUserSelectsTheTypeFromTheDropDownMenu(String accountType) {
        ln.selectByText(ln.selectMenuAccountType, accountType);
    }

    @And("The user receives a warning that the new bank account should have a minimum balance")
    public void theUserReceivesAWarningThatTheNewBankAccountShouldHaveAMinimumBalance() {
        ln.verifyContainsText(ln.minBalanceText, "$200.00");
        System.out.println("ln.minBalanceText.getText() = " + ln.minBalanceText.getText());
    }

    @And("The user selects the accountNumber from the Drop-Down menu")
    public void theUserSelectsTheAccountNumberFromTheDropDownMenu() {
        List<WebElement> options = ln.selectAccountNumber;
        if (!options.isEmpty()) {
            options.get(0).click();
        } else {
            System.out.println("No account number");
        }
    }

    @And("Click on the Element in Button")
    public void clickOnTheElementInButton() {
        ln.myClick(ln.openNewAccountButton);
    }

    @Then("The user confirms the successful creation of the new bank account")
    public void theUserConfirmsTheSuccessfulCreationOfTheNewBankAccount() {
        ln.verifyContainsText(ln.accountOpenedText, "account is now open");
    }
}
