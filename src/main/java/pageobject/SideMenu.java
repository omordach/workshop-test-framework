package pageobject;

import common.LogFactory;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SideMenu extends TopMenu {

    private static final Logger LOG = LogFactory.getLogger(SideMenu.class);

    @FindBy(id = "menu-item-374")
    protected WebElement registrationButton;

    @FindBy(css = "#menu-item-140")
    public WebElement draggableButton;

    @FindBy(css = "#menu-item-142")
    public WebElement selectableButton;

    private WebDriver driver;

    public SideMenu(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @Step("Clicked Ragistration button")
    public RegistrationPage clickRegistrationButton() {
        registrationButton.click();
        return PageFactory.initElements(driver, RegistrationPage.class);
    }

    @Step("Clicked Draggable button")
    public DraggablePage clickDraggableButton() {
        demoDropdown.click();
        draggableButton.click();
        return PageFactory.initElements(driver, DraggablePage.class);
    }

    @Step("Clicked Selectable button")
    public SelectablePage clickSelectableButton() {
        selectableButton.click();
        return PageFactory.initElements(driver, SelectablePage.class);
    }

    public List<WebElement> getAllSideMenuButtons() {
        return new LinkedList<>(Arrays.asList(
                registrationButton, draggableButton, selectableButton));
    }

}
