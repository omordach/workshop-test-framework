package common;

import org.testng.*;
import util.ScreenshotUtil;

public class ScreenshotListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult result) {
        new ScreenshotUtil(TestBase.getDriver()).takeScreenshot();
    }
}