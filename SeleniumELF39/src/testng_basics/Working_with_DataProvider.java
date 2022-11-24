package testng_basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_with_DataProvider {
	
	@DataProvider(name= "TestData")
	public Object[][] testdata()
	{
		Object[][] data=new Object[1][2];//creating an object
		data[0][0]="Mehak";
		data[0][1]="Banagar";
		
		return data;
	}
	
	@Test(dataProvider ="TestData")
	public void testdatademo(String firstname,String lastname)
	{
	System.out.println(firstname);
	System.out.println(lastname);
}
}

