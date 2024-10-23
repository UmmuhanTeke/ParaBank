package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import pages.LeftNav;
import utilities.GWD;
import java.util.List;
import java.util.Locale;

public class BillPay {
    LeftNav element = new LeftNav();
    Faker faker = new Faker(new Locale("en-US"));

    @When("The user clicks on the Bill Pay Button")
    public void theUserClicksOnTheBillPayButton() {
        element.myClick(element.billPayButton);
        Assert.assertTrue(element.billPaymentText.getText().contains("Bill"));
    }

    @When("The user fills in the Billing Information for the Electricity Bill")
    public void theUserFillsInTheBillingInformationForTheElectricityBill() {
        String accountNumber = RandomStringUtils.randomNumeric(4);

        element.mySendKeys(element.addressBox, faker.address().fullAddress());
        element.mySendKeys(element.cityBox, faker.address().city());
        element.mySendKeys(element.stateBox, faker.address().state());
        element.mySendKeys(element.zipCodeBox, faker.address().zipCode());
        element.mySendKeys(element.phoneNumberBox, faker.phoneNumber().cellPhone());
        element.mySendKeys(element.accountNumberBox, accountNumber);
        element.mySendKeys(element.verifyAccountBox, accountNumber);
        element.mySendKeys(element.amountBox, "85");

        element.myClick(element.accountTypeButton);
        for (int i = 0; i < element.fromAccountList.size(); i++) {
            element.myClick(element.fromAccountList.get(0));
        }
        element.myClick(element.sendPaymentButton);
    }

    @Then("The user displays the successful pay message")
    public void theUserDisplaysTheSuccessfulPayMessage() {
        if (element.payingControlText.isDisplayed()) {
            System.out.println(element.payingControlText.getAttribute("innerHTML").contains(" was successful"));
            Assert.assertTrue(element.payingControlText.getAttribute("innerHTML").contains(" was successful"));
        }
    }

    @When("The user navigates to the Accounts Overview")
    public void theUserNavigatesToTheAccountsOverview() {
        element.myClick(element.accountsOverviewButton);
        element.jsClick(element.accountButton);
    }

    @When("The user fills in the Billing Information for the Water Bill")
    public void theUserFillsInTheBillingInformationForTheWaterBill() {
        String accountNumber = RandomStringUtils.randomNumeric(4);

        element.mySendKeys(element.addressBox, faker.address().fullAddress());
        element.mySendKeys(element.cityBox, faker.address().city());
        element.mySendKeys(element.stateBox, faker.address().state());
        element.mySendKeys(element.zipCodeBox, faker.address().zipCode());
        element.mySendKeys(element.phoneNumberBox, faker.phoneNumber().cellPhone());
        element.mySendKeys(element.accountNumberBox, accountNumber);
        element.mySendKeys(element.verifyAccountBox, accountNumber);
        element.mySendKeys(element.amountBox, "100");

        element.myClick(element.accountTypeButton);
        for (int i = 0; i < element.fromAccountList.size(); i++) {
            element.myClick(element.fromAccountList.get(0));
        }
        element.myClick(element.sendPaymentButton);
    }

    @When("The user fills in the Billing Information for the Natural Gas Bill")
    public void theUserFillsInTheBillingInformationForTheNaturalGasBill() {
        String accountNumber = RandomStringUtils.randomNumeric(4);

        element.mySendKeys(element.addressBox, faker.address().fullAddress());
        element.mySendKeys(element.cityBox, faker.address().city());
        element.mySendKeys(element.stateBox, faker.address().state());
        element.mySendKeys(element.zipCodeBox, faker.address().zipCode());
        element.mySendKeys(element.phoneNumberBox, faker.phoneNumber().cellPhone());
        element.mySendKeys(element.accountNumberBox, accountNumber);
        element.mySendKeys(element.verifyAccountBox, accountNumber);
        element.mySendKeys(element.amountBox, "60");

        element.myClick(element.accountTypeButton);
        for (int i = 0; i < element.fromAccountList.size(); i++) {
            element.myClick(element.fromAccountList.get(0));
        }
        element.myClick(element.sendPaymentButton);
    }

    @And("The user types the name in Payee Name box")
    public void theUserTypesTheNameInPayeeNameBox(DataTable dtPayeeName) {
        List<String> payeeNameList = dtPayeeName.asList();

        for (int i = 0; i < payeeNameList.size(); i++) {
            element.mySendKeys(element.payeeNameBox, payeeNameList.get(i));
        }
    }

    @Then("The user verifies the details of the Bill Pay information to the Electricity Bill")
    public void theUserVerifiesTheDetailsOfTheBillPayInformationToTheElectricityBill() {
        element.jsClick(element.billPayeeElectric);
        Assert.assertTrue(element.controlBillPay.getText().contains("Electricity"));
        GWD.getDriver().navigate().back();
    }

    @Then("The user verifies the details of the Bill Pay information to the Water Bill")
    public void theUserVerifiesTheDetailsOfTheBillPayInformationToTheWaterBill() {
        element.jsClick(element.billPayeeWater);
        Assert.assertTrue(element.controlBillPay.getText().contains("Water"));
        GWD.getDriver().navigate().back();
    }

    @Then("The user verifies the details of the Bill Pay information to the Natural Gas Bill")
    public void theUserVerifiesTheDetailsOfTheBillPayInformationToTheNaturalGasBill() {
        element.jsClick(element.billPayeeNatGas);
        Assert.assertTrue(element.controlBillPay.getText().contains("Natural Gas"));
        GWD.getDriver().navigate().back();
    }
}
