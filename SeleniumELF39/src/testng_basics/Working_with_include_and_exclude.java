package testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Framework_utlity.Base_Test;

public class Working_with_include_and_exclude extends Base_Test {
	
	
	@Test	
		public void Register()
		{
			

	driver.findElement(By.className("ico-register")).click();
	driver.findElement(By.id("gender-female")).click();
	driver.findElement(By.id("FirstName")).sendKeys("mhk");
	driver.findElement(By.id("LastName")).sendKeys("bangar");
	driver.findElement(By.name("Email")).sendKeys("banagar@test.com");
	driver.findElement(By.name("Password")).sendKeys("banagar@123");
	driver.findElement(By.name("ConfirmPassword")).sendKeys("banagar@123");
	driver.findElement(By.name("register-button")).click();
	//driver.close();
	
	
	
}  
	@Test
	
	public void login()
	{
		

		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("banagar@test.com");
		driver.findElement(By.id("Password")).sendKeys("banagar@123");
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
		//driver.close();
		
		
	}


@Test
	
	public void search()
	{
		
		
		driver.findElement(By.id("small-searchterms")).click();
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		}
@Test
public void computer()
{
	
	WebElement computer=driver.findElement(By.linkText("Computers"));
	Actions action=new Actions(driver);
	action.moveToElement(computer).click().sendKeys("Accessories").build().perform();
	//driver.close();
	
	
	
}
@Test

public void Advance_search()
{
	
	
	driver.findElement(By.id("small-searchterms")).click();
	driver.findElement(By.id("small-searchterms")).sendKeys("Books");
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	driver.findElement(By.id("As")).click();
	WebElement search1=driver.findElement(By.id("Cid"));
	Select sle=new Select(search1);
	sle.selectByVisibleText("Computers >> Desktops");
	
	driver.findElement(By.id("Isc")).click();
	WebElement search2=driver.findElement(By.name("Mid"));
	Select sle2=new Select(search2);
	sle2.selectByVisibleText("Tricentis");
	
	driver.findElement(By.id("Pf")).sendKeys("100");
	driver.findElement(By.id("Pt")).sendKeys("200");
	driver.findElement(By.id("Sid")).click();
	
	driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();

	
	
	
	}








	
	

}
