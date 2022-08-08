import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Example3HandleSwitchEmulator {


    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<MobileElement> driver;

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9"); // version number here

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");


        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"), dc);


        // Handling switch element


        // round 1
        driver.findElementById("com.android.androidui:id/mySwitch").click(); //click on switch

        String val=driver.findElementById("com.android.androidui:id/switchStatus").getText();

        System.out.println(val);

        // round 2
        driver.findElementById("com.android.androidui:id/mySwitch").click(); //click on switch

        val=driver.findElementById("com.android.androidui:id/switchStatus").getText();

        System.out.println(val);

        driver.quit();



    }
}
