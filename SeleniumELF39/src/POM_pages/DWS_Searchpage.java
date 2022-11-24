package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utlity.Utility_Methods;

public class DWS_Searchpage extends Utility_Methods{
	public DWS_Searchpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//Webelement
	@FindBy(id="small-searchterms")
	WebElement product;
	
	@FindBy(xpath ="//input[@type='submit']")
	WebElement click_btn;
	
	//methods
	
	public void Enter_Product_For_Search(String value)

	{
		//product.sendKeys(value);
		Enter_value_In_Edit_Field(product, value);
	}
	
	public void click_search()
	{
		Click_Element(click_btn);
	}
}
