package pages;

import model.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by ПК on 21.09.2018.
 */
public class RegistrationPage {

    protected   WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    private final Account account = new Account.AccountBuilder()
            .withGender("Ms.")
            .withFirstCustomerName("Test1")
            .withLastCustomerName("Test2")
            .withEmail("")
            .withPass("fdasfd")
            .withDay("3")
            .withMonth("4")
            .withYear("1985")
            .withFirstName("Test1")
            .withLastName("Test2")
            .withCountry("")
            .withCompany("")
            .withAddress1("adress1")
            .withAddress2("adress2")
            .withCity("Kyiv")
            .withState("Alabama")
            .withPostcode("11111")
            .withCountry("United States")
            .withPhone_mobile("+8052635289")
            .withAlias("alias")
            .create();

    private void selectGender(String gender) {
        if (gender.equals("Ms.")) {
            driver.findElement(By.id("id_gender1")).click();
        } else {
            driver.findElement(By.id("id_gender2")).click();
        }
    }


    private void typeCustomerFirstName(String name) {
        driver.findElement(By.id("customer_firstname")).sendKeys(name);
    }

    private void typeCustomerLastName(String name) {
        driver.findElement(By.id("customer_lastname")).sendKeys(name);
    }

    private void typeEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    private void typePassword(String pass) {
        driver.findElement(By.id("passwd")).sendKeys(pass);
    }

    private void setBirthday(String day, String month, String year) {
        selectBirthDay(day);
        selectBirthMonth(month);
        selectBirthYear(year);

    }

    private void selectBirthDay(String day) {
        WebElement dayDropDown = driver.findElement(By.id("days"));
        Select value = new Select(dayDropDown);
        value.selectByValue(day);
    }

    private void selectBirthMonth(String month) {
        WebElement monthDropDown = driver.findElement(By.id("months"));
        Select value = new Select(monthDropDown);
        value.selectByValue(month);
    }

    private void selectBirthYear(String year) {
        WebElement yearDropDown = driver.findElement(By.id("years"));
        Select value = new Select(yearDropDown);
        value.selectByValue(year);
    }

    private void typeFirstName(String firstName) {
        driver.findElement(By.id("firstname")).sendKeys(firstName);
    }

    private void typeLastName(String lastName) {
        driver.findElement(By.id("lastname")).sendKeys(lastName);
    }

    private void typeCompany(String company) {
        driver.findElement(By.id("company")).sendKeys(company);
    }

    private void typeAddress1(String address1) {
        driver.findElement(By.id("address1")).sendKeys(address1);
    }

    private void typeAddress2(String address2) {
        driver.findElement(By.id("address2")).sendKeys(address2);
    }

    private void typeCity(String city) {
        driver.findElement(By.id("city")).sendKeys(city);
    }

    private void selectState(String state) {
        WebElement stateDropDown = driver.findElement(By.id("id_state"));
        Select value = new Select(stateDropDown);
        value.selectByVisibleText(state);
    }

    private void typePostCode(String postcode) {
        driver.findElement(By.id("postcode")).sendKeys(postcode);
    }

    private void selectCountry(String country) {
        WebElement countryDropDown = driver.findElement(By.id("id_country"));
        Select value = new Select(countryDropDown);
        value.selectByVisibleText(country);
    }

    private void typePhoneMobile(String phone_mobile) {
        driver.findElement(By.id("phone_mobile")).sendKeys(phone_mobile);
    }

    private void typeAlias(String alias) {
        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys(alias);
    }

    public void clickRegister() {
        driver.findElement(By.id("submitAccount")).click();
    }

    public void fillRegistrationForm(Account account) {
        selectGender(account.getGender());
        typeCustomerFirstName(account.getFirstCustomerName());
        typeCustomerLastName(account.getLastCustomerName());
        typeEmail(account.getEmail());
        typePassword(account.getPass());
        setBirthday(account.getDay(), account.getMonth(), account.getYear());
        typeFirstName(account.getFirstName());
        typeLastName(account.getLastName());
        typeCompany(account.getCompany());
        typeAddress1(account.getAddress1());
        typeAddress2(account.getAddress2());
        typeCity(account.getCity());
        selectState(account.getState());
        typePostCode(account.getPostcode());
        selectCountry(account.getCountry());
        typePhoneMobile(account.getPhone_mobile());
        typeAlias(account.getAlias());
    }

    public Account getAccount() {
        return account;
    }
}
