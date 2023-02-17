import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class IOSExampleDatePicker {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        IOSDriver<MobileElement> driver;

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOs");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.4"); // version number here

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");

        dc.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");

        driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"), dc);

        driver.findElementByAccessibilityId("Date Picker").click();

        List<WebElement> values= (List<WebElement>) driver.findElementByXPath("//XCUIElementTypePickerWheel");

        for (int i = 0; i <=values.size() ; i++) {

            System.out.println(values.get(i).getText());
        }

        values.get(0).sendKeys("Jun 3");
        values.get(0).sendKeys(Keys.TAB);

        values.get(1).sendKeys("6");
        values.get(1).sendKeys(Keys.TAB);

        values.get(2).sendKeys("12");
        values.get(2).sendKeys(Keys.TAB);

        values.get(2).sendKeys("PM");

        Thread.sleep(9000);

        driver.quit();
        

    }
}
