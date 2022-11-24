package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utlity.Utility_Methods;

public class DWS_Tricentispage extends Utility_Methods {
	public DWS_Tricentispage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@href='/tricentis']")
	WebElement click_tricentis;
	public void tricentis_click()
	{
		Click_Element(click_tricentis);
	}

}
