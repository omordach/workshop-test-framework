package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SideMenu extends TopMenu {

    @FindBy(id = "menu-item-374")
    protected WebElement registrationButton;

    private WebDriver driver;

    public SideMenu(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public RegistrationPage clickRegistrationButton() {
        registrationButton.click();
        return PageFactory.initElements(driver, RegistrationPage.class);
    }
}
