package testng_basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Working_with_PropertyFile {
	
	@Test
	public void propertydemo() throws IOException
	{
		String filepath="./Test_Configuration/TestConfiguration.properties";
		FileInputStream fis=new FileInputStream(filepath);
		
		//Creating an object for properties class
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.get("Firstname"));
		System.out.println(prop.get("Lastname"));
		
		}
	
	

}
