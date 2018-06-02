import common.TestBase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBrowser extends TestBase {
    @Test
    public void testBrowser() {
        driver.get("http://demoqa.com/");
        Assert.assertTrue(driver.getCurrentUrl().contains("http://demoqa.com/test"));
    }
}
