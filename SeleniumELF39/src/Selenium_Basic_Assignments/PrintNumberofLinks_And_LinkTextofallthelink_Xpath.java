package Selenium_Basic_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintNumberofLinks_And_LinkTextofallthelink_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		List<WebElement>buttons=driver.findElements(By.xpath("//a"));
		
		for(int i=0;i<buttons.size()-1;i++)
		{
			System.out.println(buttons.get(i).getAttribute("href"));
			
		}
		
		
			
			
		}
		
		

	}


