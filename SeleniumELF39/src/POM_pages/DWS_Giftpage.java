package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utlity.Utility_Methods;

public class DWS_Giftpage extends Utility_Methods{
	
	public DWS_Giftpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//a[@href=\"/gift-cards\"])[3]")
	WebElement gift_click;
	public void Gift_click()
	{
		Click_Element(gift_click);
	}

}
