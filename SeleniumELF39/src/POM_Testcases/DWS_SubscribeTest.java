package POM_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utlity.Base_Test;
import Framework_utlity.Utility_Methods;
import POM_pages.DWS_Homepage_Register;
import POM_pages.DWS_subscribepage;

public class DWS_SubscribeTest extends Base_Test {
	
	@DataProvider(name= "TestData")
	public Object[][] testdata() throws IOException
	{
		
		Object[][] data=Utility_Methods.getTestData("DWS_Subscribe");
		

		
		
return data;
	}
	
	
@Test(dataProvider = "TestData")
	
	public void Subscribe(String uname,String pwd) throws InterruptedException
	{
		DWS_Homepage_Register hp=new DWS_Homepage_Register(driver);
		hp.click_subscribe();
		
		DWS_subscribepage sp=new DWS_subscribepage(driver);
		sp.Enter_username(uname);
		sp.Enter_Password(pwd);
		sp.click_Login();
		Thread.sleep(3000);
		sp.subscribe_btn();
	}

}
