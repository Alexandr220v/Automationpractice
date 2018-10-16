import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * Created by ПК on 22.02.2018.
 */
@Component
public class MainPage {

    @Inject
    private WebDriver driver;
    @FindBy(id = "search_query_top")
    private WebElement search;
    @FindBy(xpath = "//button[@name='submit_search']")
    private WebElement submitButton;
    @FindBy(xpath = "//img[contains(@src,'7-home_default')]")
    private WebElement itemView;
    @FindBy(className = "icon-th-list")
    private WebElement listView;
    @FindBy(xpath = "//span[text()='Add to cart']")
    private WebElement addCartButton;
    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    private WebElement proceedCheckout;
    @FindBy(xpath = "//span[@id='total_price']")
    private WebElement totalSum;

    @Autowired
    public MainPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @Step
    public MainPage searchItem(String item) {
        search.sendKeys(item);
        return this;
    }

    @Step
    public MainPage switchToListView() {
        listView.click();
        driver.navigate().refresh();
        listView.click();
        return this;
    }


    @Step
    public void pressSubmit() {
        submitButton.click();
    }

    public void navigateToItemView () {
        Actions actions = new Actions(driver);
        actions.moveToElement(itemView).build().perform();
    }
    public void pressAddCart() {
        addCartButton.click();
    }

    public void pressPreceedCheckout() {
        proceedCheckout.click();
    }

    public String getTotalSum() {
        return totalSum.getText();
    }
}
