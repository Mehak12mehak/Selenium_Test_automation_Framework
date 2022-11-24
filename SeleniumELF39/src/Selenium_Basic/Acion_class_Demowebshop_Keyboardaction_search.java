package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acion_class_Demowebshop_Keyboardaction_search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.google.com");
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("small-searchterms"));
		Actions action=new Actions(driver);
		//action.moveToElement(search).click().sendKeys("mobiles").perform();first method using movetoelement
		action.sendKeys(search,"mobiles").perform();//second method using sendKeys
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		
		
		

	}

}
