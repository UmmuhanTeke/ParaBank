package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.List;

public class LeftNav {

    public LeftNav() {PageFactory.initElements(GWD.getDriver(),this);}

    //-----------------------------MERVE---------------------------------

    @FindBy(linkText = "Bill Pay")
    public WebElement billPayButton;

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
    public  WebElement verifyAccountBox;

    @FindBy(name = "amount")
    public WebElement amountBBox;

    @FindBy(name = "fromAccountId")
    public List<WebElement> accountType;

    @FindBy(css = "input[value='Send Payment']")
    public WebElement sendPaymentButton;

    @FindBy(xpath = "//div[@id='billpayResult']/h1")
    public WebElement billPaymentComplete;

    @FindBy(css = "p>[id='payeeName']")
    public WebElement payeeNameControlText;

    @FindBy(css = "p>[id='amount']")
    public WebElement amountControlText;

    @FindBy(css = "p>[id='fromAccountId']")
    public WebElement accountControlText;


































































    //----------------------------ÜMMÜHAN-----------------------------------

    @FindBy(xpath = "//a[text()='Open New Account']")
    public WebElement openNewAccount;

    @FindBy(id = "type")
    public WebElement selectMenuAccountType;

    @FindBy(id = "fromAccountId")
    public WebElement selectMenuAccountNumber;

    @FindBy(xpath = "//input[@class='button']")
    public WebElement openNewAccountButton;

    @FindBy(xpath = "//div[@id='openAccountResult']//h1")
    public WebElement accountOpenedText;

    @FindBy(id = "newAccountId")
    public WebElement accountNumberClick;

    @FindBy(xpath = "//div[@id='accountDetails']/table/tbody/tr")
    public List<WebElement> accountDetails;

    @FindBy(xpath = "//*[text()='Funds Transfer Received']")
    public WebElement fundsTransferClick;

    @FindBy(xpath = "//select[@id='fromAccountId']/option")
    public WebElement selectAccountNumber;








































































    //--------------------------------SONGÜL-------------------------------------------


































}
