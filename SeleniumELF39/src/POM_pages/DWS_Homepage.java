package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utlity.Utility_Methods;

public class DWS_Homepage extends Utility_Methods {
	
	public  DWS_Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Webelements
	@FindBy(xpath="//a[text()='Log in']")
	WebElement Login_link;
	


	
	//Method
	public void click_Login()
	{
		Login_link.click();
	}

}
