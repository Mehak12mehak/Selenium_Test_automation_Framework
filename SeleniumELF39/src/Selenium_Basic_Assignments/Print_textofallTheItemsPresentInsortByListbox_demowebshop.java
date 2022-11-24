package Selenium_Basic_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_textofallTheItemsPresentInsortByListbox_demowebshop {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https:/www.google.com");
			driver.get("https://demowebshop.tricentis.com");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
			WebElement sort_by=driver.findElement(By.id("products-orderby"));
			 List<WebElement> sel=new Select(sort_by).getOptions();
			 for(int i=0;i<sel.size()-1;i++)
			 {
				 System.out.println(sel.get(i).getText());
				 
			 }
			

			

	}

}
