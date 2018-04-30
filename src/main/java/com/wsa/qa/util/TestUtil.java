package com.wsa.qa.util;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;

import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.wsa.qa.testbase.TestBase;

public class TestUtil extends TestBase {

	
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICITY_WAIT=10;
	public static Connection conn;
	
	
	public static void closealert(){
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	
	public static void selectExperienceProposalMenu() throws Exception{
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_ENTER);
	}
	
	public static void selectOwnershipProposalMenu() throws Exception{
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_ENTER);
	}
	

	
	public static void selectNewContractmenu() throws Exception{
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_ENTER);
	}
	
	
	public static void selectEditContractmenu() throws Exception{
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_ENTER);
	}
	
	public static void selectViewContractmenu() throws Exception{
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_ENTER);
		
	}
	
	
	public static void selectWMContractmenu() throws Exception{
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_ENTER);
	}
	

	public static void selectWMEditContractmenu() throws Exception{
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_ENTER);
	}
	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));

		}

	

	public static void windowHandle(){
		Set<String> handler= driver.getWindowHandles();
		Iterator<String> iterate = handler.iterator();
		String parentid = iterate.next();
		System.out.println("parent window" + parentid);
		String childid=iterate.next();
		System.out.println("child window" + childid);
		
	}
	
	
	public static void mouseMove(WebElement element){
		
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		//action.moveToElement(element).click();
		}
	

	
	
}
