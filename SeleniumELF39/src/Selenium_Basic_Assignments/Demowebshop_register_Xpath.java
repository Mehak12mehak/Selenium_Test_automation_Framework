package Selenium_Basic_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshop_register_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Mehak");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Bangar");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("mahi7889@test.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("mahi786");
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("mahi786");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		

	}

}
