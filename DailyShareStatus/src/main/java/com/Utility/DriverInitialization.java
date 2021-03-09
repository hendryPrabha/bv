package com.Utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInitialization {
	public static WebDriver driver;
	public static Properties prop;
	public static String URL;
	public static  String Browser;
	
	
	/*public DriverInitialization(WebDriver driver, String URL){
		this.driver=driver;
		this.URL=URL;
	} */
	
	public static Properties propertyInstance() throws IOException {
		prop=new Properties();
		FileReader read=new FileReader("E:\\Automation_selenium\\DailyShareStatus\\src\\test\\Config.properties");
		BufferedReader reader=new BufferedReader(read);
		prop.load(reader);
		return prop;
		
	}
	
	
	
	public static WebDriver StartDriver() throws Exception {
		// TODO Auto-generated method stub
		propertyInstance();
		Browser=prop.getProperty("Browser");
		URL=prop.getProperty("URL");
		
		if(Browser.equalsIgnoreCase("Chrome")) {
          WebDriverManager.chromedriver().setup();
          driver=new ChromeDriver();
          //driver.get(URL);
		  return driver;
	}
		else if(Browser.equalsIgnoreCase("Firfox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			//driver.get(URL);
			return driver;
		}
		else {
			 WebDriverManager.chromedriver().setup();
	          driver=new ChromeDriver();
	          //driver.get(URL);
			return driver;
		}
			
		}

}
