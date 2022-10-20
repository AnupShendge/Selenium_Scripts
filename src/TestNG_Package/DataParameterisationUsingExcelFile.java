package TestNG_Package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DataParameterisationUsingExcelFile {
	
	@Test
	public void takeDataFromExcel() throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream fis = new FileInputStream("D:\\WS_Selenium\\Selenium\\testdata\\data.xlsx");
		
		Workbook wb= WorkbookFactory.create(fis);
		
		String un = wb.getSheet("sheet1").getRow(1).getCell(0).toString();
		
		String pwd = wb.getSheet("sheet1").getRow(1).getCell(1).toString();
		
		Reporter.log(un + "--->" + pwd, true);
		
		
		
		
	}

}
