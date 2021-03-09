package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.DriverInitialization;

public class TestCase_001 extends DriverInitialization {
	
	@BeforeTest
	public void PlayDriver() throws Exception {
		StartDriver();
		driver.manage().window().maximize();
	    driver.navigate().to("https://www.moneycontrol.com/stocks/marketstats/nsegainer/index.php");
	}
	
	@Test
	public void GetGainRecords() throws Exception {
	
}
}
