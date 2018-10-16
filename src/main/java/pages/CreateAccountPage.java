package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.Log;

import javax.inject.Inject;

/**
 * Created by ПК on 21.09.2018.
 */
public class CreateAccountPage {

    private WebDriver driver;

    @Inject
    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void typeEmail(String email) {
        Log.LOG.info("Typing email: " + email);
        driver.findElement(By.id("email_create")).sendKeys(email);
    }

    public void typeEmailCreated(String email) {
        Log.LOG.info("Typing email: " + email);
        driver.findElement(By.id("email")).sendKeys(email);
    }

    public void clickCreateAccount() {
        Log.LOG.info("Clicking on submit account");
        driver.findElement(By.id("SubmitCreate")).click();
    }


    private void createNewAccount(String email) {
        typeEmail(email);
        clickCreateAccount();
    }
    @Step
    public void loginIntoAccount(String email, String password) {
        typeEmailCreated(email);
        typePassword(password);
        clickSignIn();
    }
    @Step
    private void clickSignIn() {

        driver.findElement(By.id("SubmitLogin")).click();
    }
    @Step
    private void typePassword(String password) {

        driver.findElement(By.id("passwd")).sendKeys(password);
    }
    @Step
    public String getValidationMessage() {
        String message = driver.findElement(By.id("passwd")).getText();
        return message;
    }
}
