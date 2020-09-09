package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath = "//div[@class='ui fluid container main-content']/table/thead/tr/th[contains(text(),'Name')]")
	WebElement Name;
	
	
public ContactsPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnName() {
		Name.click();
				
	}
	

}



