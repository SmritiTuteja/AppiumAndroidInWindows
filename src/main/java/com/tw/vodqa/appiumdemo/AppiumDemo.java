package com.tw.vodqa.appiumdemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumDemo {

	AndroidDriver<MobileElement> driver;

	@Before
	public void setUp() throws MalformedURLException{
		DesiredCapabilities caps = new DesiredCapabilities() ;
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus");
		caps.setCapability(MobileCapabilityType.APP_PACKAGE, "org.wordpress.android");
		caps.setCapability(MobileCapabilityType.APP_ACTIVITY, "org.wordpress.android.ui.WPLaunchActivity");
		driver = new AndroidDriver<MobileElement>(new URL ("http://127.0.0.1:4723/wd/hub"),caps);	
	}
		
	@Test
	public void testApp() throws  InterruptedException{
		driver.findElement(By.id("org.wordpress.android:id/nux_username")).sendKeys("vodqa@gmail.com");
		driver.findElement(By.id("org.wordpress.android:id/nux_password")).sendKeys("Hello12345678");
		driver.findElement(By.id("org.wordpress.android:id/nux_sign_in_button")).click();
		Thread.sleep(50000);
	}
		
	@After
	public void kil(){
		driver.quit();
	}
}
