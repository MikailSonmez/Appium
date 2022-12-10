import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Example2InstallAppAndroidEmulator {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver<MobileElement> driver;

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9"); // version number here

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");

        dc.setCapability("appPackage", "com.android.calculator2");
        dc.setCapability("appActivity", "com.android.calculator2.Calculator");

        // dc.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\asdas.apk");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"), dc);
        Thread.sleep(5000);

        MobileElement seven=driver.findElement(By.id("com.android.calculator2:id/digit_7"));
        seven.click();  // click to 7

        driver.findElementById("com.android.calculator2:id/op_add").click(); // click plus button

        MobileElement three=driver.findElementById("com.android.calculator2:id/digit_3");
        three.click(); // click to 3

        driver.findElementById("com.android.calculator2:id/eq").click(); // click equality button

        Thread.sleep(3000);
        String results=driver.findElementById("com.android.calculator2:id/result").getText(); // result should be 10

        if(results.equals("10")){
            System.out.println("test passed");
        } else{
            System.out.println("test failed");
        }

        Thread.sleep(5000);

        driver.quit();
        
        

    }
}
