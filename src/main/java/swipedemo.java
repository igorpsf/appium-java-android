import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class swipedemo extends base{

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
        driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();

        // xpath "//tagname[@attribute='value']", if tagname include special characters for example $, use *
        driver.findElementByXPath("//*[@content-desc='9']").click();

    }
}
