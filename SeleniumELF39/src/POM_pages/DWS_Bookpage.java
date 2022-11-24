package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utlity.Utility_Methods;

public class DWS_Bookpage extends Utility_Methods {
	
	public DWS_Bookpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//WebElement
	@FindBy(xpath="(//a[@href=\"/books\"])[3]")
	WebElement Book_click;
	
	@FindBy(name="products-orderby")
	WebElement sortby;
	
	@FindBy(name="products-pagesize")
	WebElement display;
	
	@FindBy(name="products-viewmode")
	WebElement View_as;
	
	//Methods
	public void Click_book()
	{
		Click_Element(Book_click);
	}
	
	public void sort_by(String value)
	{
		Utility_Methods.Select_By_Visible_Text(sortby,value);
	}
	
	public void display_size(int num)
	{
		Utility_Methods.Select_By_Index(display, 0);
	}
	public void View(String value)
	{
		Utility_Methods.Select_By_Visible_Text(View_as, value);
	}
	

}
