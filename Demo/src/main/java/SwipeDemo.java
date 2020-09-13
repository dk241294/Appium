import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.net.MalformedURLException;
import java.time.Duration;

public class SwipeDemo extends Base {


    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver;
        driver = capabilities();
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
        driver.findElementByXPath("//*[@text='2. Inline']").click();
        driver.findElementByXPath("//*[@content-desc='3']").click();
        TouchAction t = new TouchAction(driver);
        WebElement first = driver.findElementByXPath("//*[@content-desc='15']");

        WebElement second = driver.findElementByXPath("//*[@content-desc='45']");
        //second.click();
        t.longPress(LongPressOptions.longPressOptions()
                .withElement(ElementOption.element(first))
                .withDuration(Duration.ofSeconds(2)))
                .moveTo(ElementOption.element(second))
                .release()
                .perform();

    }
}
