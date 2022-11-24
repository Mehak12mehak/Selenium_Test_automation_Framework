package Selenium_Basic;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IFrame_Demowebshop_driverwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://demowebshop.tricentis.com/");
				driver.manage().window().maximize();
				
				//Create an object of webdriverwait
				
				WebDriverWait wait=new WebDriverWait(driver,25);
				
				
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='ico-register']"))));
				//driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//a[@class='ico-register']")).click();
				driver.findElement(By.xpath("//input[@id='gender-female']")).click();
				driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("hani");
				driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Bangar");
				//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='Email']"))));
				
				driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("hani7889@test.com");
				driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("hani786");
				driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("hani786");
				
				//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='register-button']"))));
				driver.findElement(By.xpath("//input[@id='register-button']")).click();
				driver.close();

	}
}

