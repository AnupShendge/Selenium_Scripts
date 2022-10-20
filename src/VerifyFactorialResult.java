import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifyFactorialResult extends BaseClass {

	public static void main(String[] args) {

		driver.get("http://qainterview.pythonanywhere.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.xpath("//*[@id='number']"));

		ele.sendKeys("5");

		WebElement calculate = driver.findElement(By.xpath("//*[@type='submit']"));

		calculate.click();

		WebElement result = driver.findElement(By.xpath("//*[text()='The factorial of 5 is: 120']"));

		String actualResult = result.getText();

		System.out.println(actualResult);

		String expectedResult = "The factorial of 5 is: 120";

		if (actualResult.equals(expectedResult)) {
			System.out.println("Result is correct");
		} else {
			System.out.println("Result is incorrect");
		}

	}

}
