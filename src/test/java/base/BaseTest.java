package base;

import browser.BrowserType;
import config.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BlueAlertFormPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private Configuration configuration = ConfigFactory.create(Configuration.class);
    private String mainPageUrl = configuration.applicationMainUrl();
    private WebDriver driver;
    private BlueAlertFormPage blueAlertFormPage;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        blueAlertFormPage = new BlueAlertFormPage(driver, mainPageUrl);
    }

    @AfterEach
    public void cleanUp() {
        driver.close();
    }
}
