package DataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

public class FbLogin_ExcelData extends BaseClass {
	
	public void tc() throws IOException, InterruptedException {
			driver.manage().window().maximize();
			 
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 
			 driver.get("https://www.facebook.com/");
			 	
			 ArrayList <String> username = readExcelData(0);
			 	
			 ArrayList <String> password = readExcelData(1);
			 	
			 for (int i = 0; i < username.size(); i++) {
			 		
			 		driver.findElement(By.id("email")).sendKeys(username.get(i));
					driver.findElement(By.id("pass")).sendKeys(password.get(i));
				 	driver.findElement(By.xpath("//*[@value='Log In']")).click();
				 	Thread.sleep(2000);
				     driver.findElement(By.xpath("//a[@class='_42ft _4jy0 signup_btn _4jy4 _4jy2 selected _51sy']")).click();
				     driver.findElement(By.xpath("//input[@id='u_0_8']")).click();
			}
	}
	
	public ArrayList<String> readExcelData(int colNo) throws IOException {
		
		File src = new File("C:\\ExcelData\\FbLogin.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet s = wb.getSheet("Sheet1");
		
		Iterator<Row> ri = s.iterator();
		ri.next();
		
		ArrayList<String> list = new ArrayList<String>();
		
		while(ri.hasNext()) {
			
			list.add(ri.next().getCell(colNo).getStringCellValue());
		}
		
	System.out.println("List   " + list);
		
	return list;
		
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		FbLogin_ExcelData data = new FbLogin_ExcelData();
		
		data.tc();
	}

}
