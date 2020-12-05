package com.qa.BasePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;
import com.qa.Utility.BrowserFactory;
import com.qa.Utility.ConfigDataProvider;

public class BaseClass {
	public WebDriver driver;
	public LoginPage page;
	public ConfigDataProvider configData;
	public HomePage home;
	@BeforeSuite
	public void setUpBrowser() {
		configData=new ConfigDataProvider();	
	}
	@BeforeClass
	public void init() {
		
		driver=BrowserFactory.browsersetUp(driver,configData.getBrowser(),configData.getUrl());
	}
	
	@AfterMethod
	public void tearDown() {
	//driver.quit();
	}
	

}
