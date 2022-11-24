package Selenium_Basic_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_FindElements_Radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		List<WebElement>radio=driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(int i=0;i<radio.size();i++)
		{
			radio.get(i).click();
			Thread.sleep(1000);
			
		}
		driver.close();
		
		
		
		
		

	}



	}


