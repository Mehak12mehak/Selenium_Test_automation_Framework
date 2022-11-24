package testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_search {
	
	@DataProvider(name ="TestData")
	public Object[][] testdata()
	{
		Object[][] data=new Object[1][1];
		data[0][0]="mobiles";
		
		/*data[1][0]="books";
		
		data[2][0]="computers";*/
		
		return data;
	}
	
@Test(dataProvider="TestData")
	
	public void search(String product)
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
driver.get("https://demowebshop.tricentis.com/");
driver.manage().window().maximize();
		
		
		driver.findElement(By.id("small-searchterms")).click();
		driver.findElement(By.id("small-searchterms")).sendKeys(product);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();

}
}
