package POM_Testcases;

import org.testng.annotations.Test;

import Framework_utlity.Base_Test;
import POM_pages.DWS_Homepage_Register;
import POM_pages.DWS_jewelrypage;

public class DWS_JewelryTest extends Base_Test
{
	@Test
	public void jewelry()
	{
		DWS_Homepage_Register hp=new DWS_Homepage_Register(driver);
		hp.jewellery_click();
		
		DWS_jewelrypage jp=new DWS_jewelrypage(driver);
		jp.jewellery_click();
	}

}
