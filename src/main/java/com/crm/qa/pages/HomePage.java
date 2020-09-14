package com.crm.qa.pages;



import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	

	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[1]/text()")
	WebElement ContactsLogo;

	
	
	@FindBy(xpath = "//div[@id='top-header-menu']//div[3]//span[@class='trial-indicator']/a[contains(text(),'Free account')]")
	WebElement FreeAccount;
	
	@FindBy(xpath="//div[@id='main-nav']/a[@class='item']/span[contains(text(),'Contacts')]")
	WebElement clickOnContactLink;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}

	public String VerifyContactLogo() {
		return driver.getTitle();
	}
	
	public void clickOnFreeAccount() {
		 FreeAccount.click();		
	}


	public ContactsPage clickOnContactLink() {
		clickOnContactLink.click();
		return null;
	}



	
	
}
