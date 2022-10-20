package DataDrivenFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FbLogin extends BaseClass{
	
	
	@Test(dataProvider="passData")
	public void LoginToFb(String username, String password) throws InterruptedException{
		
		
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 	driver.get("https://www.facebook.com/");
			
		 	driver.findElement(By.id("email")).sendKeys(username);
			
			
		 	driver.findElement(By.id("pass")).sendKeys(password);
			
			driver.findElement(By.xpath("//*[@value='Log In']")).click();
			
			Thread.sleep(3000);
		
	}
	@DataProvider
	public Object[][] passData(){
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "admin";
		data[0][1] = "demo";
		
		data[1][0] = "admin1";
		data[1][1] = "demo1";
		
		data[2][0] = "shendgeanup@gmail.com";
		data[2][1] = "anup@123";
	
		return data;
	}

}
