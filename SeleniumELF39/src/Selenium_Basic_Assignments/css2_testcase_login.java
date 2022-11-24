package Selenium_Basic_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css2_testcase_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.linkText("Register")).click();

		/*driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("mhk@test.com");
		driver.findElement(By.id("Password")).sendKeys("mehak123");
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();*/
		
		String Attribute=driver.findElement(By.linkText("Register")).getText();
		System.out.println(Attribute);
		String Attribute1=driver.findElement(By.linkText("Shopping cart")).getText();
		System.out.println(Attribute1);
		
		
		
		

	}
}
