package POM_Testcases;

import org.testng.annotations.Test;

import Framework_utlity.Base_Test;
import POM_pages.DWS_Homepage_Register;
import POM_pages.DWS_Wishlistpage;

public class DWS_Wishlist_Test extends Base_Test {
	
	@Test
	public void DWS_Wishlist_Test() throws InterruptedException
	{
		Thread.sleep(3000);
		DWS_Homepage_Register hp=new DWS_Homepage_Register(driver);
		hp.click_Wishlist();
		
		
		
	}
	
	

}
