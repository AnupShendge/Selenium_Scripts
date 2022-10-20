package DataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\ExcelData\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int rowNum = sheet1.getLastRowNum();
		
		System.out.println("Total number of row is" + rowNum);
		
		for(int i=0;i<rowNum;i++) {
			
			String data = sheet1.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println("TestData from excel is " + data);
		}
		
		wb.close();
		
		/*String data0 = sheet.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("Data from excel is  " + data0);
		
		String data1 = sheet.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println("Data from excel is  " + data1);*/
	}

}
