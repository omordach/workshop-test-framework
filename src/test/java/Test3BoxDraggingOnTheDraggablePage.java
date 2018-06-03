import common.TestBase;
import io.qameta.allure.Description;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobject.DraggablePage;

import java.io.File;
import java.io.IOException;

public class Test3BoxDraggingOnTheDraggablePage extends TestBase {

    private static final int DRAG_LENGTH = 25;

    private DraggablePage draggablePage;
    private Point beforeLocation;
    private Point afterLocation;

    @BeforeClass
    public void openDraggablePage() {
        draggablePage = homePage.clickDraggableButton();
    }

    @Test
    @Description("Verifies that the box can be dragged around on the Draggable page")
    public void draggableTest() {
        draggablePage.defaultFunctionalityButton.click();
        beforeLocation = draggablePage.draggableBox.getLocation();

        File screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot1, new File("target/before.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        draggablePage.dragDraggableBox(DRAG_LENGTH, DRAG_LENGTH);
        afterLocation = draggablePage.draggableBox.getLocation();

        File screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot2, new File("target/after.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(afterLocation.getX() == beforeLocation.getX() + DRAG_LENGTH,
                "Failed to drag the box by correct X offset");
        Assert.assertTrue(afterLocation.getY() == beforeLocation.getY() + DRAG_LENGTH,
                "Failed to drag the box by correct Y offset");
    }
}