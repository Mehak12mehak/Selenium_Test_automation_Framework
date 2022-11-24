package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utlity.Base_Test;
import Framework_utlity.Utility_Methods;

public class DWS_Registerpage extends Utility_Methods{
	
	public DWS_Registerpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Webelement
	
	@FindBy(name="Gender")
	WebElement gender;
	
	@FindBy(id="FirstName")
	WebElement Fname;
	
	@FindBy(id="LastName")
	WebElement Lname;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement pwd;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmpwd;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement Register_btn;
	
	
	//Methods
	
	public void click_gender()
	{
		//gender.click();
		click_gender();
	}
	
	public void Enter_Firstname(String value)
	{
		//Fname.sendKeys(value);
		Enter_value_In_Edit_Field(Fname, value);
	}
	
	public void Enter_Lastname(String value)
	{
		//Lname.sendKeys(value);
		Enter_value_In_Edit_Field(Lname, value);
	}
	public void Enter_Email_id(String value)
	{
		//email.sendKeys(value);
		Enter_value_In_Edit_Field(email,value);
	}
	public void Enter_Pwd_For_Register(String value)
	{
		Enter_value_In_Edit_Field(pwd, value);
	}
	
	public void Enter_Confirm_password(String value)
	{
			Enter_value_In_Edit_Field(confirmpwd, value);
	}
	
	public void Click_Register()
	{
		//Register_btn.click();
		Click_Element( Register_btn);
	}

}
