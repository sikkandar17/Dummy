package mobileautomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Iwatercustomer_signup_page {
	
	 static AppiumDriver <MobileElement> driver;
	 
	public static void main(String[] args) throws MalformedURLException, InterruptedException, AWTException {
		
		
		
	DesiredCapabilities cap = new DesiredCapabilities();
	 
	cap.setCapability("devicename", "OPPO A83 ");
	
	cap.setCapability("udid", "PRSSAUOZUGONT8BQ");//device id
	
	cap.setCapability("platformName", "Android");
	
	cap.setCapability("platformVersion", "7.1.1");//android version
	
	cap.setCapability("appPackage", "lifotech.iwater.customer");//app info
	
	cap.setCapability("appActivity", "lifotech.iwater.customer.MainActivity");//use adb shell and dumpsys window windows | 
	
	URL url = new URL("http://127.0.0.0.0:4723/wd/hub");//Appium url
	
	driver = new AppiumDriver<MobileElement>(cap);
	
	System.out.println("application started..");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	MobileElement newcustomer  = driver.findElement(By.xpath("//android.view.View[@content-desc=\"New Customer? Register\"]"));
	newcustomer.click();

	System.out.println("New customer button clicked");
	
	MobileElement fullname = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.widget.EditText"));
	fullname.sendKeys("sikkandar");
	
	System.out.println("Name entered in respective field");
	Thread.sleep(1000);
	
	MobileElement mobilenumber = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText\r\n"));
	mobilenumber.click();
	Robot r = new Robot();
	
		r.keyPress(java.awt.event.KeyEvent.VK_7);
		r.keyRelease(java.awt.event.KeyEvent.VK_7);
		
		for (int i = 0; i <3; i++) {
			r.keyPress(java.awt.event.KeyEvent.VK_5);
			r.keyRelease(java.awt.event.KeyEvent.VK_5);
		}
		
		r.keyPress(java.awt.event.KeyEvent.VK_0);
		r.keyRelease(java.awt.event.KeyEvent.VK_0);
	
		r.keyPress(java.awt.event.KeyEvent.VK_3);
		r.keyRelease(java.awt.event.KeyEvent.VK_3);
		
		r.keyPress(java.awt.event.KeyEvent.VK_8);
		r.keyRelease(java.awt.event.KeyEvent.VK_8);
		
		r.keyPress(java.awt.event.KeyEvent.VK_0);
		r.keyRelease(java.awt.event.KeyEvent.VK_0);
		
		r.keyPress(java.awt.event.KeyEvent.VK_2);
		r.keyRelease(java.awt.event.KeyEvent.VK_2);
		
		r.keyPress(java.awt.event.KeyEvent.VK_7);
		r.keyRelease(java.awt.event.KeyEvent.VK_7);
		
		r.keyPress(java.awt.event.KeyEvent.VK_4);
		r.keyRelease(java.awt.event.KeyEvent.VK_4);
	
	System.out.println("Mobile number entered");
	
	MobileElement pinnumber = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ListView/android.view.View[3]/android.view.View/android.view.View/android.widget.EditText"));
	pinnumber.click();
	
	for (int i = 0; i <5; i++) {
		r.keyPress(java.awt.event.KeyEvent.VK_7);
		r.keyRelease(java.awt.event.KeyEvent.VK_7);
	}
	
	System.out.println("Pin number entered");
	 
	Thread.sleep(1500);
	
	MobileElement confirmpinnumber = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ListView/android.view.View[4]/android.view.View/android.view.View/android.widget.EditText"));
	confirmpinnumber.click();
	for (int i = 0; i <5; i++) {
		r.keyPress(java.awt.event.KeyEvent.VK_7);
		r.keyRelease(java.awt.event.KeyEvent.VK_7);
	}
	
	System.out.println("pin number entered again");
	
	MobileElement pincode = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ListView/android.view.View[5]/android.view.View/android.view.View/android.widget.EditText"));
	pincode.click();
	for (int i = 0; i <7; i++) {
		r.keyPress(java.awt.event.KeyEvent.VK_6);
		r.keyRelease(java.awt.event.KeyEvent.VK_6);
	}
	
	System.out.println("pincode entered");
	
	driver.navigate().back();
	
	MobileElement submitbutton = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Submit\"]"));
	submitbutton.click();
	
	
	System.out.println("submit button clicked");
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	

}
