package com.qa.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	public static WebDriver browsersetUp(WebDriver driver,String browser,String url) {
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",".//Driver//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",".//Driver//geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("Do not matching browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}
	

}
