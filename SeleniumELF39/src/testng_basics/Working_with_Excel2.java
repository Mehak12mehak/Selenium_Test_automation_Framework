package testng_basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Working_with_Excel2 {
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
		
		//Access the row and cell
		
		String value=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		
		
		
		
	}

}
