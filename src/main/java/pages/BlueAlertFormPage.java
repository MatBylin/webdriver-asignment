package pages;

import base.BasePage;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Slf4j
public class BlueAlertFormPage extends BasePage {

    private String pageUrl;

    public BlueAlertFormPage(WebDriver driver, String url) {
        super(driver);
        pageUrl = url;
    }

    @FindBy(id = "id_first_name")
    private WebElement firstNameInput;
    @FindBy(id = "id_last_name")
    private WebElement lastNameInput;
    @FindBy(id = "id_email")
    private WebElement emailInput;
    @FindBy(id = "id_phone")
    private WebElement phoneNumberInput;
    @FindBy(id = "id_pesel")
    private WebElement peselNumberInput;
    @FindBy(id = "id_id_numer")
    private WebElement idNumberInput;
    @FindBy(id = "id_date")
    private WebElement dateInput;
    @FindBy(xpath = "//*[@class='input-group-text']")
    private WebElement dateIcon;
    @FindBy(id = "form_button_next")
    private WebElement confirmBtn;
    @FindBy(xpath = "//span[@class='invalid-feedback ']")
    private WebElement invalidFeedbackValidator;
    @FindBy(xpath = "//*[@id='is_pesel']/following-sibling::span[@class='invalid-feedback ']")
    private WebElement peselInvalidFeedback;

    public BlueAlertFormPage fillFirstName(String firstName) {
        log.info("Filling first name with : {}", firstName);
        firstNameInput.sendKeys(firstName);
        return this;
    }

    public BlueAlertFormPage fillLastName(String lastName) {
        log.info("Filling last name with : {}", lastName);
        lastNameInput.sendKeys(lastName);
        return this;
    }

    public BlueAlertFormPage fillEmail(String email) {
        log.info("Filling email with : {}", email);
        emailInput.sendKeys(email);
        return this;
    }

    public BlueAlertFormPage fillPhoneNumber(String phoneNumber) {
        log.info("Filling phone number with : {}", phoneNumber);
        phoneNumberInput.sendKeys(phoneNumber);
        return this;
    }

    public BlueAlertFormPage fillPeselNumber(String peselNumber) {
        log.info("Filling pesel number with : {}", peselNumber);
        peselNumberInput.sendKeys(peselNumber);
        return this;
    }

    public BlueAlertFormPage fillIdNumber(String idNumber) {
        log.info("Filling id number with : {}", idNumber);
        idNumberInput.sendKeys(idNumber);
        return this;
    }

    public BlueAlertFormPage fillDate(String date) {
        log.info("Filling date with : {}", date);
        dateInput.sendKeys(date);
        dateIcon.click();
        return this;
    }

    public BlueAlertFormAgreementPage clickConfirmButton() {
        log.info("Clicking confirm button");
        confirmBtn.click();
        return new BlueAlertFormAgreementPage(driver);
    }

    public int returnNumberOfInvalidFeedbackValidators() {
        return driver.findElements(By.xpath("//span[@class='invalid-feedback '])")).size();
    }

    public BlueAlertFormPage load() {
        log.info("Loading ble alert form page, with url: {}", pageUrl);
        driver.navigate().to(pageUrl);
        return this;
    }
}
