package testng_basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class working_With_Excel {
	@Test
	public void exceldemo() throws IOException
	{
		//filepath
		String filepath="./Test_Data/Test_Data.xlsx";
		
		FileInputStream fis=new FileInputStream(filepath);
		
		//create object for excel file
		Workbook book=new XSSFWorkbook(fis);//downcasting from  XssFworkbook to workbook
		
		//Access the sheet
		Sheet sheet=book.getSheet("Sheet1");
		
		int rowcount=sheet.getPhysicalNumberOfRows();
		int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println(rowcount);
		System.out.println(col_count);
		
		
		
		//get row and column count 
		for(int row=1;row<=rowcount-1;row++)
		{
			for(int col=0;col<=col_count-1;col++)
			{
				System.out.println(sheet.getRow(row).getCell(col).getStringCellValue());
			}
		}
		
		
	}
}

