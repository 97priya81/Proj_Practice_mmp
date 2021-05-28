package org.iit.healthcare.mmp;



//test
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditandUpdate {

WebDriver driver;
	
   @FindBy(id = "username") WebElement username;
   @FindBy(id = "password") WebElement password;
   @FindBy(name = "submit") WebElement submit;
   @FindBy(xpath = "//a[@href='profile.php']") WebElement profilelink;
   @FindBy(id = "fname") WebElement fname;
   @FindBy(id = "lname") WebElement lname;
   @FindBy(id = "licn") WebElement licenceno;
   @FindBy(id = "ssn") WebElement ssnno; 
   @FindBy(id = "addr") WebElement address;
   @FindBy(id = "age") WebElement age; 
   @FindBy(id = "weight") WebElement weight;
   @FindBy(id = "height") WebElement height;
   @FindBy(id = "city") WebElement city;
   @FindBy(id = "state") WebElement state ;
   @FindBy(id = "zip") WebElement zipcode;
   @FindBy(id = "proinfo") WebElement proinfo;
   @FindBy(id = "Insinfo") WebElement insuinfo;
   @FindBy(id = "Ebtn") WebElement Editbtn;
   @FindBy(id = "Sbtn") WebElement Savebtn;
   @FindBy(id = "firsterr") WebElement fnblankmsg;
   @FindBy(id = "firsterr1") WebElement fninvalidmsg;
   @FindBy(id = "lasterr1") WebElement lninvalidmsg;
   @FindBy(id = "lasterr") WebElement lnblankmsg;
   @FindBy(id = "ssnerrtwo") WebElement ssninvalidtwo;
   @FindBy(id = "ssnerr") WebElement ssninvalidone;
   
    
	public EditandUpdate(WebDriver bdriver)
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

	public void Profile ()
	{
	   profilelink.click();
	}
	
	
	public void Save ()
	{
		Savebtn.click();
	}
	
	public void Edit_Click ()
	{
		Editbtn.click();
	}
	
	
	
	public void edit_update_fname (String fn) throws InterruptedException
	{
		fname.clear();
		fname.sendKeys(fn);
		Thread.sleep(2000);
	}	
	
	public String fname_invalid_error ()
	{
		String errmsg = fninvalidmsg.getText();
		return errmsg;
	}
	
	
	public String fname_blank_error ()
	{
		String errmsg = fnblankmsg.getText();
		return errmsg;
	}
	
	public String read_fname () throws InterruptedException
	{
		Thread.sleep(3000);
		String name = fname.getAttribute("value");
		System.out.println(name);
		return name;
	}
	
	public void edit_update_lname (String ln) throws InterruptedException
	{
		lname.clear();
		lname.sendKeys(ln);
		Thread.sleep(2000);
	}	
	
	public String read_lname () throws InterruptedException
	{
		Thread.sleep(3000);
		String name = lname.getAttribute("value");
		System.out.println(name);
		return name;
	}
	
	public String lname_invalid_error ()
	{
		String errmsg = lninvalidmsg.getText();
		return errmsg;
    }

	
	public String lname_blank_error ()
	{
		String errmsg = lnblankmsg.getText();
		return errmsg;
	}

	public void edit_update_ssn(String sn) 
	{
		ssnno.clear();
		ssnno.sendKeys(sn);	
	}

	public String read_ssn () throws InterruptedException 
	{
		Thread.sleep(3000);
		String sn = ssnno.getAttribute("value");
		System.out.println(sn);
		return sn;
	}
	
	public String ssn_invalid_errorone () throws InterruptedException
	{
		String errmsg = ssninvalidone.getAttribute("innerHTML");
		System.out.println("Error message is" +errmsg);
		return errmsg;
	}
	
	public String ssn_invalid_errortwo ()
	{
		String errmsg = ssninvalidtwo.getAttribute("innerHTML");
		return errmsg;
	}
		
	public void edit_update_licence (String licno) throws InterruptedException
	{
		licenceno.clear();
		licenceno.sendKeys(licno);
		Thread.sleep(2000);
	}	
	
	public String read_licence() throws InterruptedException 
	{
		Thread.sleep(2000);
		String l = licenceno.getAttribute("value");
		System.out.println(l);
		return l;
	}	
	
	
	public void edit_update_address (String ad) throws InterruptedException
	{
		address.clear();
		address.sendKeys(ad);
		Thread.sleep(2000);
	}
	
	public void edit_update_age (String ag) throws InterruptedException
	{
		age.clear();
		age.sendKeys(ag);
		Thread.sleep(2000);
	}

	 
	public void edit_update_weight (String w) throws InterruptedException
	{
		weight.clear();
		weight.sendKeys(w);
		Thread.sleep(2000);
	}
	
	public void edit_update_height (String h) throws InterruptedException
	{
		height.clear();
		height.sendKeys(h);
		Thread.sleep(2000);
	}
	
	public void edit_update_city (String c) throws InterruptedException
	{
		city.clear();
		city.sendKeys(c);
		Thread.sleep(2000);
	}
	
	public void edit_update_state (String st) throws InterruptedException
	{
		state.clear();
		state.sendKeys(st);
		Thread.sleep(2000);
	}
	
	public void edit_update_zipcode (String zip) throws InterruptedException
	{
		zipcode.clear();
		zipcode.sendKeys(zip);
		Thread.sleep(2000);
	}
	
	public void edit_update_provider(String prinfo) throws InterruptedException
	{
		proinfo.clear();
		proinfo.sendKeys(prinfo);
		Thread.sleep(2000);
	}
	
	public void edit_update_insuinfo (String insu) throws InterruptedException
	{
		insuinfo.clear();
		insuinfo.sendKeys(insu);
		Thread.sleep(2000);
	}
	
	
}	
	

