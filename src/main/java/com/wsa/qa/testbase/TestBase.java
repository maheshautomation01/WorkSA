package com.wsa.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.wsa.qa.util.WebEventListener;

//import com.sp.qa.util.WebEventListener;

public class TestBase {
	public static WebDriver driver;
	public static Properties prob;
	public  static EventFiringWebDriver e_driver; 
	public static WebEventListener eventListener; 

	
	
	// Constructor to load the config property file
	public TestBase(){
		
			try {
				prob= new Properties();
				FileInputStream ip = new FileInputStream(System.getProperty("user.dir") +"\\src\\main\\java\\com\\wsa\\qa\\configuration\\config.properties");
				prob.load(ip);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

}

	

	//Browser initialization
	public void initialization() {
		String browsername = prob.getProperty("browser");
		if(browsername.equals("IE")){
			System.setProperty("webdriver.ie.driver", "C:\\Mahesh- WVO\\Automation\\Selenium\\Jar Files\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else if(browsername.equals("chrome")){
			//Alert alert=driver.switchTo().alert();
			System.setProperty("webdriver.chrome.driver", "C:\\Mahesh- WVO\\Automation\\Selenium\\Jar Files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		
		}
		
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;

	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prob.getProperty("url"));
			
	}	
	
//	e_driver = new EventFiringWebDriver(driver);
//	eventlistener = new WebEventListener();
//	e_driver.
//	driver=e_driver;
//	
//	driver.
	
	

}
