import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class Scroll extends  Base {

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver;
        driver=capabilities();
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        //scrolling code
        //calling android api cod inside the function
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Spinner\"))");

    }
}
