package Practice_Amazon;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utlity.Base_Test;
import Framework_utlity.Utility_Methods;

public class Amazon_Search extends Base_Test{

	@DataProvider(name ="TestData")
	public Object[][] testdata() throws IOException
	{
		
		Object[][] data=Utility_Methods.getTestData("Amazon_search");
		
		return data;
	}
	
@Test(dataProvider="TestData")
	
	
	public void search(String product)
	{
		WebElement search_click=driver.findElement(By.name("field-keywords"));
		Utility_Methods.Click_Element(search_click);
		
		WebElement Enter_text=driver.findElement(By.name("field-keywords"));
		Utility_Methods.Enter_value_In_Edit_Field(Enter_text,product);
		
		WebElement sumit=driver.findElement(By.cssSelector("input[type='submit']"));
		Utility_Methods.Click_Element(sumit);
		
	}

}
