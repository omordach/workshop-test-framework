package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TopMenu {

    @FindBy(id = "menu-item-38")
    protected WebElement homeButton;

    @FindBy(id = "menu-item-66")
    protected WebElement demoDropdown;


    private WebDriver driver;

    public TopMenu(WebDriver driver) {

        this.driver = driver;
    }

    @Step("Clicked Home button")
    public HomePage clickHomeButton() {
        homeButton.click();
        return PageFactory.initElements(driver, HomePage.class);
    }

    @Step("Clicked Demo dropdown")
    public HomePage clickDemoDropdown() {
        demoDropdown.click();
        return PageFactory.initElements(driver, HomePage.class);
    }

    public List<WebElement> getAllTopMenuButtons() {
        return new LinkedList<>(Arrays.asList(
                homeButton, demoDropdown)
        );
    }


}
