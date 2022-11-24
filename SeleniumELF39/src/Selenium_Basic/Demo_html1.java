package Selenium_Basic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_html1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("file:///C:/Users/91789/Downloads/demo.html");
				driver.manage().window().maximize();
				//identify webelement of select type
				WebElement select_car=driver.findElement(By.id("standard_cars"));
				 Select sel=new Select(select_car);
				//select by visible text method
				 sel.selectByVisibleText("Audi");
				 
				 Thread.sleep(2000);
				 //select by value
				 sel.selectByValue("bmw");
				 Thread.sleep(2000);
				 
				 //Select by index
				 
				 sel.selectByIndex(6);
				 
				
		

	}

}
