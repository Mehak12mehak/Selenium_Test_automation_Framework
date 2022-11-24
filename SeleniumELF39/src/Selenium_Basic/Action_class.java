package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//identify the web element on which i have to mouse hover
		driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
		WebElement electronics=driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
		//creating object for action class
		Actions action=new Actions(driver);
		action.moveToElement(electronics).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Camera')])[1]"))).click().build().perform();
		
		
		

	}

}
