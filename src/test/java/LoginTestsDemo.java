import model.AccountDemo;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AuthenticationPage;
import pages.MyAccountPage;
import pages.NavigationPage;

public class LoginTestsDemo extends BaseTest {

    private NavigationPage navigationPage;
    private AuthenticationPage authenticationPage;
    private MyAccountPage accountPage;

    @Test
    public void verifyLoginWithCorrectCreds() {
        AccountDemo accountDemo = new AccountDemo();
        accountDemo.setEmail("Jack.Daniels@gmail.com");
        accountDemo.setPass("Jack.Daniels");
        accountDemo.setFirstCustomerName("Jack");
        accountDemo.setLastCustomerName("Daniels");

        navigationPage = new NavigationPage(driver);
        navigationPage.openSignInPage();
        authenticationPage = new AuthenticationPage(driver);
        authenticationPage.typeEmail(accountDemo).
                typePassword(accountDemo).
                clickSingIn();
        accountPage = new MyAccountPage(driver);

        Assert.assertEquals(accountDemo.getFirstCustomerName()
                        + " " + accountDemo.getLastCustomerName(),
                accountPage.getUserInfo());


    }
}
