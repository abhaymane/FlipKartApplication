package com.qa.TestCases;

import org.testng.annotations.Test;

import com.qa.BasePage.BaseClass;
import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;

public class HomePageTest extends BaseClass{
	@Test
	public void verifyHomePageTitleTest() {
		page=new LoginPage(driver);
		page.loginToApplication(configData.getUsername(),configData.getPassword());
		home=new HomePage(driver);
		home.verifyHomePageTitle();
		home.sendText();
	}

}
