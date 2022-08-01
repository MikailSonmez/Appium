import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Example4DragAndDropAction {

    public static void main(String[] args) throws MalformedURLException {

            AndroidDriver<MobileElement> driver;

            DesiredCapabilities dc = new DesiredCapabilities();

            dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

            dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

            dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9"); // version number here

            dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");

            dc.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\more\\com.mobeta.android.demodslv-0.5.0-3_APKdot.com.apk");

            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"), dc);

            //Navigation

            driver.findElementByXPath("/hierarchy/android.widget.FrameLayout.android.view.View/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]").click();


            // chick corea

            MobileElement source=driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(2);

            MobileElement target=driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(5);

        TouchAction action=new TouchAction(driver);

        // drag and drop

        action.longPress(ElementOption.element(source)).moveTo(ElementOption.element(target)).release().perform();

        System.out.println("Element has been droped at destination successfully.");
    }
}
