package frameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SeleniumActions;

public class LoginPage {

     WebDriver driver;
    SeleniumActions seleniumActions;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        seleniumActions=new SeleniumActions(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement userInputField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInputField;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginbutton;

    public void login(String userName,String password){
        seleniumActions.enterValue(userInputField,userName);
        seleniumActions.enterValue(passwordInputField,password);
        seleniumActions.clickOnElement(loginbutton);
    }

}
