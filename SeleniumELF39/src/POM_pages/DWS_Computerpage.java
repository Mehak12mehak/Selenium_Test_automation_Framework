package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utlity.Utility_Methods;

public class DWS_Computerpage extends Utility_Methods{
	
	public DWS_Computerpage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	} 
	@FindBy(xpath="(//a[@href=\"/computers\"])[3]")
	WebElement  Computer_click;
	public void Click_computer()
	{
		Click_Element(Computer_click);
	}

}
