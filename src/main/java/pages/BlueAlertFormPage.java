package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    private WebElement invalidFeedbackValidation;

    //    @FindBy(xpath = "//*[@id='is_pesel']/following-sibling::span[@class='invalid-feedback ']")

    public BlueAlertFormPage fillFirstName(String firstName){
        firstNameInput.sendKeys(firstName);
        return this;
    }
    public BlueAlertFormPage fillLastName(String lastName){
        lastNameInput.sendKeys(lastName);
        return this;
    }
    public BlueAlertFormPage fillEmail(String email){
        emailInput.sendKeys(email);
        return this;
    }
    public BlueAlertFormPage fillPhoneNumber(String phoneNumber){
        phoneNumberInput.sendKeys(phoneNumber);
        return this;
    }
    public BlueAlertFormPage fillPeselNumber(String peselNumber){
        peselNumberInput.sendKeys(peselNumber);
        return this;
    }
    public BlueAlertFormPage fillIdNumber(String idNumber){
        idNumberInput.sendKeys(idNumber);
        return this;
    }
    public BlueAlertFormPage fillDate(String date){
        dateInput.sendKeys(date);
        dateIcon.click();
        return this;
    }
    public BlueAlertFormPage clickConfirmButton(){
        confirmBtn.click();
        return this;
    }

    public BlueAlertFormPage load() {
        driver.navigate().to(pageUrl);
        return this;
    }
}
