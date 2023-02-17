import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.swing.text.Element;
import java.net.MalformedURLException;
import java.net.URL;

public class Example5HorizontalScrolling {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<MobileElement> driver;

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9"); // version number here

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");

        dc.setCapability(MobileCapabilityType.APP, "C:\\apkfiles\\AndroidUI.apk");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"), dc);


        //ProgressBar/Horizontal scrolling

        MobileElement obj=driver.findElementById("com.android.androidui::id/seekBar1");

        String val1=driver.findElementById("com.android.androidui::id/textProgess").getText();
        System.out.println(val1);
        TouchAction action=new TouchAction(driver);

        action.longPress(ElementOption.element(obj)).moveTo(ElementOption.element(obj,250,250)).release().perform();

        String val2=driver.findElementById("com.android.androidui::id/textProgess").getText();
        System.out.println(val2);
        

    }

}
