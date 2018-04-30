package com.wsa.qa.testcases;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wsa.qa.pages.LoginPage;
import com.wsa.qa.pages.WsaHomePage;
import com.wsa.qa.testbase.TestBase;

public class LoginPageTest extends TestBase{
	
	LoginPage loginpage;
	WsaHomePage homepage;
	
	
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeTest
	public void setup(){
		initialization();
		loginpage = new LoginPage();
		homepage = new WsaHomePage();
	}
	
	
//	public void validateHomePageLogotest(){
//	 boolean logoresult= loginpage.validateHomePageLogo();
//	 System.out.println(logoresult);
//	 }
//	
	@Test
	public void loginpageTest() throws Exception{
	String siteheader = loginpage.pageSiteHeader();
	System.out.println(siteheader);
	homepage=loginpage.Login(prob.getProperty("username"), prob.getProperty("password"));
				
	}
	
	
	@AfterTest
	public void teardown(){
		driver.quit();
	}
	
	
	
	
	
	
	
	

}
