package pageobject;

import common.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;

public class HomePage extends SideMenu {

    private static final Logger LOG = LogFactory.getLogger(HomePage.class);

    @FindBy(xpath = "//h5[text() = 'Unique & Clean']/..//img")
    protected WebElement uniqueCleanImage;

    @FindBy(xpath = "//h5[text() = 'Customer Support']/..//img")
    protected WebElement customerSupportImage;

    @FindBy(xpath = "//h5[text() = 'Very Flexible']/..//img")
    protected WebElement veryFlexibleImage;

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
