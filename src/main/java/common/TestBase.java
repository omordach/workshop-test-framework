package common;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pageobject.HomePage;

public class TestBase {
    public static final String DEMOQA_URL = "http://demoqa.com/";
    protected static WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    @Parameters("browser")
    @Step("Opening browser and navigating home page")
    public void setUp(@Optional("CHROME") BrowserEnum browserEnum) {
        driver = new WebdriverFactory(browserEnum).getDriver();
        driver.get(DEMOQA_URL);
        homePage = PageFactory.initElements(driver, HomePage.class);

    }

    @AfterClass
    @Step("Closing browser")
    public void tearDown() {
        driver.quit();

    }

    public static WebDriver getDriver() {
        return driver;
    }
}
