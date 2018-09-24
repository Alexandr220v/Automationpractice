package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Actions;

/**
 * Created by ПК on 21.09.2018.
 */
public class NavigationPage {

    public WebDriver driver;

    public NavigationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openSignInPage() {
        String locator = "//*[contains(@href,'controller=my-account')]";
        driver.findElement(By.xpath(locator)).click();
    }
}
