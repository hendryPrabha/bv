package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.DriverInitialization;

public class BaseClass extends DriverInitialization {
	
	@BeforeMethod
	public void PlayDriver() throws Exception {
		StartDriver();
		String AppUrl=prop.getProperty("URL");
		
		driver.manage().window().maximize();
		
	    driver.navigate().to(AppUrl);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
		
	}
}
