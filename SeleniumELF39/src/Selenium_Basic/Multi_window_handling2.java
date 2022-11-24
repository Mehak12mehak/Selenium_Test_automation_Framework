package Selenium_Basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_window_handling2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		String parent_window=driver.getWindowHandle();
		System.out.println(parent_window);
		
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		Thread.sleep(2000);
		Set<String>total_windows=driver.getWindowHandles();
		System.out.println(total_windows);
	
		for(String child_window:total_windows)
		{
	//System.out.println(child_window);
		
		//switch to parent window
		driver.switchTo().window(child_window);
		System.out.println(driver.getTitle());
				
		if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook"))
		{
			Thread.sleep(5000);
			driver.close();
			
		}
		}
		Thread.sleep(2000);
		driver.switchTo().window(parent_window);
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		Thread.sleep(2000);
		driver.close();

	}

}
