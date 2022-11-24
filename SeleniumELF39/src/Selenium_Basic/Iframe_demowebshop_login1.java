package Selenium_Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_demowebshop_login1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//launch the browser
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91789/Downloads/selenium_practise_website/iframe.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		//Identify the frame and switch to it
		//switch the frame by index
		
		driver.switchTo().frame("frame1");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();

	}

}
