package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class ContactUsPage {

    private WebDriver driver;
    @FindBy(id = "fileUpload")
    private WebElement attachFile;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Step
    public void attachFile() {
        File file = new File("src\\main\\resources\\test.txt");
        attachFile.sendKeys(file.getAbsolutePath());
        attachFile.click();
    }
}
