package org.iit.healthcare.mmp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Information {
	
	WebDriver driver;
	@FindBy(id = "username") WebElement username;
	@FindBy(id = "password") WebElement password;
	@FindBy(name = "submit") WebElement submit;
	@FindBy(xpath = "//a[@href='information.php']") WebElement infolink;
	@FindBy(xpath = "//div[@class='panel-title']") WebElement paneltxt;
	
	
	public Information (WebDriver bdriver)
	{
		this.driver = bdriver;
		PageFactory.initElements(driver, this);
	}
	
	public void Loginuser (String uname, String pwdnm) throws InterruptedException
	{
		username.sendKeys(uname);
		password.sendKeys(pwdnm);
		submit.click();
    }

	public void Info()
	{
	   infolink.click();
	}
	
	public String read_panel() throws InterruptedException
	{
		Thread.sleep(3000);
		String actual = paneltxt.getText();
		System.out.println(actual);
		return actual;
	}
	
		
}
