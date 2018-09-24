import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pages.CreateAccountPage;
import pages.NavigationPage;
import pages.RegistrationPage;

/**
 * Created by ПК on 22.02.2018.
 * <p>
 * 1) Запустить бразузер
 * 2) Открыть http://automationpractice.com/index.php
 * 3) Ввести Blouse в поле поиска
 * 4) НАжать Enter
 * 5) Добавить товар в корзину
 * <p>
 * Проверить сумма покупки товара отобраажтеся  $ 29,00
 */
public class CartTests  extends BaseTest {

    private CreateAccountPage createAccountPage ;
    private RegistrationPage registrationPage;
    private NavigationPage navigationPage;

    @Test
    public void verifyRegistrationNewAccount() {
        navigationPage = new NavigationPage(driver);
        navigationPage.openSignInPage();
        createAccountPage = new CreateAccountPage(driver);
        createAccountPage.inputEmail("fdasfasd@fdafsd.com");
        createAccountPage.clickCreateAccount();
        registrationPage= new RegistrationPage(driver);
        registrationPage.fillRegistrationForm(registrationPage.getAccount());
        registrationPage.clickRegister();
    }



    @AfterMethod (alwaysRun = true)
    public void closeDown() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
