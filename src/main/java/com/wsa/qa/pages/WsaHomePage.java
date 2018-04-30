package com.wsa.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wsa.qa.testbase.TestBase;
import com.wsa.qa.util.TestUtil;

public class WsaHomePage extends TestBase {
	
	
	@FindBy (xpath="//h1[text()='Wyndham Sales Center']")
	WebElement homepageheader;
	
	@FindBy (xpath="//img[@src='/wsa/images/wvo-logo.jpg']")
	WebElement homepagelogo;
	
	@FindBy (xpath="//a[text()='New Proposal']")
	WebElement newProposalmenu;
	
	@FindBy (xpath="//a[text()='Owner Lookup']")
	WebElement ownerlookupmenu;
	
	@FindBy (xpath="//a[text()='Upgrade/Conversion']")
	WebElement upgd_convermenu;
	
	@FindBy (xpath="//a[text()='Retrieve']")
	WebElement retievmenu;
	
	@FindBy (xpath="//a[text()='User Administration']")
	WebElement usr_adminmenu;
	
	
	@FindBy (xpath="//img[@src='images/buttons/btn-home-new.jpg']")
	WebElement new_proposalicon;
	
	
	@FindBy (xpath="//a[text()='Experience']")
	WebElement experiencemenu;
	
	@FindBy (xpath="//a[text()='Ownership']")
	WebElement ownershipmenu;
	
	
	@FindBy (xpath="//img[@src='images/buttons/btn-home-upgrade.jpg']")
	WebElement upgrd_convericon;
	
	@FindBy (xpath="//img[@src='images/buttons/btn-home-pitch-lu.jpg']")
	WebElement retriveicon;
	
	@FindBy (xpath="//img[@src='images/buttons/btn-home-owner-lu.jpg']")
	WebElement owner_lookupicon;
	
	@FindBy (id="siteChanger")
	WebElement site_changeicon;
	
	@FindBy (xpath="//a[text()='Logout']")
	WebElement logoutlink;
	
	
	
	public WsaHomePage(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean validateHomePageLogo(){
	boolean hmpagelogo=	homepagelogo.isDisplayed();
	return hmpagelogo;
	}
	
	public String validateHomePageheader(){
	String hmpageheater=homepageheader.getText();
	return hmpageheater;
	}
	
	public void selectNewProposal(){
		newProposalmenu.click();
	}
	
	
	public SiteChange changeSite(){
		site_changeicon.click();
		return new SiteChange();
	}
	
	
	public void WBWselectExperinceMenu() throws Exception{
		newProposalmenu.click();
		experiencemenu.click();
		//TestUtil.selectExperienceProposalMenu();		
	}
	
//	public void clearTourNo() throws Exception{
//		experiencemenu.click();
//		//TestUtil.selectExperienceProposalMenu();		
//	}


	
	public void WBWselectOwnershipMenu() throws Exception{
		newProposalmenu.click();
		Thread.sleep(2000);
		ownershipmenu.click();
		//TestUtil.selectOwnershipProposalMenu();
	}
	
	public void logout(){
		logoutlink.click();
	}
	

	
	

}
