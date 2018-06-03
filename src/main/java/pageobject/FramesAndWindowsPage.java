package pageobject;

import common.LogFactory;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.testng.Assert;


public class FramesAndWindowsPage extends SideMenu {
    private static final Logger LOG = LogFactory.getLogger(FramesAndWindowsPage.class);


    @FindBy(xpath = "//*[@id=\"ui-id-3\"]")
    protected WebElement framesetButton;

    @FindBy(xpath = "//*[@id=\"tabs-3\"]/div/p/a")
    protected WebElement openFramesetWindowButton;


    private WebDriver driver;

    public FramesAndWindowsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @Step("Click frameset Button")
    public FramesAndWindowsPage clickFramesetButton() {
        framesetButton.click();
        LOG.info("Clicked frameset Button");
        return this;
    }

    @Step("Click frameset Button")
    public FramesAndWindowsPage clickOpenFramesetWindowButton() {
        openFramesetWindowButton.click();
        LOG.info("Clicked open frameset Window Button");
        return this;
    }
    @Step("Switch betweenTabs")
    public FramesAndWindowsPage switchBetweenTabs() {
        new Actions(driver)
                .keyDown(Keys.CONTROL)
                .sendKeys(Keys.TAB)
                .build()
                .perform();
        LOG.info("Switched between Tabs");
        return this;
    }


    @Step("Switch to Top Frame")
    public FramesAndWindowsPage switchToTopFrame() {
        driver.switchTo().frame (0);
        LOG.info("Switched to top frame");
        return this;
    }

    @Step("Switch to Content Frame")
    public FramesAndWindowsPage switchToContentFrame() {
        driver.switchTo().defaultContent();
        LOG.info("Switched to content Frame");
        return this;
    }

}
