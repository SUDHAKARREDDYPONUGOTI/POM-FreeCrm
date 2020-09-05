package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//a[@class='item' and span[contains(text(),'Contacts')]]//span")
	WebElement contactsbtn;

	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[1]/text()")
	WebElement ContactsLogo;

	@FindBy(xpath = "descending sorted")
	WebElement Name;
	
	@FindBy(xpath = "//span[@class='trial-indicator']/a[1]")
	WebElement FreeAccount;
	

	public String VerifyContactLogo() {
		return driver.getTitle();
	}
	
	public void clickOnFreeAccount() {
		FreeAccount.click();
	}

	public void clickOnContacts() {

		contactsbtn.click();
	}

	public void clickOnName() {

		Name.click();
	}
}
