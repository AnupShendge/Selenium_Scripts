import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		driver.get("https://accounts.google.com/Login/signinchooser?hl=EN&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shendgeanup@gmail.com");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sandsoftime");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='WaidBe']")).click();
		/*WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("//div[@id=\":3b\" ]")));*/

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\":3b\" ]")).click();
	}

}
