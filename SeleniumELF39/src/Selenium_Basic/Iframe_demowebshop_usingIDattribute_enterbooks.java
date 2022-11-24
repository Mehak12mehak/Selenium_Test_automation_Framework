package Selenium_Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_demowebshop_usingIDattribute_enterbooks {

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
		
		driver.switchTo().frame("FR1");
		driver.findElement(By.id("small-searchterms")).click();
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}


