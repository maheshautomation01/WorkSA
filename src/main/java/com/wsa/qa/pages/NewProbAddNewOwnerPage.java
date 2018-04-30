package com.wsa.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.wsa.qa.testbase.TestBase;

public class NewProbAddNewOwnerPage extends TestBase {
	
	@FindBy (id="firstName")
	WebElement firstnametxt;
	
	@FindBy (id="lastName")
	WebElement lastnametxt;
	
	@FindBy (id="ssn")
	WebElement ssntxt;
	
	@FindBy (id="dob")
	WebElement dateofbirthtxt;
	
	@FindBy (name="physicalAddress.address1")
	WebElement address1txt;
	
	@FindBy (name="physicalAddress.address2")
	WebElement address2txt;
	
	@FindBy (name="physicalAddress.city")
	WebElement citytxt;
	
	@FindBy (id="addNewOwner_physicalAddress_stateProvince")
	WebElement statedropdown;
	
	@FindBy (name="physicalAddress.postalCode")
	WebElement postalcodetxt;
	
	@FindBy (name="physicalAddress.county")
	WebElement countytxt;
	
	@FindBy (id="addNewOwner_physicalAddress_country")
	WebElement countrydropdown;
	
	@FindBy (name="emailAddress")
	WebElement emailtxt;
	
	@FindBy (id="homePhone")
	WebElement homphonetxt;
	
	@FindBy (id="workPhone")
	WebElement workphonetxt;
	
	@FindBy (id="gender")
	WebElement genderdropdown;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement addmemberbtn;
	
	@FindBy (xpath="//input[@name='selected']")
	WebElement primaryownerchkbox;
	
	@FindBy (xpath="form//input[@name='btn-newOwnerContinue' and @id='btn-newOwnerContinue'] ")
	WebElement continueebtn;
	
	
	//-------------------------------------------------------------------------------		
	
	public NewProbAddNewOwnerPage(){
		PageFactory.initElements(driver, this);
	}
	
	
//-------------------------------------------------------------------------------	
	
	public void firstName(String a){
		firstnametxt.sendKeys(a);
	}
	
	public void lastName(String b){
		lastnametxt.sendKeys(b);
	}
		
	public void ssn(String c){
		ssntxt.sendKeys(c);
	}
		
	public void dateOfBirth(String d){
		dateofbirthtxt.sendKeys(d);
	}
		
	public void address1(String e){
		address1txt.sendKeys(e);
	}
		
	public void address2(String f){
		address2txt.sendKeys(f);
	}
		
	public void city(String g){
		citytxt.sendKeys(g);
	}
		
	public void country(String h){
		Select country = new Select (countrydropdown);
		countrydropdown.click();
		country.selectByVisibleText(h);
	}
			
	public void state(String i){
		Select state = new Select (statedropdown);
		statedropdown.click();
		int ii = Integer.parseInt(i);
		System.out.println(i);
		state.selectByIndex(ii);
	}	
		
	public void postalCode(String j){
		postalcodetxt.sendKeys(j);
	}	
		
	public void county(String k){
		countytxt.sendKeys(k);
	}		

	public void email(String l){
		emailtxt.sendKeys(l);
	}		
		
	public void homePhone(String m){
		homphonetxt.sendKeys("66666"+m);
	}
		
	public void workPhone(String n){
		workphonetxt.sendKeys("55555"+n);
	}
	
	public void gender(String sex){
		Select gender = new Select(genderdropdown);
		genderdropdown.click();
		gender.selectByVisibleText(sex);
	}
	

	public void addMember(){
		addmemberbtn.click();
	}

	public void PrimaryOwnerChkBox(){
		primaryownerchkbox.click();
	}
	
	
	public NewProbExPackOptionPage continueeButton(){
		continueebtn.click();
		return new NewProbExPackOptionPage();
	}
	
	
}
