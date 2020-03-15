import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import java.net.MalformedURLException;

public class browse extends baseChrome{

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = Capabilities();
        /*
        driver.get("http://www.facebook.com");
        driver.findElementByXPath("//input[@id='m_login_email']").sendKeys("qwerty");
        driver.findElementByName("pass").sendKeys("12345");
        driver.findElementByXPath("//button[@value='Log In']").click();
        */

        driver.get("https://m.cricbuzz.com/");
        driver.findElementByXPath("//a[@href='#menu']").click();
        driver.findElementByCssSelector("a[title='Cricbuzz Home']").click();
        System.out.println(driver.getCurrentUrl());

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, 640)", "");

        Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Top Stories']")).getAttribute("class").contains("header"));

        // adb devices - Unauthorized
        // adb kill-server
        // adb start-server
        // adb devices

    }
}
