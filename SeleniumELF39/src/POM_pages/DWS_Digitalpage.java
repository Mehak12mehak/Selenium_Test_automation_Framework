package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utlity.Utility_Methods;

public class DWS_Digitalpage  extends Utility_Methods{
	public DWS_Digitalpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//a[@href=\"/digital-downloads\"])[3]")
	WebElement digital_click;
	public void Digital_click()
	{
		Click_Element(digital_click);
	}
}
