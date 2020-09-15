package com.qa.crm.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utils.TestUtil;

public class ContactsPageTest extends TestBase {
	
	LoginPage loginpage;
	
	HomePage homepage;
	
	ContactsPage contactpage;
	
	DealsPage dealspage;
	
	String sheetName = "contacts";
	
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
	
	
	@DataProvider
	public Object[][] getCRMTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority = 1, dataProvider = "getCRMTestData")
	public void filledForm(String firstname, String lastname, String middlename, String email) {
		contactpage.clickOnNew();
	//	contactpage.EnterFormData("hello", "man", "Reddy", "babu");
		
		contactpage.EnterFormData(firstname, lastname, middlename, email);
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
