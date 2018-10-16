package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import static utils.Log.*;

/**
 * Created by ПК on 21.09.2018.
 */

@Component
public class NavigationPage {


    @Autowired
    private WebDriver driver;


    public NavigationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[contains(@href,'controller=my-account')]")
    private WebElement singIn;

    @FindBy(xpath = "//*[@title='Contact Us']")
    private WebElement contactUs;



    @Step
    public void openSignInPage() {
        LOG.info("Clicking on sign in button");
        singIn.click();
    }


    public void openContactUsPage() {
        contactUs.click();
    }
}
