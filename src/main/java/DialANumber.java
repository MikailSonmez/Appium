import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DialANumber {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver<MobileElement> driver;

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9"); // version number here

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");

        //dc.setCapability("appPackage", "com.android.dialer");
        //dc.setCapability("appActivity", "com.android.dialer.DialerActivity");

        // dc.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\asdas.apk");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"), dc);
        Thread.sleep(5000);


        driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Phone\"]").click();

        //Dial 8142402254

        driver.findElementByXPath("com.google.android.dialer:id/fab").click();

        driver.findElementById("com.google.android.dialer:id/eight").click();
        driver.findElementById("com.google.android.dialer:id/one").click();
        driver.findElementById("com.google.android.dialer:id/four").click();
        driver.findElementById("com.google.android.dialer:id/two").click();
        driver.findElementById("com.google.android.dialer:id/four").click();
        driver.findElementById("com.google.android.dialer:id/zero").click();
        driver.findElementById("com.google.android.dialer:id/two").click();
        driver.findElementById("com.google.android.dialer:id/two").click();
        driver.findElementById("com.google.android.dialer:id/five").click();
        driver.findElementById("com.google.android.dialer:id/four").click();

        Thread.sleep(3000);

        driver.findElementById("com.google.android.dialer:id/dialpad_floating_action_button").click();

        Thread.sleep(5000);

        driver.quit();


    }
}
