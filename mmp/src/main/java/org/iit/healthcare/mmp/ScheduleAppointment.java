package org.iit.healthcare.mmp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ScheduleAppointment {
	
	WebDriver driver;
	
	@FindBy(xpath = "//span[contains(text(),'Schedule Appointment')]") WebElement schappmenu;
	@FindBy(xpath = "//input[@value='Create new appointment']") WebElement createnewappbtn;
	@FindBy(xpath = "//table/tbody/tr[1]/td[1]/button[1]") WebElement bookappbtn;
	@FindBy(xpath = "//input[@id='datepicker']") WebElement date;
	@FindBy(xpath = "//select[@id='time']") WebElement time;
	@FindBy(xpath = "//button[@id='ChangeHeatName']") WebElement continuebtn; 
	@FindBy(xpath = "//textarea[@name='sym']") WebElement textarea;
	@FindBy(xpath = "//input[@value='Submit']") WebElement submitbtn;
		
	public void SchApp ()
	{
		schappmenu.click();
	}
	
	public ScheduleAppointment(WebDriver bdriver)
	{
		this.driver = bdriver;
	}
	
	public void Createnewapp (String dateofapp, String tm, String symptoms) throws InterruptedException
	{
		createnewappbtn.click();
		bookappbtn.click();
		driver.switchTo().frame("myframe");
		date.sendKeys(dateofapp);
		Thread.sleep(2000);
		Select timeselect = new Select(time);
		timeselect.selectByValue(tm);		
		continuebtn.click();
		Thread.sleep(2000);
		textarea.sendKeys(symptoms);
		submitbtn.click();
    }
	
	
}
