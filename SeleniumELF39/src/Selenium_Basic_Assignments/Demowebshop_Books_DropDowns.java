package Selenium_Basic_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Demowebshop_Books_DropDowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.google.com");
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		WebElement books_sortby=driver.findElement(By.id("products-orderby"));
		Select sel=new Select(books_sortby);
		sel.selectByVisibleText("Price: High to Low");
		
		Thread.sleep(2000);
		WebElement display=driver.findElement(By.id("products-pagesize"));
		Select sel1=new Select(display);
		sel1.selectByIndex(2);
		
		Thread.sleep(2000);
		WebElement View_as=driver.findElement(By.id("products-viewmode"));
		Select sel2=new Select(View_as);
		sel2.selectByVisibleText("List");
		
		
		
		
	}

}
