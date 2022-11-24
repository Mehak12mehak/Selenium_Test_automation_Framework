package Selenium_Basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_pop_up1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement double_click=driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		
		Actions action=new Actions(driver);
		action.doubleClick(double_click).build().perform();
		Thread.sleep(3000);
		//Switching the alert
		Alert ale=driver.switchTo().alert();
		//System.out.println(ale.getText());we can use this method to retrive the text from alert
		//handling the alert
		ale.accept();
		
		

	}

}
