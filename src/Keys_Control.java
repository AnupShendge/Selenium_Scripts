import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

// Following script for entering the username in UN field and Copying same username and pasting into a pwd field thorugh Keyboard

public class Keys_Control extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://demo.guru99.com/test/login.html");
		
		driver.findElement(By.id("email")).sendKeys("shendge");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL + "a");
		
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL + "c");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("passwd")).sendKeys(Keys.CONTROL + "v");
		
		driver.findElement(By.id("SubmitLogin")).click();

	}

}
