package POM_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utlity.Base_Test;
import Framework_utlity.Utility_Methods;
import POM_pages.DWS_Homepage_Register;
import POM_pages.DWS_Searchpage;

public class DWS_Search_Test extends Base_Test {

	@DataProvider(name ="TestData")
	public Object[][] testdata() throws IOException
	{
		
		Object[][] data=Utility_Methods.getTestData("DWS_Search");
		
		return data;
	}
	
@Test(dataProvider="TestData")

	public void search(String product)
	{
		DWS_Homepage_Register s=new DWS_Homepage_Register(driver);
		s.click_Search();
		
		DWS_Searchpage sp=new DWS_Searchpage(driver);
		sp.Enter_Product_For_Search(product);
		
		sp.click_search();
	}

}
