package Selenium_Basic_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath2_Testcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("file:///C:/Users/91789/Downloads/xpath.html");
				driver.manage().window().maximize();
				//absolute Xpath
				/*driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Mehak");
				driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("1234");
				driver.findElement(By.xpath("/html/body/button")).click();*/
				//Relative Xpath
				driver.findElement(By.xpath("(//input)[1]")).sendKeys("Mehak");
				driver.findElement(By.xpath("(//input)[2]")).sendKeys("1234");
				driver.findElement(By.xpath("//button")).click();
				driver.close();
				

	}

}
