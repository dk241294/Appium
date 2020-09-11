import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class UiAutomator extends Base{


    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver;
        driver=capabilities();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        //validate clickable feature for all update(properties)
        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
    }
}
