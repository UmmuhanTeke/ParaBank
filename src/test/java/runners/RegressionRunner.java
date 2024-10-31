package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/featureFiles/Register.feature",
                "src/test/java/featureFiles/Login.feature",
                "src/test/java/featureFiles/BillPay.feature",
                "src/test/java/featureFiles/NewBankAccount.feature",
                "src/test/java/featureFiles/LoanApplication.feature"},
        glue = {"stepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class RegressionRunner extends AbstractTestNGCucumberTests {
}