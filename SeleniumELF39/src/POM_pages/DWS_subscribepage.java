package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utlity.Utility_Methods;

public class DWS_subscribepage extends Utility_Methods {
	
	public DWS_subscribepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="Email")
	WebElement username;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement login_btn;
	
	@FindBy(id="newsletter-subscribe-button")
	WebElement subscribe_btn;
	
	
	
	//Methods
	
	public void Enter_username(String value)
	{
		Enter_value_In_Edit_Field(username, value);
	}
	
	public void Enter_Password(String value)
	{
		Enter_value_In_Edit_Field(password, value);
		
	}
	
	public void click_Login()
	{
		Click_Element(login_btn);
	}
	public void  subscribe_btn()
	{
		Click_Element(subscribe_btn);
	}


}
