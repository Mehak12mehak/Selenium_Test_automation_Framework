package Selenium_Basic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class _Screenshot_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		
		
		//TakeScreenshot type casting with driver instance
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File homepage=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("./Screenshots/screenshot2.png");
	FileHandler.copy(homepage,destination);
	
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("mhk@test.com");
	driver.findElement(By.id("Password")).sendKeys("mehak123");
	//driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
	File ss=ts.getScreenshotAs(OutputType.FILE);
	File destination1=new File("./Screenshots/screenshot3.png");
	
	FileHandler.copy(ss,destination1);
	driver.close();
	
	

	}
}
