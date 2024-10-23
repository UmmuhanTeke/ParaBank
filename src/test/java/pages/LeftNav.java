package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.List;

public class LeftNav extends ParentPage{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    //-----------------------------MERVE---------------------------------

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

    @FindBy(xpath = "//span[@id='payeeName']")
    public WebElement payingControlText;

    @FindBy(linkText = "Accounts Overview")
    public WebElement accountsOverviewButton;

    @FindBy(xpath = "//table[@id='accountTable']//td/a")
    public List<WebElement> accountList;

    @FindBy(xpath = "//table[@id='transactionTable']//a")
    public List<WebElement>transactionList;

    @FindBy (xpath = "//h1[text()='Transaction Details']")
    public WebElement transactionDetailsText;






















































































    //----------------------------ÜMMÜHAN-----------------------------------

























































































































































    //--------------------------------SONGÜL-------------------------------------------


































}
