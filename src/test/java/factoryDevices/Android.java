package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Android implements IDevice{
    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("deviceName","Galaxy S5 Neo");
        capabilities.setCapability("platformVersion","6.0.1");
        capabilities.setCapability("appPackage","com.vrproductiveapps.whendo");//com.sec.android.app.popupcalculator
        capabilities.setCapability("appActivity",".ui.HomeActivity");//.Calculator
        capabilities.setCapability("platformName","Android");
        AppiumDriver appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        appiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return appiumDriver;
    }
}

