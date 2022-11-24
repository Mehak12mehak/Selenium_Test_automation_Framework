package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class_copypaste_AND_alsowritein_UpperCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.google.com");
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("small-searchterms"));
		Actions action=new Actions(driver);
		action.moveToElement(search).click().perform();
		action.keyDown(Keys.LEFT_CONTROL).sendKeys("v").keyUp(Keys.LEFT_CONTROL).perform();
		Thread.sleep(2000);
		//action.keyDown(Keys.LEFT_SHIFT).sendKeys("mobiles").keyUp(Keys.LEFT_SHIFT).perform();

	}
}
