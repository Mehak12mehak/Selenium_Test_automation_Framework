package testng_basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviders_parametarization {
	
	@DataProvider(name= "TestData")
	public Object[][] testdata()
	{
		Object[][] data=new Object[5][2];//creating an object
		data[0][0]="Mehak";
		data[0][1]="Banagar";
		data[1][0]="pratiksha";
		data[1][1]="prati";
		
		data[2][0]="Amrutha";
		data[2][1]="ammu";
		
		data[3][0]="Sanjana";
		data[3][1]="sanj";
		
		data[4][0]="Nimitha";
		data[4][1]="Nimmi";
		
		
		
		
		
		
		
		
		return data;
	}
	
	@Test(dataProvider ="TestData")
	public void testdatademo(String firstname,String lastname)
	{
	System.out.println(firstname);
	System.out.println(lastname);
}

}
