package com.qa.Utility;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ConfigDataProvider {
	WebDriver driver;
	Properties prop;
	public ConfigDataProvider() {
		File fs = new File("D:\\Mavan\\flipKart\\Properties\\config.properties");
		try {
			FileInputStream fis = new FileInputStream(fs);
			prop=new Properties();
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getBrowser() {
		return prop.getProperty("Browser");
	}
	public String getUrl() {
		return prop.getProperty("Url");
	}
	public String getUsername() {
		return prop.getProperty("Username");
	}
	public String getPassword() {
		return prop.getProperty("Password");
	}

}
