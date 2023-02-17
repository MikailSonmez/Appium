import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class SendingSMS {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {

        AndroidDriver<MobileElement> driver;

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9"); // version number here

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");

        //dc.setCapability("appPackage", "com.android.mms");

        //dc.setCapability("appActivity", "com.android.mms.ui.ComposeMessageActivity");

        // dc.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\asdas.apk");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"), dc);

        Thread.sleep(5000);

        driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Messages\"]").click();
        
        Thread.sleep(5000);
        driver.findElementById("com.google.android.apps.messaging:id/start_new_conversation_button").click();
        Thread.sleep(5000);
        driver.findElementById("com.google.android.apps.messaging:id/recipient_text_view").sendKeys("8142402254");
        Thread.sleep(5000);
        driver.findElementById("com.google.android.apps.messaging:id/recipient_text_view").sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        driver.findElementById("com.google.android.apps.messaging:id/compose_container").sendKeys("hi");

        driver.findElementById("com.google.android.apps.messaging:id/compose_container").sendKeys(Keys.ENTER);

        driver.quit();



    }
}
