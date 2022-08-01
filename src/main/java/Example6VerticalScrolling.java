import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Example6VerticalScrolling {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<MobileElement> driver;

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9"); // version number here

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");

        dc.setCapability(MobileCapabilityType.APP, "C:\\apkfiles\\ApiDemos.apk");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"), dc);


        //vertical scrolling
        driver.findElementsById("android:id/text1").get(10).click();//iodentify views and click on it

        // capturing all the list items
        MobileElement list=driver.findElementById("android:id/text1");

        // scrolling down till we get the element
        MobileElement listitem= (MobileElement) driver.findElement(
                MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector()).scrollIntoView(" +
                                "new UiSelector().description(\"Switches\"));"));

        System.out.println(listitem.getLocation());
        listitem.click();


    }
}
