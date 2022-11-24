package Practice_Amazon;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utlity.Base_Test;
import Framework_utlity.Utility_Methods;

public class Amazon_Signin extends Base_Test{
	@DataProvider(name= "TestData")
	public Object[][] testdata() throws IOException
	{
		
		Object[][] data=Utility_Methods.getTestData("Amazon_Signin");
		

		
		
return data;
	}
	
	
@Test(dataProvider = "TestData")
	
	public void sign_in(String Username,String mob_number,String password,String Re_enter_pwd) throws InterruptedException
	{
		WebElement Click_all=driver.findElement(By.id("nav-hamburger-menu"));
		Utility_Methods.Click_Element(Click_all);
		
		WebElement Sign_in=driver.findElement(By.xpath("//b[text()='Hello, sign in']"));
		Utility_Methods.Click_Element(Sign_in);
		
		WebElement Create_Acc=driver.findElement(By.id("createAccountSubmit"));
		Utility_Methods.Click_Element(Create_Acc);
		
		WebElement Your_name=driver.findElement(By.id("ap_customer_name"));
		Utility_Methods.Enter_value_In_Edit_Field(Your_name,Username);
		
		WebElement Mobile_number=driver.findElement(By.id("ap_email"));
		Utility_Methods.Enter_value_In_Edit_Field(Mobile_number,mob_number);
		
		WebElement pwd=driver.findElement(By.id("ap_password"));
		Utility_Methods.Enter_value_In_Edit_Field(pwd,password);
		
		WebElement Re_enter=driver.findElement(By.name("passwordCheck"));
		Utility_Methods.Enter_value_In_Edit_Field(Re_enter,Re_enter_pwd);
		
		WebElement submit=driver.findElement(By.id("continue"));
		Utility_Methods.Click_Element(submit);
		
		
	}

}