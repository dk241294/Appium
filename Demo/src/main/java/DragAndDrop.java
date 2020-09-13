import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;

public class DragAndDrop extends  Base {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = capabilities();
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
        TouchAction t =new TouchAction(driver);
        WebElement drag= driver.findElementByXPath("//android.view.View[@index='1']");
        WebElement dropTo =driver.findElementByXPath("//android.view.View[@index='2']");
        t.longPress(LongPressOptions.longPressOptions()
                .withElement(ElementOption.element(drag))
                .withDuration(Duration.ofSeconds(2)))
                .moveTo(ElementOption.element(dropTo)).release().perform();
    }

}
