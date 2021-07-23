package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleDriverProvider {
    public static WebDriver provideDriver(BrowserType browser) {
        if (browser.equals(BrowserType.CHROME)) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else {
            throw new IllegalArgumentException("Unknown browser type");
        }
    }
}
