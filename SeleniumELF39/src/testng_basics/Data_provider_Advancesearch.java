package testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider_Advancesearch {
	
	@DataProvider(name="TestData")
	public Object[][] testdata()
	{
		Object[][] data=new Object[1][3];
		data[0][0]="Books";
		data[0][1]="100";
		data[0][2]="200";
		
		return data;
	}
	
@Test(dataProvider="TestData")
	
	public void Advance_search(String product,String Sprice,String Lprice)
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
driver.get("https://demowebshop.tricentis.com/");
driver.manage().window().maximize();
		
		
		driver.findElement(By.id("small-searchterms")).click();
		driver.findElement(By.id("small-searchterms")).sendKeys(product);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.id("As")).click();
		WebElement search1=driver.findElement(By.id("Cid"));
		Select sle=new Select(search1);
		sle.selectByVisibleText("Computers >> Desktops");
		
		driver.findElement(By.id("Isc")).click();
		WebElement search2=driver.findElement(By.name("Mid"));
		Select sle2=new Select(search2);
		sle2.selectByVisibleText("Tricentis");
		
		driver.findElement(By.id("Pf")).sendKeys(Sprice);
		driver.findElement(By.id("Pt")).sendKeys(Lprice);
		driver.findElement(By.id("Sid")).click();
		
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		driver.close();
	}
		
		public void Select_by_visible_text(WebElement element,String text)
		{
			Select sel=new Select(element);
			sel.selectByVisibleText(text);
		}
		
		public void Select_by_index(WebElement element,int num)
		{
			Select sel1=new Select(element);
			sel1.selectByIndex(num);
		

		}
		
		public void Select_by_value(WebElement element,String value)
		{
			Select sel2=new Select(element);
			sel2.selectByValue(value);
		}
	

}
