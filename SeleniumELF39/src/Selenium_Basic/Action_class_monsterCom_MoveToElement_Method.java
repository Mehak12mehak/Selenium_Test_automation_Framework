package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class_monsterCom_MoveToElement_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.monsterindia.com/");
				driver.manage().window().maximize();
				WebElement job=driver.findElement(By.cssSelector("a[data-check='menutab']"));
				Actions action=new Actions(driver);
				action.moveToElement(job).build().perform();
				Thread.sleep(2000);
				
				WebElement jobSkills=driver.findElement(By.xpath("//a[contains(text(),'Jobs by Skills')]"));
				Actions action1=new Actions(driver);
				action1.moveToElement(jobSkills).build().perform();
				
				Thread.sleep(2000);
				action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Java Jobs')]"))).click().build().perform();
				

	}

}
//a[contains(text(),'Java Jobs')]
