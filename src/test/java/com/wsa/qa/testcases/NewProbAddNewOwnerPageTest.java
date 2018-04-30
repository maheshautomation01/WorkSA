package com.wsa.qa.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wsa.qa.util.ExcelReader;
import com.wsa.qa.pages.LoginPage;
import com.wsa.qa.pages.NewProbAddNewOwnerPage;
import com.wsa.qa.pages.NewProbExPackOptionPage;
import com.wsa.qa.pages.WbwExpNewProp_TourLookup;
import com.wsa.qa.pages.WsaHomePage;
import com.wsa.qa.testbase.TestBase;

public class NewProbAddNewOwnerPageTest extends TestBase{
	
	LoginPage loginpage;
	WsaHomePage homepage;
	WbwExpNewProp_TourLookup wbwtourlookup;
	NewProbAddNewOwnerPage addnewowner;
	NewProbExPackOptionPage expackoptionpage;
	
	
	
	public NewProbAddNewOwnerPageTest  (){
		super();
	}
	
	@BeforeTest
	public void setup() throws Exception{
		initialization();
		loginpage = new LoginPage();
		wbwtourlookup = new WbwExpNewProp_TourLookup();
		addnewowner = new NewProbAddNewOwnerPage();
		expackoptionpage = new NewProbExPackOptionPage();
		homepage = loginpage.Login(prob.getProperty("username"), prob.getProperty("password"));	
		homepage.WBWselectExperinceMenu();
		wbwtourlookup.enterTourNo(prob.getProperty("Tour_No"));
		wbwtourlookup.selectCustRadioBtn();
		wbwtourlookup.continueBtn();
		
		
	}
	
	@Test(dataProvider="ExceldataRead")
	public void enterCustInfoTest(String fname,String lname,String ssn,String dob,String add1, String add2,String add3,String city,String state,String county,String country,String postcode,String email,String hphone, String wphone,String sex) throws Exception{
		
		
		
		addnewowner.firstName(fname);
		addnewowner.lastName(lname);
		addnewowner.ssn(ssn);
		addnewowner.dateOfBirth(dob);
		addnewowner.address1(add1);
		addnewowner.address2(add2);
		addnewowner.city(city);
		addnewowner.country(country);
		//addnewowner.state(state);
		addnewowner.state(state);
		addnewowner.postalCode(postcode);
		addnewowner.county(county);
		addnewowner.email(email);
		addnewowner.homePhone(hphone);
		addnewowner.workPhone(wphone);
		addnewowner.gender(sex);
		addnewowner.addMember();
		addnewowner.PrimaryOwnerChkBox();
		//Thread.sleep(3000);
		//expackoptionpage= addnewowner.continueeButton();
		homepage.WBWselectExperinceMenu();
		//Thread.sleep(2000);
		wbwtourlookup.clearTourNo();
		wbwtourlookup.enterTourNo(prob.getProperty("Tour_No"));
		wbwtourlookup.selectCustRadioBtn();
		wbwtourlookup.continueBtn();
		
		
	}
	
	
	@DataProvider
	public Object[][] ExceldataRead() throws Exception{
		Object data[][]=ExcelReader.dataread("C:\\Mahesh- WVO\\Automation\\TestData\\200_Address List.xlsx", "InterNational_CAN_AUS");
		return data;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
