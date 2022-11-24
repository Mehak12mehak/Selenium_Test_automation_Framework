package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utlity.Utility_Methods;

public class DWS_Ratingpage extends Utility_Methods{
	
	public DWS_Ratingpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Webelement 
	@FindBy(id="pollanswers-2")
	WebElement Click_Rating;
	
	@FindBy(id="vote-poll-1")
	WebElement Vote_submit;
	
	//methods
	public void click_radio()
	{
		Click_Element(Click_Rating);
	}
	
	public void Submit_vote()
	{
		Click_Element(Vote_submit);
	}
	
	

}
