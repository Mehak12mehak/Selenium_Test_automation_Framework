package POM_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utlity.Base_Test;
import Framework_utlity.Utility_Methods;
import POM_pages.DWS_Contactpage;
import POM_pages.DWS_Homepage_Register;

public class DWS_ContactTest extends Base_Test{
	
		@DataProvider(name="TestData")
		public Object[][] testdata() throws IOException
		{
			
			Object[][] data=Utility_Methods.getTestData("DWS_Contact");
			
			
			return data;
		}
		
	@Test(dataProvider="TestData")
	public void contact(String fullname,String email,String enquiry)
	{
		DWS_Homepage_Register hp=new DWS_Homepage_Register(driver);
		hp.click_contact();
		
		DWS_Contactpage cp=new DWS_Contactpage(driver);
		cp.click_contact();
		cp.Full_name(fullname);
		cp.email(email);
		cp.enter_detail_enquiry(enquiry);
		cp.submit_contact_details();
	}

}
