import common.TestBase;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2MandatoryFieldsAndDataValidationOnRegistrationPage extends TestBase {

    @Test
    @Description("Test case verifies mandatory fields and data validation on registration page (negative scenario)")
    public void testHomePage() {
        homePage
                .clickRegistrationButton()
                .pressSubmitButton();

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[1]/div[1]/div[2]/span"))
                .getText().equals("* This field is required"));

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[3]/div/div[2]/span"))
                .getText().equals("* This field is required"));

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[6]/div/div/span"))
                .getText().equals("* This field is required"));

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[7]/div/div/span"))
                .getText().equals("* This field is required"));

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[8]/div/div/span"))
                .getText().equals("* This field is required"));

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[11]/div/div/span"))
                .getText().equals("* This field is required"));

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[12]/div/div/span"))
                .getText().equals("* This field is required"));

    }
}
