import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsExample extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("selenium");

		Thread.sleep(3000);


		String xp="//*[contains(text(),'selenium')]";


		List<WebElement> allElements = driver.findElements(By.xpath(xp));
		
		System.out.println(allElements.size());

		for (WebElement element : allElements) {
			String text = element.getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("selenium interview questions")) {
				element.click();
				break;
			}
		}

		driver.close();

	}

}
