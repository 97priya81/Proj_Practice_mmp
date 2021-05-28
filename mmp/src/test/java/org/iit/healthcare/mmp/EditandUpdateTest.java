package org.iit.healthcare.mmp;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EditandUpdateTest extends launchBrowser {

	EditandUpdate logpage;
	
	@BeforeMethod
	public void beforemethod ()
	{
	   logpage = new EditandUpdate(driver);
	}
	
	@Test (priority = 1)
	public void loginapp() throws InterruptedException 
	{
		System.out.println("I am in Login Test");
		logpage.Loginuser("ria1", "Ria12345");
		Thread.sleep(2000);
		logpage.Profile();
	}

	@Test (priority = 3)
	public void edit_update_fname_test() throws InterruptedException
	{
	   System.out.println("I am in Fname Test");
	   logpage.Edit_Click();
	   logpage.edit_update_fname("Pooja");
	   Thread.sleep(2000);
	   logpage.Save();
	   Thread.sleep(2000);
	   driver.switchTo().alert().accept();
	   Thread.sleep(2000);
	   logpage.Profile();
	   String name = logpage.read_fname();
	   System.out.println(name);
	   Assert.assertEquals(name,"Pooja");
	 }
	
	@Test (priority = 6)
	public void edit_update_invalid_fname_test() throws InterruptedException
	{
	   System.out.println("I am in Fname Invalid Test");
	   logpage.Edit_Click();
	   logpage.edit_update_fname("Priya123 K");
	   Thread.sleep(2000);
	   logpage.Save();
	   String msg = logpage.fname_invalid_error();
	   Assert.assertEquals(msg, "please enter only alphabets");
	}
	
	@Test (priority = 9)
	public void edit_update_blank_fname_test() throws InterruptedException
	{
	   System.out.println("I am in Fname Blank Test");
	   logpage.Profile();
	   logpage.Edit_Click();
	   logpage.edit_update_fname("");
	   Thread.sleep(2000);
	   logpage.Save();
	   String msg = logpage.fname_blank_error();
	   Assert.assertEquals(msg, "please enter First name");
	}
	
	@Test (priority = 12)
	public void edit_update_lname_test() throws InterruptedException
	{
	   System.out.println("I am in Lname Test");
	   logpage.Profile();
	   logpage.Edit_Click();
	   logpage.edit_update_lname("Sharma");
	   Thread.sleep(3000);
	   logpage.Save();
	   Thread.sleep(3000);
	   driver.switchTo().alert().accept();
	   Thread.sleep(3000);
	   logpage.Profile();
	   String name = logpage.read_lname();
	   System.out.println(name);
	   Assert.assertEquals(name,"Sharma");
	 }
	
	
	@Test (priority = 15)
	public void edit_update_invalid_lname_test() throws InterruptedException
	{
	  
	   System.out.println("I am in Lname Invalid Test");
	   logpage.Edit_Click();
	   logpage.edit_update_lname("Sharma1222 K");
	   Thread.sleep(3000);
	   logpage.Save();
	   String msg = logpage.lname_invalid_error();
	   Assert.assertEquals(msg, "please enter only alphabets");
	}
	
	
	@Test (priority = 18)
	public void edit_update_blank_lname_test() throws InterruptedException
	{
	   System.out.println("I am in Lname Blank Test");
	   logpage.Profile();
	   logpage.Edit_Click();
	   logpage.edit_update_lname("");
	   Thread.sleep(3000);
	   logpage.Save();
	   String msg = logpage.lname_blank_error();
	   Assert.assertEquals(msg, "please enter Last name");
	}
	

	@Test (priority = 20)
	public void edit_update_licence_test() throws InterruptedException
	{
	   logpage.Profile();
	   logpage.Edit_Click();
	   logpage.edit_update_licence("12312312");
	   System.out.println("I am in Licence Test");
	   Thread.sleep(2000);
	   logpage.Save();
	   Thread.sleep(2000);
	   driver.switchTo().alert().accept();
	   Thread.sleep(2000);
	   logpage.Profile();
	   String l = logpage.read_licence();
	   System.out.println(l);
	   Assert.assertEquals(l,"12312312");
	 }
	
		
	@Test (priority = 21)
	public void edit_update_ssn_test() throws InterruptedException
	{
	   System.out.println("I am in SSN Test");
	   logpage.Profile();
	   logpage.Edit_Click();
	   logpage.edit_update_ssn("222333444");
	   Thread.sleep(2000);
	   logpage.Save();
	   Thread.sleep(2000);
	   driver.switchTo().alert().accept();
	   Thread.sleep(2000);
	   logpage.Profile();
	   String sn = logpage.read_ssn();
	   System.out.println(sn);
	   Assert.assertEquals(sn,"222333444");
	 }
	
	@Test (priority = 24)
	public void edit_update_invalid1_ssn_test() throws InterruptedException
	{
		System.out.println("I am in SSN Invalid1 Test");
		Thread.sleep(2000);
		logpage.Profile();
		logpage.Edit_Click();
		logpage.edit_update_ssn("6666");
		Thread.sleep(2000);
		logpage.Save();
		Thread.sleep(2000);
		String msg = logpage.ssn_invalid_errorone();
		Assert.assertEquals(msg, " does not appear to be valid");
	 }
	
	
	@Test (priority = 27)
	public void edit_update_invalid2_ssn_test() throws InterruptedException
	{
		System.out.println("I am in SSN Invalid2 Test");
		Thread.sleep(2000);
		logpage.Profile();
		logpage.Edit_Click();
		Thread.sleep(2000);
		logpage.edit_update_ssn("000123234");
		Thread.sleep(2000);
		logpage.Save();
		String msg = logpage.ssn_invalid_errortwo().trim();
		Assert.assertEquals(msg, "Invalid SSN: SSN's can't start with 000.");
	 }
	

	@Test (priority = 30)
	public void edit_update_all_test() throws InterruptedException
	{
		Thread.sleep(2000);
		logpage.Profile();
		logpage.Edit_Click();
		Thread.sleep(2000);
		logpage.edit_update_fname("Pooja");
		logpage.edit_update_lname("Sharma");
		logpage.edit_update_licence("12312312");
		logpage.edit_update_ssn("222333445");
		logpage.edit_update_address("Indore");
		logpage.edit_update_age("23");
		logpage.edit_update_weight("55");
		Thread.sleep(2000);
		logpage.edit_update_height("130");
		logpage.edit_update_city("Indore");
		logpage.edit_update_state("MP");
		logpage.edit_update_zipcode("45500");
		logpage.edit_update_provider("United");
		logpage.edit_update_insuinfo("12333321");
		Thread.sleep(2000);
		logpage.Save();
		Thread.sleep(2000);
		String gttxt = driver.switchTo().alert().getText();
		Assert.assertEquals(gttxt,"Your Profile has been updated.");
	}
	
}