package mobileautomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Demo {
	
	 static AppiumDriver <MobileElement> driver;
	 
	public static void main(String[] args) throws MalformedURLException {
		
		
		
	DesiredCapabilities cap = new DesiredCapabilities();
	
	cap.setCapability("devicename", "Samsung");
	
	cap.setCapability("udid", "");//device id
	
	cap.setCapability("platformName", "Android");
	
	cap.setCapability("platformVersion", "");//android version
	
	cap.setCapability("appPackage", "com.news.hindutamil");//app info
	
	cap.setCapability("appActivity", "com.news.hindutamil.MainAtivity");
	
	URL url = new URL("http://127.0.0.1:4723/wd/hub");//Appium url
	
	driver = new AppiumDriver<MobileElement>(cap);
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	

}
