package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utlity.Utility_Methods;

public class DWS_jewelrypage  extends Utility_Methods{
	
	public DWS_jewelrypage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//a[@href=\"/jewelry\"])[3]")
	WebElement jewellery_click;
	
	public void jewellery_click()
	{
		Click_Element(jewellery_click);
	}


}
