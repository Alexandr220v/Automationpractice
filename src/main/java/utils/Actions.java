package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by ПК on 21.09.2018.
 */
public class Actions {

    public static WebElement find(By locator, WebDriver driver) {
        return driver.findElement(locator);
    }
}
