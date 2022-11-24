package POM_Testcases;

import org.testng.annotations.Test;

import Framework_utlity.Base_Test;
import POM_pages.DWS_Digitalpage;
import POM_pages.DWS_Homepage_Register;

public class DWS_DigitalTest extends Base_Test{
	@Test
	public void Digital()
	{
		DWS_Homepage_Register hp=new DWS_Homepage_Register(driver);
		hp.Digital_click();
		
		DWS_Digitalpage dp=new DWS_Digitalpage(driver);
		dp.Digital_click();
	}

}
