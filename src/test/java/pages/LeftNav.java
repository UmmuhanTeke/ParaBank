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

    @FindBy(xpath = "//*[@id='billpayResult']/h1")
    public WebElement billPaymentCompleteText;

    @FindBy(linkText = "Accounts Overview")
    public WebElement accountsOverviewButton;

    @FindBy(xpath = "//table[@id='accountTable']//td/a")
    public WebElement accountButton;

    @FindBy (xpath = "(//div[@id='rightPanel']//td)[6]")
    public WebElement controlBillPay;

    @FindBy(linkText = "Bill Payment to Electricity Bill")
    public WebElement billPayeeElectric;

    @FindBy(linkText = "Bill Payment to Water Bill")
    public  WebElement billPayeeWater;

    @FindBy(linkText = "Bill Payment to Natural Gas Bill")
    public WebElement billPayeeNatGas;





















































































































    //----------------------------ÜMMÜHAN-----------------------------------

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

    @FindBy(xpath = "(//div[@id='accountDetails']/table/tbody/tr/td)[4]")
    public WebElement accountName;

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

    @FindBy(xpath = "(//tr/td)[5]/input")
    public WebElement lastName;

    @FindBy(xpath = "//span[@id='lastName-error']")
    public WebElement lastNameError;

    @FindBy(xpath = "(//tr/td)[8]/input")
    public WebElement address;

    @FindBy(xpath = "//span[@id='street-error']")
    public WebElement addressError;

    @FindBy(xpath = "(//tr/td)[11]/input")
    public WebElement city;

    @FindBy(xpath = "//span[@id='city-error']")
    public WebElement cityError;

    @FindBy(css = "input[id='customer.firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@class='button']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@type='button']")
    public WebElement updateProfileButton;

    public WebElement getWebElement(String strWebElement){
        switch (strWebElement){
            case "openNewAccount": return this.openNewAccount;
            case "openNewAccountButton": return this.openNewAccountButton ;
            case "selectSavings": return this.selectSavings;
            case "selectChecking": return this.selectChecking;
            case "payeeNameBox":return this.payeeNameBox;
            case "updateContactInfoButton": return this.updateContactInfoButton;
            case "updateProfileButton": return this.updateProfileButton;
        }
        return null;
    }






















































































































































    //--------------------------------SONGÜL-------------------------------------------


































}
