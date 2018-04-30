package com.wsa.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wsa.qa.testbase.TestBase;

public class WbwExpNewProp_TourLookup extends TestBase{
	
	
	@FindBy (xpath="//*[text() ='Tour Lookup']")
	WebElement fieldheader;
	
	@FindBy (id="tourNumber")
	WebElement tourno;
	
	
	@FindBy (xpath="//button[@name='cn-submit']")
	WebElement submitbtn;
	
	@FindBy (id="rad_0")
	WebElement customerradiobtn;
	
	@FindBy (xpath="//button[@id='btn-continue']")
	WebElement continuebtn;
//	
//	@FindBy ()
//	WebElement aaa;
//	
//	@FindBy ()
//	WebElement aaa;
	
	public WbwExpNewProp_TourLookup (){
		PageFactory.initElements(driver, this);
	}
	
	
	public String tourLoopHeader(){
		String lookuppageheader = fieldheader.getText();
		System.out.println("=================="+lookuppageheader);
		return lookuppageheader;
	}
	
	public void clearTourNo() throws Exception{
		tourno.clear();
	//TestUtil.selectExperienceProposalMenu();		
}
	
	public void enterTourNo(String tno){
		
		tourno.sendKeys(tno);
		submitbtn.click();
	}
	
	public void selectCustRadioBtn(){
		customerradiobtn.click();
	}
	
	public void editCustInfo(){
		
	}
	
	
	public NewProbAddNewOwnerPage continueBtn(){
		continuebtn.click();
		return new NewProbAddNewOwnerPage();
	}
	
	
	
	
	

}
