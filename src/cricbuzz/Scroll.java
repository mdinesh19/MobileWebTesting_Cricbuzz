package cricbuzz;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Scroll extends WebCapability{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = DesiredCapability();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Cricbuzz");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='Cricbuzz']")).click();
		driver.findElement(By.xpath("//span[text()='Menu ']")).click();
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		//Scroll down to a particular element
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement webel = driver.findElement(By.xpath("//span[text()='England clinch series 1-0']"));
		js.executeScript("arguments[0].scrollIntoView();", webel);
		System.out.println("Scroll down to webelement is successful");
	}

}
