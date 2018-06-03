import common.TestBase;
import io.qameta.allure.Description;
import org.testng.annotations.Test;


public class Test5SwitchingBetweenFramesAndBrowserTabsOnFramesAndWindowsPage extends TestBase {

    @Test
    @Description("Test case verifies Selecting multiple options on the 'Selectable' page")
    public void testHomePage() {
        homePage
                .clickFramesAndWindowsButton()
                .clickFramesetButton()
                .clickOpenFramesetWindowButton()
                .switchBetweenTabs()
                .switchToTopFrame()
                .switchToContentFrame();

    }
}
