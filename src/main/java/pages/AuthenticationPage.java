package pages;

import model.AccountDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage {

    private WebDriver driver;
    @FindBy(id = "email")
    private WebElement email;
    @FindBy(id = "passwd")
    private WebElement passwd;
    @FindBy(id = "SubmitLogin")
    private WebElement submitLogin;
    @FindBy(xpath = "//*[@title='Recover your forgotten password']")
    private WebElement recoverPass;

    public AuthenticationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public AuthenticationPage typeEmail(AccountDemo accountDemo) {
        email.sendKeys(accountDemo.getEmail());
        return this;
    }

    public AuthenticationPage typePassword(AccountDemo accountDemo) {
        passwd.sendKeys( );
        return this;
    }

    public MyAccountPage clickSingIn() {
        submitLogin.click();
        return new MyAccountPage(driver);
    }

    public void clickForgotPassword() {
        recoverPass.click();
    }


}
