package testng_basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Working_with_excel_to_count_row_and_column {
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
		
		//get row count and column count
		int rowcount=sheet.getPhysicalNumberOfRows();
		int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println(rowcount);
		System.out.println(col_count);
		
		//Access the row and cell
		
		String value=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
		
		
		
		
		
	}

}
