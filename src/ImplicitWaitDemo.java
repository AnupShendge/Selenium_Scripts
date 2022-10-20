import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

// Refer the link : https://www.automationtestinginsider.com/2020/02/waits-in-selenium-webdriver.html
public class ImplicitWaitDemo extends BaseClass {

	public static void main(String[] args) {

		// Without implicit wait it throws the error message
		/*
		 * driver.get(
		 * "https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html"
		 * );
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * driver.findElement(By.id("testWait123")).click();
		 * 
		 * WebElement ele = driver.findElement(By.
		 * xpath("//div[text()='Welcome To Automation Testing Insider']"));
		 * 
		 * String text = ele.getText();
		 * 
		 * System.out.println("The msg is: " + text);
		 * 
		 * driver.close();
		 */

		// With implicit wait it able to locate the element

		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("testWait123")).click();

		WebElement ele = driver.findElement(By.xpath("//*[text()='Welcome To Automation Testing Insider']"));

		String text = ele.getText();

		System.out.println("The msg is: " + text);

		driver.close();

	}

}
