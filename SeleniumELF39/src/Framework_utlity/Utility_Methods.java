package Framework_utlity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;






public class Utility_Methods {
	
	//utility method for get testdata
	public static Object[][] getTestData(String sheetname) throws IOException {
		
		//file path
		String filepath="./Test_Data/Test_Data.xlsx";
		
		FileInputStream fis=new FileInputStream (filepath);
		
		//create object for excel file
		Workbook book=new XSSFWorkbook(fis); //downcasting
		
		//access the sheet
		Sheet sheet=book.getSheet(sheetname);
		
		//get row count and column count
		int row_count=sheet.getPhysicalNumberOfRows();
		int column_count=sheet.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println(row_count);
		System.out.println(column_count);
		 
		Object [][] data=new Object[row_count-1][column_count];
		
		//print all the rows and columns except header
		for(int row=1;row<row_count;row++) {
			for (int col=0;col<column_count;col++) {
				//System.out.println(sheet.getRow(row).getCell(col).getStringCellValue());
				data[row-1][col]=sheet.getRow(row).getCell(col).getStringCellValue();
			}
		}
		book.close();
		return data;
	}

	
	//Utility method for sendkeys
	
	public static void Enter_value_In_Edit_Field(WebElement element,String value)
	{
		element.sendKeys(value);
	}
	
	//Utility method for action class
	public static Actions actions(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		return action;
	}
	
	//Utility method for Click
	
	public static void Click_Element(WebElement element)
	{
		element.click();
	}
	
	//drop down

	public static void Select_By_Visible_Text(WebElement element,String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	
	}
	
	public static void Select_By_Index(WebElement element,int num)
	{
		Select sel1=new Select(element);
		sel1.selectByIndex(num);
	

	}
	
	public static void Select_By_Value(WebElement element,String value)
	{
		Select sel2=new Select(element);
		sel2.selectByValue(value);
	}
	
	
	//utility method for test configuration parameters
	public static String Test_Configuration() throws IOException
	{
		String filepath="./Test_Configuration/TestConfiguration.properties";
		FileInputStream fis=new FileInputStream(filepath);
		
		//Creating an object for properties class
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("URL");
		
		return url;
		
	}
	
}
