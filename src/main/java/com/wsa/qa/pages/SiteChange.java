package com.wsa.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wsa.qa.testbase.TestBase;
import com.wsa.qa.util.TestUtil;

public class SiteChange extends TestBase {
	
	
	@FindBy (id="siteChanger")
	WebElement changesiteicon;
	
	@FindBy (xpath="//div[text()='Change Sales Site']")
	WebElement frame_changesite;
	
	@FindBy (name="cs-submit")
	WebElement childwindowokbtn;
	
	
	@FindBy (id="selectedServiceEntity000")
	WebElement wvrradiobtn;
	
//	@FindBy (xpath ="//label[text()='Wyndham Vacation Resorts (WVR)']")
//	WebElement wvrradiobtn;
	
	@FindBy (id="selectedServiceEntity001")
	WebElement wbwradiobtn;
	
	
	
//	@FindBy (xpath ="//form/input[@id='selectedServiceEntity001']")
//	WebElement wbwradiobtn;
	
	@FindBy (name="selectedSite")
	WebElement sitedropdownbtn;
	
	
	@FindBy (name="cn-submit")
	WebElement savebtn;
	
	@FindBy (xpath="//img[@src='/wsa/images/buttons/btn-close.gif']")
	WebElement changesiteclose;
	
	@FindBy (xpath="//div[@class='blockUI blockMsg blockPage']")
	WebElement mainframe1;
	
	@FindBy (xpath="//div[@class='modal-toolbar noborder']")
	WebElement mainframe2;
	
	@FindBy (xpath="//div[@class='modal-toolbar right']")
	WebElement mainframe3;
	
	
	public SiteChange(){
		PageFactory.initElements(driver, this);
	}
	
	
	public void selectWVRsite(String sitename) throws Exception{
		changesiteicon.click();
		
//		Set<String> handler= driver.getWindowHandles();
//		
//		int count = handler.size();
//		System.out.println(count);
//		Iterator<String> iterate = handler.iterator();
//		String parentid = iterate.next();
//		System.out.println("parent window" + parentid);
//		String childid=iterate.next();
//		System.out.println("child window" + childid);
//		
		
		//TestUtil.windowHandle();
		childwindowokbtn.click();
		wvrradiobtn.click();
		Thread.sleep(2000);
		Select site = new Select (sitedropdownbtn);
		site.selectByVisibleText(sitename);
		savebtn.click();
		Thread.sleep(3000);
		//TestUtil.mouseMove(changesiteclose);
		
		Actions action = new Actions(driver);
		action.moveToElement(mainframe1).moveToElement(mainframe2).moveToElement(mainframe3).moveToElement(changesiteclose).click().build().perform();
		
		//changesiteclose.click();
		//TestUtil.closealert();
		
	}
	
	public void selectWBWsite(String sitename) throws Exception{
		changesiteicon.click();
//		Set<String> handler= driver.getWindowHandles();
//		int count = handler.size();
//		System.out.println(count);
		childwindowokbtn.click();
		Thread.sleep(2000);
		wbwradiobtn.click();
		Thread.sleep(2000);
		Select site = new Select (sitedropdownbtn);
		site.selectByVisibleText(sitename);
		savebtn.click();
		Thread.sleep(2000);
		Set<String> handler3= driver.getWindowHandles();
		int count3 = handler3.size();
		System.out.println(count3);
		//TestUtil.mouseMove(changesiteclose);
		Actions action1 = new Actions(driver);
		action1.moveToElement(mainframe1).moveToElement(mainframe2).moveToElement(mainframe3).moveToElement(changesiteclose).click().build().perform();
		
//		action1.moveToElement(mainframe1).moveToElement(mainframe2).moveToElement(mainframe3).perform();
		Thread.sleep(3000);
		//action1.click(changesiteclose).doubleClick().build().perform();
//		By xpath = 	By.xpath("//img[@src='/wsa/images/buttons/btn-close.gif']");
//		
//		WebElement close=	 (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(xpath));
//		
//		close.click();
		//changesiteclose.click();
		
	}
	
	public void logout(){
		
	}
	
	public static void selectSite(WebElement element, int index){
		Select site = new Select (element);
		site.selectByIndex(index);
		
	}
	

}
