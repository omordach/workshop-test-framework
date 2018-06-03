package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DraggablePage extends SideMenu {

    @FindBy(css = ".entry-title")
    public WebElement pageTitle;

    /*
    Default functionality section
     */
    @FindBy(xpath = "//a[text()='Default functionality']")
    public WebElement defaultFunctionalityButton;

    @FindBy(id = "draggable")
    public WebElement draggableBox;

    protected WebDriver driver;

    public DraggablePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @Step("Dragging the draggable box")
    public void dragDraggableBox(int xOffset, int yOffset) {
        new Actions(driver)
                .dragAndDropBy(draggableBox, xOffset, yOffset)
                .build()
                .perform();
    }
}

