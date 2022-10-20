package WindowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import SelectListBox.Baseclass;

public class BasicDemo extends Baseclass {

	public static void main(String[] args) {

		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");

		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.id("windowhandling1"));

		button.click();

		Set<String> allWh = driver.getWindowHandles();

		System.out.println(allWh.size());

		for (String wh : allWh) {

			driver.switchTo().window(wh);

			driver.manage().window().maximize();

			String title = driver.getTitle();

			System.out.println("Window handle id of the page " + title + "--> is " + wh);
		}
		
		driver.quit();

	}

}
