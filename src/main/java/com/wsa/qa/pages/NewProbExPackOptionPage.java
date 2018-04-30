package com.wsa.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wsa.qa.testbase.TestBase;

public class NewProbExPackOptionPage extends TestBase {
	
	@FindBy (xpath="//h2[@class='pad-0-b pad-0-t black']")
	WebElement custname;
	
	@FindBy (css ="//div[class='CustomHTML'] p:nth-child(3)")
	WebElement custadress;
	
	
	
	public NewProbExPackOptionPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	

}
