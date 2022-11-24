package POM_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utlity.Base_Test;
import Framework_utlity.Utility_Methods;
import POM_pages.DWS_Homepage_Register;
import POM_pages.DWS_Registerpage;

public class DWS_Register_Test extends Base_Test{
	@DataProvider(name= "TestData")
	public Object[][] testdata() throws IOException
	{
		
		Object[][] data=Utility_Methods.getTestData("DWS_Register");
		

		
		
return data;
	}
	
	
@Test(dataProvider = "TestData")
	
	
	public void Register(String Fname,String Lname,String Email,String pwd,String C_pwd) throws InterruptedException
	{
		DWS_Homepage_Register hr=new DWS_Homepage_Register(driver);
		hr.click_Register();
		
		Thread.sleep(3000);
		
		DWS_Registerpage rp=new DWS_Registerpage(driver);
		rp.Enter_Firstname(Fname);
		rp.Enter_Lastname(Lname);
		rp.Enter_Email_id(Email);
		rp.Enter_Pwd_For_Register(pwd);
		rp.Enter_Confirm_password(C_pwd);
		
	}
	

}
