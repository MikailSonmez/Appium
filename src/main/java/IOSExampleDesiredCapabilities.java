import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class IOSExampleDesiredCapabilities {

    public static void main(String[] args) throws MalformedURLException {

        IOSDriver<MobileElement> driver;

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOs");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.4"); // version number here

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");

        driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"), dc);
    }
}
