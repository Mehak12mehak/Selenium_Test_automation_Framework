package Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utlity.Base_Test;
import Framework_utlity.Utility_Methods;

public class Testcase1_testng_Register extends Base_Test {
	@DataProvider(name= "TestData")
	public Object[][] testdata() throws IOException
	{
		//Object[][] data=new Object[1][5];//creating an object
		/*data[0][0]="Mehak";
		data[0][1]="Banagar";
		data[0][2]="rtyu@test.com";
		data[0][3]="xyz123";
		data[0][4]="xyz123";*/
		Object[][] data=Utility_Methods.getTestData("Register");
		

		
		
return data;
	}
	
	
@Test(dataProvider = "TestData")
public void Register(String firstname,String lastname,String email,String pwd,String confirmpassword)
	
	
			{
				
	
		//driver.findElement(By.className("ico-register")).click();
			WebElement Reg_Link=driver.findElement(By.className("ico-register"));
		Utility_Methods.Click_Element(Reg_Link);
		
		//driver.findElement(By.id("gender-female")).click();
		WebElement gender=driver.findElement(By.id("gender-female"));
		Utility_Methods.Click_Element(gender);
		
		//driver.findElement(By.id("FirstName")).sendKeys("mhk");
		WebElement fname=driver.findElement(By.id("FirstName"));
		Utility_Methods.Enter_value_In_Edit_Field(fname,firstname);
		
		//driver.findElement(By.id("LastName")).sendKeys("bangar");
		WebElement lname=driver.findElement(By.id("LastName"));
		Utility_Methods.Enter_value_In_Edit_Field(lname,lastname);
		
		//driver.findElement(By.name("Email")).sendKeys("banagar@test.com");
		WebElement mail=driver.findElement(By.name("Email"));
		Utility_Methods.Enter_value_In_Edit_Field(mail,email);
		
		//driver.findElement(By.name("Password")).sendKeys("banagar@123");
		WebElement  password=driver.findElement(By.name("Password"));
		Utility_Methods.Enter_value_In_Edit_Field(password,pwd);
		
		//driver.findElement(By.name("ConfirmPassword")).sendKeys("banagar@123");
		WebElement Confirm_pwd=driver.findElement(By.name("ConfirmPassword"));
		Utility_Methods.Enter_value_In_Edit_Field(Confirm_pwd,confirmpassword);
		
		//driver.findElement(By.name("register-button")).click();
		WebElement Click_Reg=driver.findElement(By.name("register-button"));
		Utility_Methods.Click_Element(Click_Reg);
		//driver.close();
		
		
		
	}

		
		
}
