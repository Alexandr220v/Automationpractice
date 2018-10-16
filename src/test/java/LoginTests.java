import data.RegistationPageDataProvider;
import model.Account;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.NavigationPage;
import pages.RegistrationPage;

public class LoginTests extends BaseTest {
    private NavigationPage navigationPage;
    private CreateAccountPage createAccountPage;




    @Test(dataProvider = "registerNewUser", dataProviderClass = RegistationPageDataProvider.class)
    public void loginWithIncorrectCredential(String email, String pass, String message) {

        navigationPage = new NavigationPage(driver);
        navigationPage.openSignInPage();
        createAccountPage = new CreateAccountPage(driver);
        createAccountPage.loginIntoAccount(email, pass);
        Assert.assertEquals(message,createAccountPage.getValidationMessage());
    }




    @Test
    public void loginWithCorrectCredentials() {

        Account account = new Account.AccountBuilder().
                withEmail("Jack.Daniels@gmail.com").
                withPass("Jack.Daniels").
                withFirstCustomerName("Jack").
                withLastCustomerName("Daniels").
                create();
        navigationPage = new NavigationPage(driver);
        navigationPage.openSignInPage();
        createAccountPage = new CreateAccountPage(driver);
       // createAccountPage.loginIntoAccount(account);

    }
}
