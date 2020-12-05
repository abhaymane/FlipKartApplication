package com.qa.Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.BasePage.BaseClass;

public class LoginPage extends BaseClass {
	WebDriver driver;
	@FindBy(xpath="//input[@type='text' and @class='_2IX_2- VJZDxU']")
	WebElement username;
	@FindBy(xpath ="//input[@type='password' and @class='_2IX_2- _3mctLh VJZDxU']")
	WebElement password;
	@FindBy(xpath ="//button[@type='submit' and @class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement loginBtn;
	@FindBy(xpath="//div[contains(text(),'Logout')]")
	WebElement logout;
	
public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void verifyLoginPageTitle() {
	String title = driver.getTitle();
	System.out.println("Login page title: "+title);
	Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
}
public HomePage loginToApplication(String user,String pass) {
	username.sendKeys(user);
	password.sendKeys(pass);
	loginBtn.click();
	return home;
}
public void logoutToApplication() throws InterruptedException {
	Actions action=new Actions(driver);
	WebElement myAccount=driver.findElement(By.xpath("//div[text()='My Account']"));
	action.moveToElement(myAccount).build().perform();
	Thread.sleep(5000);
	logout.click();

}

}
