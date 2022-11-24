package POM_Testcases;

import org.testng.annotations.Test;

import Framework_utlity.Base_Test;
import POM_pages.DWS_Homepage_Register;
import POM_pages.DWS_Tricentispage;

public class DWS_TricentisTest extends Base_Test {
	
	@Test
	public void tricentis()
	{
		DWS_Homepage_Register hp=new DWS_Homepage_Register(driver);
		hp.tricentis_click();
		
		DWS_Tricentispage tp=new DWS_Tricentispage(driver);
		tp.tricentis_click();
	}

}
