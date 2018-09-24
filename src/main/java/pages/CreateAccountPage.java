package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by ПК on 21.09.2018.
 */
public class CreateAccountPage {

    private WebDriver driver;

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputEmail(String email) {
        driver.findElement(By.id("email_create")).sendKeys(email);
    }

    public void clickCreateAccount() {
        driver.findElement(By.id("SubmitCreate")).click();
    }


    private void createNewAccount(String email) {
        inputEmail(email);
        clickCreateAccount();
    }
}
