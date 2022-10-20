import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class FbLogin extends BaseClass{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		driver.get("https://en-gb.facebook.com/login/");
		
		driver.findElement(By.cssSelector("[placeholder='Email address or phone number']")).sendKeys("shendgeanup@gmail.com");
		
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("anup@123");
		
		driver.findElement(By.cssSelector("#loginbutton")).click();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File srcFile=ts.getScreenshotAs(OutputType.FILE);// ctrl+1+enter
		
		Date d= new Date();
		String date1= d.toString();
		System.out.println(date1);
		
		String date2=date1.replaceAll(":", "_");
		System.out.println(date2);
		
		
		File destFile = new File("./screenshots/"+date2+"_test.png");
		
		FileUtils.copyFile(srcFile, destFile);
		driver.close();
		
	}

}
