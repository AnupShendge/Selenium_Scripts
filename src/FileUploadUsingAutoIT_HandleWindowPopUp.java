import java.io.IOException;

import org.openqa.selenium.By;

public class FileUploadUsingAutoIT_HandleWindowPopUp extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		driver.get("https://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		
		driver.findElement(By.xpath("(//input[@uploader='uploader'])[2]")).click();
		
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\Users\\Anup\\Documents\\open.exe");
		
		
	

	}

}
