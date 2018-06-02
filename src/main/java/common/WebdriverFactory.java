package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebdriverFactory {

    private WebDriver driver;

    public WebdriverFactory(BrowserEnum browserEnum) {
        if (browserEnum.equals(BrowserEnum.CHROME)) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
            driver = new ChromeDriver();
        } else if (browserEnum.equals(BrowserEnum.FIREFOX)) {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/driver/geckodriver");
            driver = new FirefoxDriver();
        }
//        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public WebDriver getDriver() {
        return driver;
    }
}
