import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by ПК on 21.09.2018.
 */
public class BaseTest  {

    public  WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ПК\\Desktop\\chrm\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //  driver.navigate().to("http://automationpractice.com/index.php");
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
}
