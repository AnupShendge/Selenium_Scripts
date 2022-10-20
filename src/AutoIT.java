import java.io.IOException;

import org.openqa.selenium.By;

public class AutoIT extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		driver.get("https://www.freepdfconvert.com/");
		
		driver.findElement(By.xpath("//input[@id='clientUpload']")).click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\Anup\\Documents\\open1.exe");
		
		

	}

}