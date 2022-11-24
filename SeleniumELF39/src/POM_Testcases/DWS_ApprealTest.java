package POM_Testcases;

import org.testng.annotations.Test;

import Framework_utlity.Base_Test;
import POM_pages.DWS_Apprealpage;
import POM_pages.DWS_Homepage_Register;

public class DWS_ApprealTest extends Base_Test {
	@Test
	public void Appreal()
	{
		DWS_Homepage_Register hp=new DWS_Homepage_Register(driver);
		hp.appreal_click();
		
		DWS_Apprealpage ap=new DWS_Apprealpage(driver);
		ap.appreal_click();
	}

}
