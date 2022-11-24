package Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utlity.Base_Test;
import Framework_utlity.Utility_Methods;

public class Testcase2_testng_Login extends Base_Test{
	@DataProvider(name= "TestData")
	public Object[][] testdata() throws IOException
	{
		//Object[][] data=new Object[1][2];
		//data[0][0]="banagar@test.com";
		//data[0][1]="banagar@123";
		Object[][] data=Utility_Methods.getTestData("Login");
		
		
				
				return data;
		
				
				
	}
	@Test(dataProvider = "TestData")
	
	public void login(String email,String password)
	

		{
			//driver.findElement(By.linkText("Log in")).click();
			WebElement Login_link=driver.findElement(By.linkText("Log in"));
			//Click_Element(Login_link);
			Utility_Methods.Click_Element(Login_link);
			
			//driver.findElement(By.id("Email")).sendKeys("banagar@test.com");
			WebElement username=driver.findElement(By.id("Email"));
			Utility_Methods.Enter_value_In_Edit_Field(username,email);
			
		
			//driver.findElement(By.id("Password")).sendKeys("banagar@123");
			WebElement pwd=driver.findElement(By.id("Password"));
			Utility_Methods.Enter_value_In_Edit_Field(pwd,password);
			
			
			//driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
			WebElement submit=driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
			Utility_Methods.Click_Element(submit);
			
			WebElement logout=driver.findElement(By.cssSelector("a[class='ico-logout']"));
			Utility_Methods.Click_Element(logout);
			
			
			
		}
		
		//utility method for sendkeys

		
		

	}


