package Selenium_Basic_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcssvalue_Testcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		String Attribute1=driver.findElement(By.className("ico-register")).getCssValue("background-clip");
		driver.findElement(By.className("ico-register")).click();
		System.out.println(Attribute1);
		String Attribute2=driver.findElement(By.id("FirstName")).getCssValue("color");
		System.out.println(Attribute2);

	}

}