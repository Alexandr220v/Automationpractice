package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import utils.Config;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class MyStepdefs {
    private WebDriver driver;
    private final Properties config = Config.loadProperties("config.properties");

    @Given("^open browser$")
    public void setUp() {

        ChromeDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //  driver.get("http://automationpractice.com/index.php");
        driver.get(config.getProperty("baseurl"));
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("^open main page$")
    public void openMainPage() throws Throwable {
        driver.get("http://google.com");
        // Write code here that turns the phrase above into concrete actions;
    }
}
