package com.hybrid.javaPageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjectClass {

WebDriver driver;
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(xpath="/html/body/div[2]/main/div[3]/div/div[2]/div[1]/div[2]/form/fieldset/div[4]/div[1]/button/span")
	WebElement SignBtn;
	
	public LoginPageObjectClass (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Entercred(String em,String paasd) {
		
		username.sendKeys(em);
		password.sendKeys(paasd);
	}
	
	public void ClickOnLogInBtn() {
		SignBtn.click();
	}

}

