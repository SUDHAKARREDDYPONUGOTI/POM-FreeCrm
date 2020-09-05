package com.crm.qa.utils;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIME = 20;
	public static long IMPLICITY_TIME = 10;
	
	public void switchToFrame() {
		
		driver.switchTo().frame("");
		
	}
	
}
