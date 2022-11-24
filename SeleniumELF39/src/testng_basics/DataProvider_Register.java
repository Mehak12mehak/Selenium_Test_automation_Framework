package testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Register {
	@DataProvider(name= "TestData")
	public Object[][] testdata()
	{
		Object[][] data=new Object[1][5];//creating an object
		data[0][0]="Mehak";
		data[0][1]="Banagar";
		data[0][2]="rtyu@test.com";
		data[0][3]="xyz123";
		data[0][4]="xyz123";
		
		/*data[1][0]="pratiksha";
		data[1][1]="prati";
		data[1][2]="prati@test.com";
		data[1][3]="prati123";
		data[1][4]="prati123";
		
		data[2][0]="Nimitha";
		data[2][1]="nimmi";
		data[2][2]="nimmi@test.com";
		data[2][3]="nimmi123";
		data[2][4]="nimmii123";
		

		data[3][0]="sanjana";
		data[3][1]="sanj";
		data[3][2]="sanj@test.com";
		data[3][3]="sanj123";
		data[3][4]="sanj123";
		
		data[4][0]="amrutha";
		data[4][1]="ammu";
		data[4][2]="ammu@test.com";
		data[4][3]="ammu123";
		data[4][4]="ammu123";*/
		
		
		return data;
	}
	
	
@Test(dataProvider = "TestData")
public void Register(String firstname,String lastname,String email,String pwd,String confirmpassward)
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
driver.get("https://demowebshop.tricentis.com/");
driver.manage().window().maximize();
	driver.findElement(By.className("ico-register")).click();
	driver.findElement(By.id("gender-female")).click();
	driver.findElement(By.id("FirstName")).sendKeys(firstname);
	driver.findElement(By.id("LastName")).sendKeys(lastname);
	driver.findElement(By.name("Email")).sendKeys(email);
	driver.findElement(By.name("Password")).sendKeys(pwd);
	driver.findElement(By.name("ConfirmPassword")).sendKeys(confirmpassward);
	driver.findElement(By.name("register-button")).click();
	driver.close();
	
}
	
}

