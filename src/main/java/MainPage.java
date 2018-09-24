import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ПК on 22.02.2018.
 */
public class MainPage {

    protected WebDriver driver;
    @FindBy(id = "search_query_top")
    private WebElement search;
    @FindBy(xpath = "//button[@name='submit_search']")
    private WebElement submitButton;
    @FindBy(xpath = "//img[contains(@src,'7-home_default')]")
    private WebElement itemView;
    @FindBy(xpath = "//span[text()='Add to cart']")
    private WebElement addCartButton;
    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    private WebElement proceedCheckout;
    @FindBy(xpath = "//span[@id='total_price']")
    private WebElement totalSum;



    public MainPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public MainPage searchItem(String item) {
        search.sendKeys(item);
        return this;
    }

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
