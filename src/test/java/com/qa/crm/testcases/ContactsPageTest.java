package com.qa.crm.testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class ContactsPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contatpage;
	
	public ContactsPageTest() {
		
		super();
	}
	
	@BeforeTest
	public void Setup(){
		
		homepage = new HomePage();
		initialize();		
		homepage = loginpage.LoginPageButton(prop.getProperty("username"), prop.getProperty("password"));	
		loginpage.ClickOnLogin();

	}

	@Test
	public void ClickOnNamelink() {
		homepage.clickOnContacts();
		contatpage.clickOnName();
	}
	
	

}
