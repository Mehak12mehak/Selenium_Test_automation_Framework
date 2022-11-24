package Selenium_Basic;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_pop_up_contextClick {

	public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://demo.guru99.com/test/simple_context_menu.html");
				driver.manage().window().maximize();
				WebElement Right_Click=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
				//create an object for action class
				Actions action=new Actions(driver);
				
				Thread.sleep(3000);
				//Switching the alert
			List<WebElement> options=driver.findElements(By.xpath("//span[contains(text(),'Edit')]/../../li/span"));
			for(int i=0;i<options.size();i++) {
				action.contextClick(Right_Click).build().perform();
				Thread.sleep(2000);
				options.get(i).click();
				
				Alert ale=driver.switchTo().alert();
				//handling the alert
				ale.accept();
				
				
				
			}
			
				
				
				//driver.findElement(By.className("context-menu-item context-menu-icon context-menu-icon-edit context-menu-visible")).click();
				
				

	}

}
