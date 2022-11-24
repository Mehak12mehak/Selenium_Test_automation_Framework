package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Action_class_Test_case {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement computer=driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
		Actions action=new Actions(driver);
		action.moveToElement(computer).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Desktops')]"))).click().build().perform();
		
		WebElement sort_by=driver.findElement(By.id("products-orderby"));
		Select s1=new Select(sort_by);
		s1.selectByVisibleText("Name: Z to A");
		
		Thread.sleep(2000);
		
		WebElement size=driver.findElement(By.id("products-pagesize"));
		Select s2=new Select(size);
		s2.selectByIndex(2);
		
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input)[7]")).click();
		
		
		
		
		
		
		
		
		
		

	}

}
