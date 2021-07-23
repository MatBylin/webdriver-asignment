package pages;

import base.BasePage;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Slf4j
public class BlueAlertFormAgreementPage extends BasePage {

    public BlueAlertFormAgreementPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageTitlePresent() {
        log.info("Checking agreement page title present");
        return driver.findElements(By.id("fieldgroup_zgoda")).size() > 0;
    }
}
