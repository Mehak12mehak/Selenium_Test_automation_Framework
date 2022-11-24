package POM_Testcases;

import org.testng.annotations.Test;

import Framework_utlity.Base_Test;
import POM_pages.DWS_Giftpage;
import POM_pages.DWS_Homepage_Register;

public class DWS_GiftTest extends Base_Test {
	@Test
	public void  gift()
	{
		DWS_Homepage_Register hp=new DWS_Homepage_Register(driver);
		hp.Gift_click();
		
		DWS_Giftpage gp=new DWS_Giftpage(driver);
		gp.Gift_click();
	}

}
 