package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.SheetNameFormatter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


import com.crm.qa.utils.TestUtil;
import com.crm.qa.utils.WebEventListner;

public class TestBase {
	
	public static WebDriver driver;

	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListner eventListener;
	
	

	public TestBase() {

		try {
			prop = new Properties();

			FileInputStream fip = new FileInputStream("F:\\BDD Farmework Workspace\\POM-FreeCrm\\src\\main\\java\\"
					+ "com\\crm\\qa\\config\\config.properties");

			prop.load(fip);

		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	



	public static void initialize() {

		String browser = prop.getProperty("browser");

		if (browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", 
					"F:\\BDD Farmework Workspace\\POM-FreeCrm\\Browsers\\chromedriver.exe");
			 driver = new ChromeDriver();
		}else if (browser.equals("FF")) {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\sponugoti\\workspace\\POM-FreeCrm\\Browsers\\chromedriver.exe");
			 driver = new FirefoxDriver();

		}else if (browser.equals("IE")) {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\sponugoti\\workspace\\POM-FreeCrm\\Browsers\\chromedriver.exe");
			 driver = new InternetExplorerDriver();
		}
		
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListner();
		e_driver.register(eventListener);
		driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITY_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
}
