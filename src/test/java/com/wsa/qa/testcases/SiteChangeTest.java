package com.wsa.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wsa.qa.pages.LoginPage;
import com.wsa.qa.pages.SiteChange;
import com.wsa.qa.pages.WsaHomePage;
import com.wsa.qa.testbase.TestBase;

public class SiteChangeTest extends TestBase{
	LoginPage loginpage;
	WsaHomePage homepage;
	SiteChange sitechange;
	
	
	
	
	public SiteChangeTest(){
		super();
		
	}
	
	
	@BeforeMethod
	public void setup() throws Exception{
		initialization();
		loginpage = new LoginPage();
		homepage = new WsaHomePage();
		sitechange = new SiteChange();
		homepage=loginpage.Login(prob.getProperty("username"), prob.getProperty("password"));
	}
	
	
//	@Test(priority=1)
//	public void selectWVRSiteTest() throws Exception{
//		sitechange.selectWVRsite(prob.getProperty("WVRSITE"));
//		
//	}
	
	
	@Test(priority=2)
	public void selectWBWSiteTest() throws Exception{
		sitechange.selectWBWsite(prob.getProperty("WBWSITE"));
	}
	
//	@AfterMethod
//	public void teardown(){
//		driver.close();
//	}
//	
	
	
	
	
	
	
	
	

}
