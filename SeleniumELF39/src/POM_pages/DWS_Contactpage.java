package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utlity.Utility_Methods;

public class DWS_Contactpage extends  Utility_Methods{
	
	public DWS_Contactpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@href='/contactus']")
	WebElement click_contact;
	
	@FindBy(xpath="//input[@id='FullName']")
	WebElement fullname;
	
	@FindBy(xpath="//input[@name='Email']")
	WebElement email;
	
	@FindBy(xpath="//textarea[@id='Enquiry']")
	WebElement enquiry;
	
	@FindBy(xpath="//input[@name='send-email']")
	WebElement submit_contact;
	
	
	public void click_contact()
	{
		Click_Element(click_contact);
	}
	
	public void Full_name(String value)
	{
		Enter_value_In_Edit_Field(fullname, value);
	}
	public void email(String value)
	{
		Enter_value_In_Edit_Field(email, value);
	}
	
	public void enter_detail_enquiry(String value)
	{
		Enter_value_In_Edit_Field(enquiry, value);
	}
	public void submit_contact_details()
	{
		Click_Element(submit_contact);
	}
}
