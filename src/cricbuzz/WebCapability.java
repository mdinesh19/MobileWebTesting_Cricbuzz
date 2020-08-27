package cricbuzz;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class WebCapability {

	public static AndroidDriver<AndroidElement> DesiredCapability() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//Caps reqd to test an app
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Dinesh Pixel 3a");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		//to test a web app
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		//chrome driver executable is not available in Mobile Capability type, its in Android Mobile capability type
		cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Users\\DineshMohanasundaram\\DineshWorkspaceMobileTesting\\CricbuzzMobileWebTesting\\Drivers\\chromedriver.exe");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		
		return driver;
				
	}
}
