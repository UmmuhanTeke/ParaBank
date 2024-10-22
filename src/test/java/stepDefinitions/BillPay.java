package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import pages.LeftNav;
import pages.ParentPage;

import java.util.Locale;
import java.util.Random;

public class BillPay {
    LeftNav element=new LeftNav();
    Faker faker=new Faker(new Locale("en-US"));
    Random random=new Random();

    @When("The user clicks on the Bill Pay Button")
    public void theUserClicksOnTheBillPayButton() {
        element.myClick(element.billPayButton);
        Assert.assertTrue(element.billPaymentText.getText().contains("Bill"));
    }

    @And("The user types the name as {string} in Payee Name box")
    public void theUserTypesTheNameAsInPayeeNameBox(String payeeName) {
        element.mySendKeys(element.payeeNameBox,payeeName);
    }

    @When("The user fills in the Billing Information in the customer data")
    public void theUserFillsInTheBillingInformationInTheCustomerData() {
        String accountNumber= RandomStringUtils.randomNumeric(4);

        element.mySendKeys(element.addressBox,faker.address().fullAddress());
        element.mySendKeys(element.cityBox,faker.address().city());
        element.mySendKeys(element.stateBox,faker.address().state());
        element.mySendKeys(element.zipCodeBox,faker.address().zipCode());
        element.mySendKeys(element.phoneNumberBox,faker.phoneNumber().cellPhone());
        element.mySendKeys(element.accountNumberBox,accountNumber);
        element.mySendKeys(element.verifyAccountBox,accountNumber);

        int randomAmount= random.nextInt(60,120);
        String randomAmountStr=String.valueOf(randomAmount);
        element.mySendKeys(element.amountBox,randomAmountStr);

        element.myClick(element.accountTypeButton);

        for (int i = 0; i < element.fromAccountList.size(); i++) {
            element.myClick(element.fromAccountList.get(0));
        }

        element.myClick(element.sendPaymentButton);

    }

    @Then("The user displays the successful pay message")
    public void theUserDisplaysTheSuccessfulPayMessage() {
    }

    @When("The user navigates to the Accounts Overview")
    public void theUserNavigatesToTheAccountsOverview() {
    }

    @Then("The user verifies the Transaction ID from Account Activity")
    public void theUserVerifiesTheTransactionIDFromAccountActivity() {
    }
}
