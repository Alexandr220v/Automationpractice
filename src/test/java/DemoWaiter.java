

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.NavigationPage;

import java.util.concurrent.TimeUnit;

public class DemoWaiter {

    private WebDriver driver;


    @BeforeMethod
    public void start() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Oleksandr_Pavliuk\\Desktop\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //  driver.navigate().to("http://automationpractice.com/index.php");
        driver.get("http://automationpractice.com/index.php");

    }

    @Test
    public void demoTest() {

        driver.findElement(By.id("search_query_top")).
                sendKeys("Blouse");
        driver.findElement(By.name("submit_search")).click();
        WebElement listView = driver.findElement(By.className("icon-th-list"));
        listView.click();
        driver.findElement(By.xpath("//*[@title='Add to cart']")).click();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(By.
                        xpath("//*[@title='Proceed to checkout']"))).click();


    }


    @Test
    public void actionsDemo() {

        WebElement productItem =
                driver.findElement(By.xpath("//*[@title='Faded Short Sleeve T-shirts']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(productItem).build().perform();


        actions.moveByOffset(30,0);
    }


    @AfterMethod
    public void stop() {
        driver.close();
    }
}
