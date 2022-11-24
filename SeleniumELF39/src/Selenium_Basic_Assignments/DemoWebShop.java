package Selenium_Basic_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.google.com");
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		//driver.findElement(By.id("Female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("mehak");
		driver.findElement(By.id("LastName")).sendKeys("banagar");
		driver.findElement(By.name("Email")).sendKeys("mhk@test.com");
		driver.findElement(By.name("Password")).sendKeys("mehak123");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("mehak123");
		driver.findElement(By.id("register-button")).click();
		//driver.close();
		
		
		
	
	

	}

}
