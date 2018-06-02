import common.TestBase;
import io.qameta.allure.Description;
import org.testng.annotations.Test;


public class TestHomePage extends TestBase {
    @Test
    @Description("test case verifies field input on registration page")
    public void testHomePage() {
        homePage
                .clickRegistrationButton()
                .fillNameInput("Oleh")
                .fillLastNameInput("Mordach");

    }
}