package com.Utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
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
	public static  String AppBrowser;
	public static FileReader read;
	
	
	/*public DriverInitialization(WebDriver driver, String URL){
		this.driver=driver;
		this.URL=URL;
	} */
	
	public static Properties propertyInstance() throws IOException {
		prop=new Properties();
		try {
		read=new FileReader(System.getProperty("user.dir")+"\\src\\test\\Config.properties");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	
		BufferedReader reader=new BufferedReader(read);
		prop.load(reader);
		return prop;
		
	}
	
	
	
	public static WebDriver StartDriver() throws Exception {
		// TODO Auto-generated method stub
		propertyInstance();
		try {
		AppBrowser=prop.getProperty("Browser");
		URL=prop.getProperty("URL");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		if(AppBrowser.equalsIgnoreCase("Chrome")) {
          WebDriverManager.chromedriver().setup();
          driver=new ChromeDriver();
          //driver.get(URL);
		  return driver;
	}
		else if(AppBrowser.equalsIgnoreCase("Firfox")){
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
