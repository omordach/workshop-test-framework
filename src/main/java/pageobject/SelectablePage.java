package pageobject;

import common.LogFactory;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;

public class SelectablePage extends SideMenu {

    private static final Logger LOG = LogFactory.getLogger(SelectablePage.class);

    @FindBy(xpath = "//*[@id=\"selectable\"]/li[1]")
    protected WebElement selectableItem1;

    @FindBy(xpath = "//*[@id=\"selectable\"]/li[2]")
    protected WebElement selectableItem2;

    @FindBy(xpath = "//*[@id=\"selectable\"]/li[3]")
    protected WebElement selectableItem3;

    @FindBy(xpath = "//*[@id=\"selectable\"]/li[4]")
    protected WebElement selectableItem4;

    @FindBy(xpath = "//*[@id=\"selectable\"]/li[5]")
    protected WebElement selectableItem5;

    @FindBy(xpath = "//*[@id=\"selectable\"]/li[6]")
    protected WebElement selectableItem6;

    @FindBy(xpath = "//*[@id=\"selectable\"]/li[7]")
    protected WebElement selectableItem7;

    private WebDriver driver;

    public SelectablePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @Step("Select multiple items")
    public SelectablePage selectMultipleItems() {
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.LEFT_CONTROL)
                .click(selectableItem1)
                .click(selectableItem2)
                .click(selectableItem3)
                .click(selectableItem4)
                .click(selectableItem5)
                .click(selectableItem6)
                .click(selectableItem7)
                .keyUp(Keys.LEFT_CONTROL)
                .build()
                .perform();

        LOG.info("Selected multiple items");
        return this;
    }



}
