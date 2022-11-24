package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utlity.Utility_Methods;

public class DWS_Apprealpage extends Utility_Methods {
	
	public DWS_Apprealpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//a[@href=\"/apparel-shoes\"])[3]")
	WebElement Appreal_click;
	
	public void appreal_click()
	{
		Click_Element(Appreal_click);
	}


}
