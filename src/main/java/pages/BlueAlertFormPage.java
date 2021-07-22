package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;

public class BlueAlertFormPage extends BasePage {

    private String pageUrl;

    public BlueAlertFormPage(WebDriver driver, String url) {
        super(driver);
        pageUrl = url;
    }

    public BlueAlertFormPage load() {
        driver.navigate().to(pageUrl);
        return this;
    }
}
