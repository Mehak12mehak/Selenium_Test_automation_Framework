package Selenium_Basic_Assignments;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice_page_assignmet {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		driver.findElement(By.name("radioButton")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("India");
		driver.findElement(By.id("dropdown-class-example")).click();
    	WebElement slelect_option =driver.findElement(By.id("dropdown-class-example"));
		
		
		Select sel=new Select(slelect_option);
		sel.selectByVisibleText("Option3");
		driver.findElement(By.id("checkBoxOption2")).click();
		driver.findElement(By.id("openwindow")).click();
		//driver.findElement(By.id("theme-btn")).click();
		String parent_Window=driver.getWindowHandle();
		System.out.println(parent_Window);
		Set<String>total_window=driver.getWindowHandles();
		System.out.println(total_window);
		for(String child_window:total_window)
		{
			driver.switchTo().window(child_window);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			
			if(driver.getTitle().equalsIgnoreCase("QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy\r\n"
				+ ""))
		{
					driver.findElement(By.linkText("Register")).click();
		
			
					driver.close();
					
				
			}
			driver.switchTo().window(parent_Window);
			driver.findElement(By.id("name")).click();
			driver.findElement(By.id("name")).sendKeys("mhk");
			driver.findElement(By.id("alertbtn")).click();
			
			Alert ale=driver.switchTo().alert();
			ale.accept();
			
			driver.findElement(By.id("confirmbtn")).click();
			Alert ale1=driver.switchTo().alert();
			ale1.dismiss();
			
			WebElement options= driver.findElement(By.xpath("//td[contains(text(),'20')]/../../tr[8]/td[3]"));
		
				System.out.println(options.getText());
				
				Actions action=new Actions(driver);
				action.sendKeys(Keys.PAGE_DOWN);
					
					driver.switchTo().frame(0);
					
					
					driver.findElement(By.linkText("Job Support")).click();
				
					
					Actions action1=new Actions(driver);
					
					action1.moveToElement(driver.findElement(By.id("mousehover"))).click().perform();
					
					
					
					
					
					
					
					
		}
	}
}
					
				
			
			
			
			
			

		


