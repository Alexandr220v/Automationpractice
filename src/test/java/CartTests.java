import io.qameta.allure.Description;
import model.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.CreateAccountPage;
import pages.NavigationPage;
import pages.RegistrationPage;

import javax.inject.Inject;

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

@Listeners(TestListenerAdapter.class)
public class CartTests extends BaseTest {

    @Inject
    private CreateAccountPage createAccountPage;
    @Inject
    private RegistrationPage registrationPage;
    @Inject
    private NavigationPage navigationPage;
    @Inject
    private MainPage mainPage;

    @Test(groups = {"smoke","regression"})
    @Description("Test Description: Login test with wrong username and wrong password.")
    public void verifyRegistrationNewAccount() {
        Account account = new Account.AccountBuilder()
                .withGender("Ms.")
                .withFirstCustomerName("Jack")
                .withLastCustomerName("Daniels")
                .withEmail("Jack.Daniels@gmail.com")
                .withPass("Jack.Daniels")
                .withDay("3")
                .withMonth("4")
                .withYear("1985")
                .withFirstName("Jack")
                .withLastName("Daniels")
                .withCountry("")
                .withCompany("")
                .withAddress1("adress1")
                .withAddress2("adress2")
                .withCity("Kyiv")
                .withState("Alabama")
                .withPostcode("11111")
                .withCountry("United States")
                .withPhone_mobile("+8052635289")
                .withAlias("alias")
                .create();
        navigationPage.openSignInPage();
        createAccountPage.typeEmail("Jack.Daniels@gmail.com");
        createAccountPage.clickCreateAccount();
        registrationPage.fillRegistrationForm(account);
        registrationPage.clickRegister();
    }

    @Test
    public void test1() {
        mainPage.searchItem("Blouse");
        mainPage.pressSubmit();
        mainPage.switchToListView();
        navigationPage.openSignInPage();

    }


}
