package com.hybrid.testclass;

import org.testng.annotations.Test;

import com.hybrid.javaPageClass.DashboardPageObjectClass;
import com.hybrid.javaPageClass.LoginPageObjectClass;
import com.hybrid.javaPageClass.MainPageObjectClass;

public class TcLogInTestCase extends BaseClass{
	
	@Test(description="click the operation signup and signout test case",priority=1)
	public void Signup() throws InterruptedException {
		
		driver.get(Url);
		logger.info("Url is entered");//set the logger
		
		driver.manage().window().maximize();
		logger.info("screen maximize");
		
		driver.manage().deleteAllCookies();
		logger.info("deleted all cookies");
		
		driver.navigate().refresh();
		logger.info("window refresh");
		
		MainPageObjectClass mp=new MainPageObjectClass(driver);    //1 main signUp page operation
		
		mp.LogInBtn();
		logger.info("clicked the main signin page");
		Thread.sleep(2000);
		
		LoginPageObjectClass lpc=new LoginPageObjectClass(driver);//2// signUp page operation 
		
		lpc.Entercred("akashumap1313@gmail.com","Akash@1313");
		logger.info("credential funtion is entered");
		lpc.ClickOnLogInBtn();
		Thread.sleep(2000);
		
		DashboardPageObjectClass dpc=new DashboardPageObjectClass(driver);//3 signOut page Operation
		
		dpc.ClickdnBtn();
		logger.info("clicked the sighin down button");
		Thread.sleep(1000);
		
		dpc.ClickSignOutBtn();
		logger.info("click the signout button");
		Thread.sleep(2000);
		
		
		
	}

}

	
	


