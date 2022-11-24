package Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utlity.Base_Test;
import Framework_utlity.Utility_Methods;

public class Testcase4_testng_Advancesearch extends Base_Test{
	
	@DataProvider(name="TestData")
	public Object[][] testdata() throws IOException
	{
		/*Object[][] data=new Object[1][5];
		data[0][0]="Books";
		data[0][1]="100";
		data[0][2]="200";
		data[0][3]="Computers >> Desktops";
		data[0][4]="Tricentis"*/;
		Object[][] data=Utility_Methods.getTestData("Advance_Search");
		
		
		return data;
	}
	
@Test(dataProvider="TestData")
	
	public void Advance_search(String product,String Sprice,String Lprice,String category,String Manufacture)
	{
		
		
		//driver.findElement(By.id("small-searchterms")).click();
		WebElement Click_search=driver.findElement(By.id("small-searchterms"));
		Utility_Methods.Click_Element(Click_search);
		
		//driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		WebElement search_product=driver.findElement(By.id("small-searchterms"));
		Utility_Methods.Enter_value_In_Edit_Field(search_product,product);
		
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
		Utility_Methods.Click_Element(submit);
		
		
		/*driver.findElement(By.id("As")).click();
		WebElement search1=driver.findElement(By.id("Cid"));
		Select sle=new Select(search1);
		sle.selectByVisibleText("Computers >> Desktops");*/
		//to click on advance search
		Utility_Methods.Click_Element(driver.findElement(By.id("As")));
		
		WebElement drop=driver.findElement(By.id("Cid"));
        Utility_Methods.Select_By_Visible_Text(drop, category);
		
		
		
	
		
		
		/*driver.findElement(By.id("Isc")).click();
		WebElement search2=driver.findElement(By.name("Mid"));
		Select sle2=new Select(search2);
		sle2.selectByVisibleText("Tricentis");*/
		WebElement drop2=driver.findElement(By.name("Mid"));
		Utility_Methods.Select_By_Visible_Text(drop2, Manufacture);
		
		
		//driver.findElement(By.id("Pf+")).sendKeys("100");
		WebElement from_price=driver.findElement(By.id("Pf"));
		Utility_Methods.Enter_value_In_Edit_Field(from_price,Sprice);
		
		//driver.findElement(By.id("Pt")).sendKeys("200");
		WebElement To_price=driver.findElement(By.id("Pt"));
		Utility_Methods.Enter_value_In_Edit_Field(To_price, Lprice);
		
		//driver.findElement(By.id("Sid")).click();
		WebElement click=driver.findElement(By.id("Sid"));
		Utility_Methods.Click_Element(click);
		
		//driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		WebElement submit_advanceserach=driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		Utility_Methods.Click_Element(submit_advanceserach);
		
		
		
		
		
		
		}
	
	
	

}
