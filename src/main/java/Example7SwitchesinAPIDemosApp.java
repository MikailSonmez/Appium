import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Example7SwitchesinAPIDemosApp {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<MobileElement> driver;

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9"); // version number here

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");

        dc.setCapability(MobileCapabilityType.APP, "C:\\apkfiles\\ApiDemos.apk");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"), dc);

        // views

        driver.findElementsById("android:id/text1").get(10).click(); // views options

        //controls
        driver.findElementsById("android:id/text1").get(4).click(); // controls

        // dark theme

        //driver.findElementsById("android:id/text1").get(1).click(); // dark theme or
        driver.findElementByAccessibilityId("2. Dark Theme").click(); // dark theme

        // text box
        driver.findElementById("io.appium.android.apis:id/edit").sendKeys("Pavan");

        // checkbox1

        driver.findElementById("io.appium.android.apis:id/check1").click();

        // radio button 1

        driver.findElementById("io.appium.android.apis:id/radio1").click();
        


    }
}
