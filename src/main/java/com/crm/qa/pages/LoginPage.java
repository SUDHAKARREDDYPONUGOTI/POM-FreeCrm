package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.model.Log;
import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath = "//a[@class='brand-name']")
	WebElement crmlogo;
	
	@FindBy(xpath = "//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']/span[2]")
	WebElement login;
	
	@FindBy(xpath = "//input[contains(@name,'email')]")
	WebElement username;
	
	@FindBy(xpath = "//input[contains(@name,'password')]")
	WebElement password;
	
	@FindBy(xpath = "//div[contains(@class,'ui fluid large blue submit button')]")
	WebElement Loginbutton;
	
	
	//Intializing the Page Objects
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	// Actions:
	
	public String GetTitleLogo() {
		
		return driver.getTitle();
	}
	
	
	public boolean ValidateLogo() {
		return	crmlogo.isDisplayed();
	}
	
	public void ClickOnLogin() {
		
		login.click();
	}
	
	public HomePage LoginPageButton(String usr , String pwd) {
		username.sendKeys(usr);
		password.sendKeys(pwd);
		Loginbutton.click();
		return new HomePage();
	}
	
}
