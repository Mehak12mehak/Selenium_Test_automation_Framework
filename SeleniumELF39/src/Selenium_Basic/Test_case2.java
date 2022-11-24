package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_case2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("mehak");
		driver.findElement(By.id("LastName")).sendKeys("banagar");
		driver.findElement(By.name("Email")).sendKeys("affu@test.com");
		driver.findElement(By.name("Password")).sendKeys("affu@123");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("affu@123");
		driver.findElement(By.name("register-button")).click();
		
		
		
		
	}

}
