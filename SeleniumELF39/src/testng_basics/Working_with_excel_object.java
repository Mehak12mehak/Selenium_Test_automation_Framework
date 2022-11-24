package testng_basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_with_excel_object {

	
		@Test
	public void exceldemo() throws IOException
	{
		//filepath
		String filepath="./Test_Data/Test_Data.xlsx";
		
		FileInputStream fis=new FileInputStream(filepath);
		
		//create object for excel file
		Workbook book=new XSSFWorkbook(fis);//downcasting from  XssFworkbook to workbook
		
		//Access the sheet
		Sheet sheet=book.getSheet("Login");
		
		int rowcount=sheet.getPhysicalNumberOfRows();
		int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println(rowcount);
		System.out.println(col_count);
		
		Object[][] data=new Object[rowcount-1][col_count];
		
		//get row and column count 
		for(int row=1;row<=rowcount-1;row++)
		{
			for(int col=0;col<=col_count-1;col++)
			{
				
				data[row-1][col]=sheet.getRow(row).getCell(col).getStringCellValue();
				//System.out.println(data[row][col]);
			}
			System.out.println();
		}
		//print the value present in data object
		for(int i=0;i<=data.length-1;i++)
		{
			for(int j=0;j<=data[i].length-1;j++)
			{
				System.out.println(data[i][j]);
			}
		}
		
		
		
	}

}
