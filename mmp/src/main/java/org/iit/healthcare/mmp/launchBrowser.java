package org.iit.healthcare.mmp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class launchBrowser {

	public static WebDriver driver;
	
	@BeforeClass
	public static WebDriver startApplication()
	{
	System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");	
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	return driver;
	}
	
	@AfterClass
	public static void quitBrowser()
	{
		driver.quit();
    }
}