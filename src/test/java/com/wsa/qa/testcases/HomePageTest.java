package com.wsa.qa.testcases;



import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wsa.qa.pages.LoginPage;
import com.wsa.qa.pages.WsaHomePage;
import com.wsa.qa.testbase.TestBase;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	WsaHomePage homepage;
	
	
	public HomePageTest(){
		super();
	}
	
	@BeforeTest
	public void setup() throws Exception{
	initialization();
	loginpage = new LoginPage();
	homepage = new WsaHomePage();
	homepage=loginpage.Login(prob.getProperty("username"), prob.getProperty("password"));
	//Thread.sleep(5000);
	}
	
	@Test
	public void homePageHeadertest() throws Exception{
				
		String headertxt = homepage.validateHomePageheader();
		System.out.println("============="+headertxt+"===============");
		Assert.assertEquals("Wyndham Sales Center", headertxt);
		homepage.selectNewProposal();
		homepage.WBWselectExperinceMenu();	
		System.out.println("Experience Proposal Link is working");
		System.out.println(driver.getCurrentUrl());
		homepage.WBWselectOwnershipMenu();
		System.out.println("Experience Proposal Link is working");
		System.out.println(driver.getCurrentUrl());
		
	
	}
	
		

}
