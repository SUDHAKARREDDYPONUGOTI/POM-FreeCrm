package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	

	

	@FindBy(xpath = "//div[@class='ui fluid container main-content']/table/thead/tr/th[contains(text(),'Name')]")
	WebElement NameColumn;
	
	@FindBy(xpath = "//div[@id='main-nav']/a[@class='item']/span[contains(text(),'Deals')]")
	WebElement clickOnDeals;
	
	@FindBy(xpath = "//button[@class='ui linkedin button'][contains(text(),'New')]")
	WebElement New_Button;
	
	@FindBy(xpath = "//button[@class='ui linkedin button']/i[@class='save icon']")
	WebElement Save_Button;
	
	@FindBy(xpath = "//input[@name='first_name']")
	WebElement First_Name;
	
	@FindBy(xpath = "//input[@name='last_name']")
	WebElement Last_Name;
	
	@FindBy(xpath = "//input[@name='middle_name']")
	WebElement Middle_Name;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement Email;


	public ContactsPage() {

		PageFactory.initElements(driver, this);
	}
	
	public void clickOnNew() {
		
		New_Button.click();
	}
	
	
	public void EnterFormData(String Fname, String Lname,String Mname, String email) {	
		
		First_Name.sendKeys(Fname);
		Last_Name.sendKeys(Lname);
		Middle_Name.sendKeys(Mname);
		Email.sendKeys(email);
		
		Save_Button.click();
	}
	
	
	
	
	
	
	

	
//	public void clickOnName() {
//		NameColumn.click();
//
//	}
	
	public void clickDealspageMenu() {
		
		clickOnDeals.click();
		
		
	}


}



