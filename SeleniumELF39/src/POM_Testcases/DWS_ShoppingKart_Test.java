package POM_Testcases;

import org.apache.commons.math3.geometry.Space;
import org.testng.annotations.Test;

import Framework_utlity.Base_Test;
import POM_pages.DWS_Homepage_Register;
import POM_pages.DWS_Searchpage;
import POM_pages.DWS_Shopping_kart;

public class DWS_ShoppingKart_Test extends Base_Test 
{
	@Test
	public void DWS_ShoppingKart_Test() {
		
		DWS_Homepage_Register hp=new DWS_Homepage_Register(driver);
		hp.click_Shopping_kart();
		
		DWS_Shopping_kart sk=new DWS_Shopping_kart(driver);
		sk.click_shopping();
	
			}
	

}
