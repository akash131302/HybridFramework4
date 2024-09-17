package com.hybrid.testclass;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.hybrid.Utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public static WebDriver driver;
	
	public static Logger logger;
	
	ReadConfig rg=new ReadConfig();
	
	String Url=rg.getBaseUrl();
	String browser=rg.getBrowser();
	
	@BeforeClass
	public void setup() {
		
		switch(browser.toLowerCase()) {
		
		case"chrome":
		   WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		
		case"edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		case"firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
	   break;
	     
	   default:driver=null;
	   
	   break;
	          }
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		
		logger=LogManager.getLogger("HybridFramework2");
	}
	
	
	
	@AfterClass
	public void tearup() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.close();
		
		
	}


}
