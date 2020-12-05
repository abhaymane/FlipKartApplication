package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement searchText;
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchBtn;
	@FindBy(xpath="//span[text()='Cart']")
	WebElement cartMenu;
	@FindBy(xpath="//div[contains(text(),'Realme Narzo 20 (Glory Silver, 64 GB)')]")
	WebElement selectedItem;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		 String title = driver.getTitle();
		 System.out.println("Homepage title is: "+title);
		// Assert.assertEquals(title,"");
		return title;
	}
	
	public boolean verifyCartMenu() {
		boolean flag = cartMenu.isDisplayed();
		System.out.println(flag);
		return flag;
	}
	
	public void sendText() {
		searchText.sendKeys("Mobile");
		searchBtn.click();
	}
	public void selectProduct() {
		selectedItem.click();
	}

}
