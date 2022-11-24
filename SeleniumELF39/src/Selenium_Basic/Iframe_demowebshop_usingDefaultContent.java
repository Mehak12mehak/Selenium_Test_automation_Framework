package Selenium_Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_demowebshop_usingDefaultContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//launch the browser
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91789/Downloads/selenium_practise_website/iframe.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Identify the frame and switch to it
		//switch the frame by index
		
		WebElement frame=driver.findElement(By.id("FR1"));
		
		//switch back to default content
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Google']")).click();
		
	

	}

}
