package Selenium_Basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_pop_up_browserstack {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.browserstack.com/users/sign_up");
				driver.manage().window().maximize();
				
				driver.findElement(By.name("user[full_name]")).sendKeys("Bangar Mehak");
				driver.findElement(By.name("user[email]")).sendKeys("mehak@xyz.com");
				driver.findElement(By.name("user[password]")).sendKeys("mehak123");
				driver.findElement(By.name("terms_and_conditions")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("(//input)[11]")).click();
				Thread.sleep(2000);
				Alert ale=driver.switchTo().alert();
				//handling the alert
				ale.accept();
				Thread.sleep(3000);
				
				driver.close();
				
				
				

	}

}
