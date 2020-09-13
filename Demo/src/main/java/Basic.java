import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Basic extends hybridClass {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver driver;
        driver = capabilities("emulator");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        System.out.println("deepaaaaaaaaaaaaaaaaaaaaaaaaa");
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.findElementById("android:id/checkbox").click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementByXPath("//android.widget.EditText[@resource-id='android:id/edit']").click();
        driver.findElementByXPath("//android.widget.EditText[@resource-id='android:id/edit']").sendKeys("deepak");
        //or driver.findElementByClassName("android.widget.EditText").sendKeys("deepak");
        driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
        //or driver.findElementsByClassName("android.widget.Button").get(1).click();

    }
}