package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlueAlertFormAgreementPage extends BasePage {

    public BlueAlertFormAgreementPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageTitlePresent() {
        return driver.findElements(By.id("fieldgroup_zgoda")).size() > 0;
    }
}
