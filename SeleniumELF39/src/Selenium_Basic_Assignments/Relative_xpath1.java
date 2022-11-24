package Selenium_Basic_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_xpath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91789/Downloads/xpath1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("Mehak");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("banagar");
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("testyantra");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Bengaluru");
		
		
		

	}

}
