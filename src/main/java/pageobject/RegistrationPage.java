package pageobject;

import common.LogFactory;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;

public class RegistrationPage extends SideMenu {

    private static final Logger LOG = LogFactory.getLogger(RegistrationPage.class);

    @FindBy(id = "name_3_firstname")
    protected WebElement nameImput;


    @FindBy(id = "name_3_lastname")
    protected WebElement lastNameImput;

    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @Step("Filling the name input")
    public RegistrationPage fillNameInput(String input) {
        nameImput.clear();
        nameImput.sendKeys(input);
        LOG.info("Filled name input with text: " + input);
        return this;
    }

    @Step("Filling the last name input")
    public RegistrationPage fillLastNameInput(String input) {
        lastNameImput.clear();
        lastNameImput.sendKeys(input);
        LOG.info("Filled last name input wit text: " + input);
        return this;
    }
}
