package testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Login {
	@DataProvider(name= "TestData")
	public Object[][] testdata()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="banagar@test.com";
		data[0][1]="banagar@123";
		
		/*data[1][0]="prati@test.com";
		data[1][1]="prati@123";
		
		data[2][0]="sanjana@test.com";
		data[2][1]="sanj@123";
		
		data[3][0]="Nimitha@test.com";
		data[3][1]="nimmi@123";
		
		data[4][0]="amrutha@test.com";
		data[4][1]="ammu@123";*/
				
				return data;
		
				
				
	}
	@Test(dataProvider = "TestData")
	
	public void login(String email,String password)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
		

		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
		driver.close();
		
		
		
	}
	


}
