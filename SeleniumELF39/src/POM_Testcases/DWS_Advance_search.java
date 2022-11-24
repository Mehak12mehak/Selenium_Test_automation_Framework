package POM_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utlity.Base_Test;
import Framework_utlity.Utility_Methods;
import POM_pages.DWS_Advancesearchpage;
import POM_pages.DWS_Homepage_Register;

public class DWS_Advance_search extends Base_Test
{
	@DataProvider(name="TestData")
	public Object[][] testdata() throws IOException
	{
		
		Object[][] data=Utility_Methods.getTestData("DWS_Advance_Search");
		
		
		return data;
	}
	
@Test(dataProvider="TestData")
public void  AdvanceSerach(String Product,String category,String manufacture,String F_Price,String T_price)
{
	DWS_Homepage_Register hp=new DWS_Homepage_Register(driver);
	hp.Click_Ad_Search();
	
	DWS_Advancesearchpage ASp=new DWS_Advancesearchpage(driver);
	ASp.Enter_product_Asearch(Product);;
	ASp.Enter_Aclick();
	ASp.click_Aserach();
	ASp.category_Asearch(category);
	ASp.maufacture_Asearch(manufacture);
	ASp.from_price(F_Price);
	ASp.to_price(T_price);
	ASp.A_submit();
	
}
	
}
 