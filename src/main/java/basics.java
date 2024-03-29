import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class basics extends HybridBase{
    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = Capabilities("real");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // xpath, id, classname
        // tagname[@attribute='value']
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.findElementById("android:id/checkbox").click();

        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        // When you don't have unique text
        // (//android.widget.RelativeLayout)[2]

        driver.findElementByClassName("android.widget.EditText").sendKeys("hello");

        // Click to 2nd element from elements
        driver.findElementsByClassName("android.widget.Button").get(1).click();
    }
}
