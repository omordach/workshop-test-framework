import common.TestBase;
import io.qameta.allure.Description;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Test4SelectingMultipleOptionsOnTheSelectablePage extends TestBase {

    @Test
    @Description("Test case verifies Selecting multiple options on the 'Selectable' page")
    public void testHomePage() {
        homePage
                .clickSelectableButton()
                .selectMultipleItems();

        File screenshot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot3, new File("target/3_allSelected.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(driver.findElement(By.cssSelector("#selectable > li:nth-child(1)"))
                .getAttribute("class")
                .equals("ui-widget-content ui-corner-left ui-selectee ui-selected"));

        Assert.assertTrue(driver.findElement(By.cssSelector("#selectable > li:nth-child(2)"))
                .getAttribute("class")
                .equals("ui-widget-content ui-corner-left ui-selectee ui-selected"));

        Assert.assertTrue(driver.findElement(By.cssSelector("#selectable > li:nth-child(3)"))
                .getAttribute("class")
                .equals("ui-widget-content ui-corner-left ui-selectee ui-selected"));

        Assert.assertTrue(driver.findElement(By.cssSelector("#selectable > li:nth-child(4)"))
                .getAttribute("class")
                .equals("ui-widget-content ui-corner-left ui-selectee ui-selected"));

        Assert.assertTrue(driver.findElement(By.cssSelector("#selectable > li:nth-child(5)"))
                .getAttribute("class")
                .equals("ui-widget-content ui-corner-left ui-selectee ui-selected"));

        Assert.assertTrue(driver.findElement(By.cssSelector("#selectable > li:nth-child(6)"))
                .getAttribute("class")
                .equals("ui-widget-content ui-corner-left ui-selectee ui-selected"));

        Assert.assertTrue(driver.findElement(By.cssSelector("#selectable > li:nth-child(7)"))
                .getAttribute("class")
                .equals("ui-widget-content ui-corner-left ui-selectee ui-selected"));
    }
}
