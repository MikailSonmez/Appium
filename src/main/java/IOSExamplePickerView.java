import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class IOSExamplePickerView {


    public static void main(String[] args) throws MalformedURLException {

        IOSDriver<MobileElement> driver;

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOs");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.4"); // version number here

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");

        driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"), dc);

        driver.findElementByAccessibilityId("Picker View").click();

        List <WebElement> values= (List<WebElement>) driver.findElementByXPath("//XUIElementTypePickerWheel");


        String val1=values.get(0).getAttribute("value");
        String val2=values.get(0).getAttribute("value");
        String val3=values.get(0).getAttribute("value");

        System.out.println(val1+ " "+val2+" "+ val3);

        values.get(0).sendKeys("50");
        values.get(0).sendKeys("100");
        values.get(0).sendKeys("200");

        driver.quit();
    }
}
