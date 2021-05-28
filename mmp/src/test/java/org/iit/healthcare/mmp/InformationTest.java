package org.iit.healthcare.mmp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InformationTest extends launchBrowser {

		Information logpage;
		
		@BeforeMethod
		public void beforemethod ()
		{
		   logpage = new Information(driver);
		}
		
		@Test (priority = 1)
		public void loginapp() throws InterruptedException 
		{
			System.out.println("I am in Login Test");
			logpage.Loginuser("ria1", "Ria12345");
			Thread.sleep(2000);
			logpage.Info();
		}
		
		
		String expected="Manage My Patient (MMP) is a medical practice management solution that boosts productivity by automating the day-to-day tasks that can slow an office manager down. Central delivers much more than medical billing software. Sure, it has the tools to help generate cleaner claims and reduce denials, but our easy-to-use practice management software also streamlines your workflow to deliver seamless handoffs across departments.";
		
		@Test (priority = 3)
		public void info_test() throws InterruptedException
		{
		   System.out.println("I am in Information Test");
		   String io = logpage.read_panel();
		   System.out.println(io);
		   Assert.assertEquals(io,expected);
		 }
		
		
		
}
