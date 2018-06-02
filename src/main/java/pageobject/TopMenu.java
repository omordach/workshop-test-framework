package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenu {

    @FindBy(id = "menu-item-38")
    protected WebElement homeButton;

    @FindBy(id = "menu-item-158")
    protected WebElement aboutUsButton;

    @FindBy(id = "menu-item-155")
    protected WebElement servicesButton;

    @FindBy(id = "menu-item-66")
    protected WebElement demoButton;

    @FindBy(id = "menu-item-65")
    protected WebElement blogButton;

    @FindBy(id = "menu-item-65")
    protected WebElement contactButton;

    private WebDriver driver;

    public TopMenu(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage clickHomeButton() {
        homeButton.click();
        return PageFactory.initElements(driver, HomePage.class);
    }

    public void clickServicesButton() {
        servicesButton.click();
    }

    public void clickAboutUsButtonn() {
        aboutUsButton.click();
    }

    public void clickDemoButton() {
        demoButton.click();
    }

    public void clickBlogButton() {
        blogButton.click();
    }

    public void clickContactButton() {
        contactButton.click();
    }


}
