package org.iit.healthcare.mmp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ScheduleAppointmentTest extends launchBrowser {

	
	@Test (priority = 1)
	public void loginapp() throws InterruptedException 
	{
		EditandUpdate logpage = PageFactory.initElements(driver, EditandUpdate.class);
		logpage.Loginuser("ria1", "Ria12345");
		Thread.sleep(3000);
	}

	@Test (priority = 3)
	public void Sch_App_test() throws InterruptedException
	{
		 ScheduleAppointment schapp = PageFactory.initElements(driver, ScheduleAppointment.class);
		 schapp.SchApp();
		 schapp.Createnewapp("05/13/2021","10Am","Fever");
		 
	}	 

	
}	