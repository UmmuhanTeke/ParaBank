package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.List;

public class LeftNav extends ParentPage {

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Bill Pay")
    public WebElement billPayButton;

    @FindBy(xpath = "//h1[.='Bill Payment Service']")
    public WebElement billPaymentText;

    @FindBy(name = "payee.name")
    public WebElement payeeNameBox;

    @FindBy(name = "payee.address.street")
    public WebElement addressBox;

    @FindBy(name = "payee.address.city")
    public WebElement cityBox;

    @FindBy(name = "payee.address.state")
    public WebElement stateBox;

    @FindBy(name = "payee.address.zipCode")
    public WebElement zipCodeBox;

    @FindBy(name = "payee.phoneNumber")
    public WebElement phoneNumberBox;

    @FindBy(name = "payee.accountNumber")
    public WebElement accountNumberBox;

    @FindBy(name = "verifyAccount")
    public WebElement verifyAccountBox;

    @FindBy(name = "amount")
    public WebElement amountBox;

    @FindBy(name = "fromAccountId")
    public WebElement accountTypeButton;

    @FindBy(xpath = "(//select[@name='fromAccountId'])/option")
    public List<WebElement> fromAccountList;

    @FindBy(css = "input[value='Send Payment']")
    public WebElement sendPaymentButton;

    @FindBy(xpath = "//*[@id='billpayResult']/h1")
    public WebElement billPaymentCompleteText;

    @FindBy(linkText = "Accounts Overview")
    public WebElement accountsOverviewButton;

    @FindBy(xpath = "//table[@id='accountTable']//td/a")
    public WebElement accountButton;

    @FindBy(xpath = "(//div[@id='rightPanel']//td)[6]")
    public WebElement controlBillPay;

    @FindBy(linkText = "Bill Payment to Electricity Bill")
    public WebElement billPayeeElectric;

    @FindBy(linkText = "Bill Payment to Water Bill")
    public WebElement billPayeeWater;

    @FindBy(linkText = "Bill Payment to Natural Gas Bill")
    public WebElement billPayeeNatGas;

    @FindBy(linkText = "Request Loan")
    public WebElement requestLoanButton;

    @FindBy(xpath = "//input[@id='amount']")
    public WebElement loanAmountBox;

    @FindBy(xpath = "//input[@id='downPayment']")
    public WebElement downPaymentBox;

    @FindBy(xpath = "//input[@value='Apply Now']")
    public WebElement applyNowButton;

    @FindBy(xpath = "//*[@id='requestLoanResult']/h1")
    public WebElement loanReqProcessText;

    @FindBy(xpath = "//td[text()='Approved']")
    public WebElement statusApprovedText;

    @FindBy(xpath = "//div[@id='loanRequestApproved']/p")
    public WebElement approvedText;

    @FindBy(xpath = "//a[@id='newAccountId']")
    public WebElement newAccountNumberBtn;

    @FindBy(xpath = "//div[@id='accountDetails']/h1")
    public WebElement accountDetailsText;

    @FindBy(xpath = "//*[text()='LOAN']")
    public WebElement loanAccountText;

    @FindBy(xpath = "//td[@id='balance']")
    public WebElement balanceText;

    @FindBy(xpath = "//p[@id='noTransactions']/b")
    public WebElement noTransactionText;

    @FindBy(xpath = "//td[text()='Denied']")
    public WebElement deniedText;

    @FindBy(xpath = "(//p[@class='error'])[1]")
    public WebElement errorMessage;

    @FindBy(xpath = "//a[text()='Open New Account']")
    public WebElement openNewAccount;

    @FindBy(xpath = "(//*[text()='Open New Account'])[2]")
    public WebElement newAccountPageControl;

    @FindBy(xpath = "//*[text()='CHECKING']")
    public WebElement selectChecking;

    @FindBy(xpath = "//*[text()='SAVINGS']")
    public WebElement selectSavings;

    @FindBy(xpath = "//select[@id='type']")
    public WebElement selectMenu;

    @FindBy(xpath = "(//div[@id='openAccountForm']/form/p/b)[2]")
    public WebElement minBalanceText;

    @FindBy(xpath = "//input[@class='button']")
    public WebElement openNewAccountButton;

    @FindBy(xpath = "//div[@id='openAccountResult']//p")
    public WebElement accountOpenedText;

    @FindBy(xpath = "//a[@id='newAccountId']")
    public WebElement accountNumberClick;

    @FindBy(xpath = "(//div[@id='accountDetails']//tr/td)[4]")
    public WebElement accountType;

    @FindBy(xpath = "//select[@id='fromAccountId']/option")
    public List<WebElement> selectAccountNumber;

    @FindBy(xpath = "//*[text()='Update Contact Info']")
    public WebElement updateContactInfoButton;

    @FindBy(xpath = "//div[@id='updateProfileResult']/p")
    public WebElement updateProfileText;

    @FindBy(xpath = "//div[@id='updateProfileForm']/h1")
    public WebElement updateProfileControl;

    @FindBy(css = "[class='smallText']")
    public WebElement welcomeControl;

    @FindBy(xpath = "//table[@class='form2']/tbody/tr")
    public List<WebElement> updateProfileDetails;

    @FindBy(xpath = "//*[text()='Log Out']")
    public WebElement logOutButton;

    @FindBy(css = "[id='customer.address.state']")
    public WebElement state;

    @FindBy(id = "state-error")
    public WebElement stateError;

    @FindBy(xpath = "(//tr/td)[8]/input")
    public WebElement address;

    @FindBy(id = "street-error")
    public WebElement addressError;

    @FindBy(xpath = "(//tr/td)[11]/input")
    public WebElement city;

    @FindBy(id = "city-error")
    public WebElement cityError;

    @FindBy(css = "input[id='customer.firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    @FindBy(css = "input[id='customer.lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@class='button']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@type='button']")
    public WebElement updateProfileButton;

    @FindBy(linkText = "Transfer Funds")
    public WebElement transferFunds;

    @FindBy(xpath = "//form[@id='transferForm']/p/b")
    public WebElement transferFundsControl;

    @FindBy(linkText = "Accounts Overview")
    public WebElement accountsOverview;

    @FindBy(css = "input[id='amount']")
    public WebElement amountText;

    @FindBy(css = "input[value='Transfer']")
    public WebElement transferBtn;

    @FindBy(css = "select[id='fromAccountId'] option")
    public List<WebElement> fromAccountSlc;

    @FindBy(css = "select[id='toAccountId'] option")
    public List<WebElement> toAccountSlc;

    @FindBy(xpath = "//span[@id='amountResult']")
    public WebElement amountControl;

    @FindBy(xpath = "//table[@id='accountTable']/tbody/tr/td/a")
    public WebElement tabloAmount;

    @FindBy(xpath = "//div[@id='accountDetails']/h1")
    public WebElement accountDetails;

    public WebElement getWebElement(String strWebElement) {
        switch (strWebElement) {
            case "openNewAccount":
                return this.openNewAccount;
            case "openNewAccountButton":
                return this.openNewAccountButton;
            case "selectSavings":
                return this.selectSavings;
            case "selectChecking":
                return this.selectChecking;
            case "payeeNameBox":
                return this.payeeNameBox;
            case "updateContactInfoButton":
                return this.updateContactInfoButton;
            case "updateProfileButton":
                return this.updateProfileButton;
            case "requestLoanButton":
                return this.requestLoanButton;
            case "loanAmountBox":
                return this.loanAmountBox;
            case "downPaymentBox":
                return this.downPaymentBox;
            case "applyNowButton":
                return this.applyNowButton;
            case "transferFunds":
                return this.transferFunds;
            case "accountsOverview":
                return this.accountsOverview;
            case "amountText":
                return this.amountText;
            case "transferBtn":
                return this.transferBtn;
        }
        return null;
    }

    @FindBy(xpath = "//a[text()='Transfer Funds']")
    public WebElement transFerFunds;

    @FindBy(id = "amount")
    public WebElement amount;

    @FindBy(xpath = "(//select[@class='input'])[1]")
    public List<WebElement> fromAccount;

    @FindBy(xpath = "(//select[@class='input'])[2]")
    public List<WebElement> toAccount;

    @FindBy(xpath = "//input[@class='button']")
    public List<WebElement> transFer;

    @FindBy(xpath = "(//h1[@class='title'])[3]")
    public WebElement confirmationMessage;

    @FindBy(xpath = "//*[text()='Accounts Overview']")
    public WebElement accountOverview;

    @FindBy(xpath = "(//*[text()='Funds Transfer Sent']")
    public WebElement fundsTransferSent;

    @FindBy(xpath = "//h1[text()='Transaction Details']")
    public WebElement transactionDetails;

    @FindBy(xpath = "//*[text()='Find Transactions']")
    public WebElement findTransactions;

    @FindBy(id = "['transactionId']")
    public WebElement findByTransactionID;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement findTransactionsButton;
}