package com.qa.crm.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class ContactsPageTest extends TestBase {
	
	LoginPage loginpage;
	
	HomePage homepage;
	
	ContactsPage contactpage;
	
	DealsPage dealspage;
	
	public ContactsPageTest() {
		
		super();
	}
	
	@BeforeTest
	public void Setup(){
		initialize();
		loginpage = new LoginPage();
		loginpage.ClickOnLogin();
		dealspage = new DealsPage();
		contactpage = new ContactsPage();
		homepage = loginpage.LoginPageButton(prop.getProperty("username"), prop.getProperty("password"));	
		homepage.clickOnContactLink(); // should call coontactclick from homepage
	}
	

	
	@Test(enabled = false)
	public void clickOnNameColumnTest() {

	//	contactpage.clickOnName();
	}
	
	
	
	@Test(priority = 1)
	public void filledForm(String Fname, String Lname,String Mname, String email) {
		try {
		// contactpage.clickOnNew();
		contactpage.EnterFormData("POLICE BABU", "LAWYER BABU", "DOCTER", "Test5555@gmail.com");
		// contactpage.clickOnSaveButton();
		}catch (Exception e) {
		System.out.println("No TestNG native expection");
		}
	}
	
	
	
	
	
	
	
	@Test(enabled = false)
	public void clickOnDelasPage() {
		
	contactpage.clickDealspageMenu();

	}

	
	
	@AfterMethod
	public void tearDown() {
		
	//	driver.quit();
	}
	

}
