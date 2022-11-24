package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Working_with_Prarameter {
	
	@Parameters({"URL","product"})
	@Test
	public void paralleldemo(String url,String value)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.id("small-searchterms")).click();
		driver.findElement(By.id("small-searchterms")).sendKeys(value);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
		

}
	
}
