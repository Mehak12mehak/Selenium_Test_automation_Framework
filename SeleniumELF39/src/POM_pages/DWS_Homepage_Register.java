package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utlity.Utility_Methods;

public class DWS_Homepage_Register extends Utility_Methods {
	
	public DWS_Homepage_Register(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@class='ico-register']")
	WebElement Register_link;
	
	//for search
	
	@FindBy(id="small-searchterms")
	WebElement Search_link;
	
	//shopping kart
	@FindBy(className = "cart-label")
	WebElement shopping_link;
	
	//Wishlist
	@FindBy(linkText ="Wishlist")
	WebElement Wishlist_link;
	
	//Advanceserach
	@FindBy(xpath="//input[@type='text']")
	WebElement Advanceserach_link;
	
	//Rating
	
	@FindBy(id="pollanswers-2")
	WebElement Rating_click;
	
	//books
	
	@FindBy(xpath="(//a[@href=\"/books\"])[3]")
	WebElement Book_click;
	
	//Computer
	
	@FindBy(xpath="(//a[@href=\"/computers\"])[3]")
	WebElement  Computer_click;
	
	//Appreal & shoee
	@FindBy(xpath="(//a[@href=\"/apparel-shoes\"])[3]")
	WebElement Appreal_click;
	
	//digital downloads
	@FindBy(xpath="(//a[@href=\"/digital-downloads\"])[3]")
	WebElement digital_click;
	
	//jewelry
	@FindBy(xpath="(//a[@href=\"/jewelry\"])[3]")
	WebElement jewellery_click;
	
	//Giftcard
	@FindBy(xpath="(//a[@href=\"/gift-cards\"])[3]")
	WebElement gift_click;
	
	//subscribe
	@FindBy(xpath="//a[text()='Log in']")
	WebElement subscribe_link;
	
	//tricentis
	@FindBy(xpath="//a[@href='/tricentis']")
	WebElement click_tricentis;
	
	//Contact us
	@FindBy(xpath="//a[@href='/contactus']")
	WebElement click_contact;
	


	
	//Method
	//subscribe
	public void click_subscribe()
	{
		Click_Element(subscribe_link);
	}
	
	//Method
	public void click_Register()
	{
		Click_Element(Register_link);
	}
	//for search
	public void click_Search()
	{
		Click_Element(Search_link);
	}
	//for shopping kart
	public void click_Shopping_kart()
	{
		Click_Element(shopping_link);
	}
	//for wish list
	
	
	public void click_Wishlist()
	{
		Click_Element(Wishlist_link);
	}
	
	//adavnce serach
	public void Click_Ad_Search()
	{
		Click_Element(Advanceserach_link);
	}
	
	//For Rating
	
	public void Select_rating()
	{
		Click_Element(Rating_click);
	}
	
	//for book
	public void Click_book()
	{
		Click_Element(Book_click);
	}
	
	//computer
	public void Click_computer()
	{
		Click_Element(Computer_click);
	}
	//appreal
	public void appreal_click()
	{
		Click_Element(Appreal_click);
	}
	
	//digital download
	public void Digital_click()
	{
		Click_Element(digital_click);
	}
	//jewelry
	public void jewellery_click()
	{
		Click_Element(jewellery_click);
	}
	//Giftcard
	public void Gift_click()
	{
		Click_Element(gift_click);
	}
	//click tricentis
	public void tricentis_click()
	{
		Click_Element(click_tricentis);
	}
	public void click_contact()
	{
		Click_Element(click_contact);
	}


}
