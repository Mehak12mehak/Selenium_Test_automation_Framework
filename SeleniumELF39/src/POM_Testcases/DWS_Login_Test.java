package POM_Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Framework_utlity.Base_Test;
import POM_pages.DWS_Homepage;
import POM_pages.DWS_Loginpage;

public class DWS_Login_Test extends Base_Test{
	
	@Test
	public void Login()
	{
		DWS_Homepage hp=new DWS_Homepage(driver);
		hp.click_Login();
		
		DWS_Loginpage lp=new DWS_Loginpage(driver);
		lp.Enter_username("banagar@test.com");
		lp.Enter_Password("banagar@123");
		
		
		
		
		
	}

	
	

	
}
