package com.wsa.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wsa.qa.testbase.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy (id="fldUsername")
	WebElement usernametxt;
	
	@FindBy (id="fldPassword")
	WebElement passwordtxt;
	
	@FindBy (name="cn-submit")
	WebElement loginbtn;
	
	@FindBy (xpath="//img[contains(@class='/wsa/images/wvo-logo.jpg']")
	WebElement wynlogo;
	
	@FindBy (xpath="//*[text()='Wyndham Sales Center']")
	WebElement loginpagesiteheader;
	
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean validateHomePageLogo(){
	boolean homepagelogo=	wynlogo.isDisplayed();
	return homepagelogo;
	}
	
	
	public boolean validateHomePageHeader(){
	boolean homepageheader = loginpagesiteheader.isDisplayed();
	return homepageheader;
	}
	
	public String pageSiteHeader(){
		String headername = loginpagesiteheader.getText();
		return headername;
		
	}
	
	
	
	public WsaHomePage Login(String uname, String pwd) throws Exception{
		usernametxt.sendKeys(uname);
		passwordtxt.sendKeys(pwd);
		System.out.println(pwd);
		loginbtn.click();
		return new WsaHomePage();
		
	}	
	

}
