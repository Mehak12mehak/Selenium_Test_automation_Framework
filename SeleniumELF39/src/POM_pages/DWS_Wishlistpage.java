package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utlity.Utility_Methods;

public class DWS_Wishlistpage extends Utility_Methods {
	
	public DWS_Wishlistpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(linkText  = "Wishlist")
	WebElement wishlist_btn;
	
	//methods
	
	public void shopping_click()
	{
		wishlist_btn.click();
	}

}
