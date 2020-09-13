import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class hybridClass {
    static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {
        File f = new File("src");
        File fs = new File(f, "ApiDemos-debug.apk");
        DesiredCapabilities dc = new DesiredCapabilities();
        if (device.equals("emulator")) {
            dc.setCapability(MobileCapabilityType.DEVICE_NAME, "deepakemulator");
        } else if (device.equals("real")) {
            dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        }
        // dc.setCapability(MobileCapabilityType.DEVICE_NAME, "deepakemulator");

        dc.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        return driver;

    }
}