package POM_Testcases;

import org.testng.annotations.Test;

import Framework_utlity.Base_Test;
import POM_pages.DWS_Homepage_Register;
import POM_pages.DWS_Ratingpage;

public class DWS_RadioTest extends Base_Test{
	@Test
	public void Radio() throws InterruptedException
	{
		DWS_Homepage_Register hp=new DWS_Homepage_Register(driver);
		hp.Select_rating();
		Thread.sleep(3000);
		
		DWS_Ratingpage rp=new DWS_Ratingpage(driver);
		rp.click_radio();
		Thread.sleep(2000);
		rp.Submit_vote();
	}

}
