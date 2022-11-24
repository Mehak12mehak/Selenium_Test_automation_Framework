package POM_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utlity.Base_Test;
import Framework_utlity.Utility_Methods;
import POM_pages.DWS_Bookpage;
import POM_pages.DWS_Homepage_Register;

public class DWS_BookTest extends Base_Test {
	

	@DataProvider(name="TestData")
	public Object[][] testdata() throws IOException
	{
		
		Object[][] data=Utility_Methods.getTestData("DWS_Books");
		
		
		return data;
	}
	
@Test(dataProvider="TestData")
	public void Book_click(String sort,String display,String view)
	{
		DWS_Homepage_Register hp=new DWS_Homepage_Register(driver);
		hp.Click_book();
		
		DWS_Bookpage bp=new DWS_Bookpage(driver);
		bp.Click_book();
		bp.sort_by(sort);
		bp.display_size(2);
		bp.View(view);
		
		
	}

}
