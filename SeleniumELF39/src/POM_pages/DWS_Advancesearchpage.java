package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utlity.Utility_Methods;

public class DWS_Advancesearchpage extends Utility_Methods{
		public DWS_Advancesearchpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath ="//input[@type='text']")
		WebElement search;
		
		@FindBy(xpath ="//input[@type='submit']")
		WebElement click_btn;
		
		@FindBy(id="As")
		WebElement advancesearch;
		
		@FindBy(name="Cid")
		WebElement category;
		
		@FindBy(name="Mid")
		WebElement manufacture;
		
		@FindBy(className="price-from")
		WebElement from_price;
		
		@FindBy(className ="price-to")
		WebElement To_price;
		
		@FindBy(xpath ="(//input[@type=\"submit\"])[2]")
		WebElement submit;
		
		//methods
		public void Enter_product_Asearch(String value)
		{
			//search.sendKeys(product);
			Enter_value_In_Edit_Field(search, value);
		}
		public void Enter_Aclick()
		{
			Click_Element(click_btn);
		}
		public void click_Aserach()
		{
			Click_Element(advancesearch);
		}
		public void category_Asearch(String value)
		{
		Select_By_Visible_Text(category,value);
		}
		public void maufacture_Asearch(String value)
		{
			Select_By_Visible_Text(manufacture, value);
		}
		public void from_price(String value)
		{
			Enter_value_In_Edit_Field(from_price, value);
		}
		public void to_price(String value)
		{
			Enter_value_In_Edit_Field(To_price, value);
		}
		public void A_submit()
		{
			Click_Element(submit);
		}
		
		}
		
		
		

