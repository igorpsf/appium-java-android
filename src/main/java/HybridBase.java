import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class HybridBase {

    public static AndroidDriver<AndroidElement> Capabilities(String device) throws MalformedURLException {
        // Appium code

        File f = new File("src");
        File fs = new File(f, "ApiDemos-debug.apk");

        DesiredCapabilities caps = new DesiredCapabilities();
        if(device.equals("emulator")) {
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Igoremulator");
        } else if(device.equals("real")){
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        }
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        caps.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());

        AndroidDriver<AndroidElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        return driver;
    }
}
