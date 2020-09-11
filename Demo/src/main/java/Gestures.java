import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;

public class Gestures extends Base {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = capabilities();
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        TouchAction touchAction = new TouchAction(driver);
        WebElement webElement = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(webElement))).perform();
        driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
        WebElement webElement2 = driver.findElementByAndroidUIAutomator("text(\"People Names\")");
        touchAction.longPress(LongPressOptions.longPressOptions()
                .withElement(ElementOption.element(webElement2))
                .withDuration(Duration.ofSeconds(2))).perform();
        System.out.println(driver.findElementById("android:id/title").isDisplayed());

    }
}
