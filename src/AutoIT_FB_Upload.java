import java.io.IOException;

import org.openqa.selenium.By;

public class AutoIT_FB_Upload extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {

		driver.get("https://en-gb.facebook.com/login/");

		driver.findElement(By.cssSelector("[placeholder='Email address or phone number']")).sendKeys("shendgeanup@gmail.com");


		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("anup@123");

		driver.findElement(By.cssSelector("#loginbutton")).click();

		Thread.sleep(3000);


		driver.findElement(By.xpath("//input[@id='js_4y']")).click();

		Thread.sleep(2000);

		Runtime.getRuntime().exec("C:\\Users\\Anup\\Documents\\open2.exe");


	}

}
