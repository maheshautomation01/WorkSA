package com.wsa.qa.testcases;

import junit.framework.Assert;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wsa.qa.pages.LoginPage;
import com.wsa.qa.pages.NewProbAddNewOwnerPage;
import com.wsa.qa.pages.WbwExpNewProp_TourLookup;
import com.wsa.qa.pages.WsaHomePage;
import com.wsa.qa.testbase.TestBase;

public class WbwExpNewProp_TourLookupTest extends TestBase {
	
	LoginPage loginpage;
	WsaHomePage homepage;
	WbwExpNewProp_TourLookup wbwtourlookup;
	NewProbAddNewOwnerPage addnewowner;
	
	
	
	public WbwExpNewProp_TourLookupTest(){
		super();
		
	}
	
	@BeforeTest
	public void setup() throws Exception{
		initialization();
		
		loginpage = new LoginPage();
		homepage = loginpage.Login(prob.getProperty("username"), prob.getProperty("password"));	
		wbwtourlookup = new WbwExpNewProp_TourLookup();
		addnewowner = new NewProbAddNewOwnerPage();
		
	}
	
	@Test
	public void wbwMenuTest() throws Exception{
		homepage.WBWselectExperinceMenu();
		
	}
	
	@Test
	public void wbwTourLookUpTest() throws Exception{
		wbwtourlookup.enterTourNo(prob.getProperty("Tour_No"));
		System.out.println("TourNo Field is present");
		Thread.sleep(5);
		wbwtourlookup.selectCustRadioBtn();
		addnewowner = wbwtourlookup.continueBtn();
		
	}
	
	
	
	
	
	
	@AfterTest
	public void teardown(){
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
