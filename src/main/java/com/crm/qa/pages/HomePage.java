package com.crm.qa.pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//div[@id='main-nav']/a[@class='item']/span[contains(text(),'Contacts')]")
	WebElement contactsbtn;

	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[1]/text()")
	WebElement ContactsLogo;

	
	
	@FindBy(xpath = "//div[@id='top-header-menu']//div[3]//span[@class='trial-indicator']/a[contains(text(),'Free account')]")
	WebElement FreeAccount;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}

	public String VerifyContactLogo() {
		return driver.getTitle();
	}
	
	public void clickOnFreeAccount() {
		 FreeAccount.click();		
	}

	public ContactsPage clickOnContacts() {	
		contactsbtn.click();
		return null;	
	
	}

	
}
