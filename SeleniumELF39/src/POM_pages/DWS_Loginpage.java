package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utlity.Base_Test;

public class DWS_Loginpage extends Base_Test{
	
	//Constructor
	public DWS_Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//WebElements
	@FindBy(id="Email")
	WebElement username;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement login_btn;
	
	//Methods
	
	public void Enter_username(String value)
	{
		username.sendKeys(value);
	
	}
	
	public void Enter_Password(String value)
	{
		password.sendKeys(value);
		
	}
	
	public void click_Login()
	{
		login_btn.click();
	}

}
