package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Framework_utlity.Utility_Methods;

public class DWS_Shopping_kart extends Utility_Methods{
	
	
	public DWS_Shopping_kart(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Webelement
	
	@FindBy(className = "cart-label")
	WebElement Shopping_btn;
	
	//methods
	
	public void click_shopping()
	{
		Shopping_btn.click();
	}

}
