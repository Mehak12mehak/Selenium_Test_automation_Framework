package testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

public class dataprovider_Computer {
	
	@Test
	public void mouse_over() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
		
	WebElement computer=driver.findElement(By.xpath("(//a[@href='/computers'])[1]"));
	Actions action=new Actions(driver);
	action.moveToElement(computer).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.linkText("Accessories"
				+ ""))).click().build().perform();
		driver.close();
		
		
		
	}

	
}
