package com.qa.TestCases;

import org.testng.annotations.Test;

import com.qa.BasePage.BaseClass;
import com.qa.Pages.LoginPage;

public class LoginPageTest extends BaseClass {
	@Test
	public void loginPageTest() throws InterruptedException {
		
		
		page=new LoginPage(driver);
		
		page.loginToApplication(configData.getUsername(),configData.getPassword());
		
		//page.verifyLoginPageTitle();
		//page.logoutToApplication();
	}
	
}
