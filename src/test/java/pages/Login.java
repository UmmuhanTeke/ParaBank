package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class Login extends ParentPage {
    public Login() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Register")
    public WebElement registerBtn;

    @FindBy(id = "customer.firstName")
    public WebElement firstName;

    @FindBy(id = "customer.lastName")
    public WebElement lastName;

    @FindBy(id = "customer.address.street")
    public WebElement address;

    @FindBy(id = "customer.address.city")
    public WebElement city;

    @FindBy(id = "customer.address.state")
    public WebElement state;

    @FindBy(id = "customer.address.zipCode")
    public WebElement zipCode;

    @FindBy(id = "customer.phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id = "customer.ssn")
    public WebElement ssn;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement registerSubmitBtn;

    @FindBy(id = "customer.username")
    public WebElement registerUsername;

    @FindBy(id = "customer.password")
    public WebElement registerPassword;

    @FindBy(id = "repeatedPassword")
    public WebElement confirmPassword;

    @FindBy(id = "customer.username.errors")
    public WebElement usernameError;

    @FindBy(css = "[id='rightPanel']>h1")
    public WebElement registerControl;

    @FindBy(css = "[class='login']>input[name='username']")
    public WebElement loginUsername;

    @FindBy(css = "[class='login']>input[name='password']")
    public WebElement loginPassword;

    @FindBy(css = "[class='login']>input[type='submit']")
    public WebElement loginBtn;

    @FindBy(css = "[id='leftPanel']>h2")
    public WebElement loginControl;

    @FindBy(css = "[class='error']")
    public WebElement errorMessage;
}
