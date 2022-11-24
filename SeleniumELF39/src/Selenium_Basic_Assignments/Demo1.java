package Selenium_Basic_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91789/Downloads/demo.html");
		driver.manage().window().maximize();
		List<WebElement>radio=driver.findElements(By.xpath("//input[@type='text']"));
		
		for(int i=0;i<radio.size();i++)
		{
			if(i%2==0)
			{
			radio.get(i).sendKeys("Mehak");
			}
			else
			{
				radio.get(i).sendKeys(" ");
			}
			Thread.sleep(500);
			
		}
		driver.close();
		

	}

}
