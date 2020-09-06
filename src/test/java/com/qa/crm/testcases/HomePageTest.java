package com.qa.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	 HomePage homepage;
	 LoginPage loginpage;
	
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialize();
		loginpage = new LoginPage();
		loginpage.ClickOnLogin();
		homepage = loginpage.LoginPageButton(prop.getProperty("username"), prop.getProperty("password"));	
	}
	
	@Test(priority = 1)
	public void verifylogoTest(){
		
		String homepageTitle = homepage.VerifyContactLogo();
		Assert.assertEquals(homepageTitle, "Cogmento CRM");
	}
	
	@Test(priority = 2)
	public void ClickonFreeAccountLinkTest() {
		homepage.clickOnFreeAccount();
	}
	
	@Test(priority = 3)
	public void clickOnContactsLink() {
		homepage.clickOnContacts();
	}
	
	@Test(priority = 4)
	public void ClickOnNamelink() {
		homepage.clickOnContacts();
		homepage.clickOnName();
	}
	
	@AfterMethod(enabled = false)
	public void closebrowser() {
		
		driver.quit();
	}

}
