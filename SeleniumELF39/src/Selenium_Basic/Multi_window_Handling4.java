package Selenium_Basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_window_Handling4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91789/Downloads/MultipleWindow.html");
		driver.manage().window().maximize();
		
		String parent_window=driver.getWindowHandle();
		System.out.println(parent_window);
		
		driver.findElement(By.xpath("//input")).click();
		Thread.sleep(3000);
		Set<String>total_window=driver.getWindowHandles();
				System.out.println(total_window);
				for(String child_window:total_window)
				{
			//System.out.println(child_window);
				
				//switch to parent window
				driver.switchTo().window(child_window);
			
				System.out.println(driver.getTitle());
				if(driver.getTitle().equalsIgnoreCase("Olive Garden Italian Restaurant | Family Style Dining | Italian Food"))
				{
					driver.close();
				}
							}
	}
			
					

	}


