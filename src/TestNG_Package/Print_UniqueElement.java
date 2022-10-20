package TestNG_Package;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Print_UniqueElement extends BaseClass {

	public static void main(String[] args) {
		
		driver.get("C:\\Users\\Anup\\Desktop\\ListBox.html");
		WebElement listElement = driver.findElement(By.id("mtr"));
		
		Select s = new Select(listElement);
		
		List<WebElement> allOptions = s.getOptions();
		
		int count = allOptions.size();
		
		System.out.println(count);
		System.out.println("-----print the values in the list ----");
		
		/*HashSet<String> allElements = new HashSet<String>();*/
		TreeSet<String> allElements = new TreeSet<String>();
		for (WebElement option : allOptions) {
			String text = option.getText();
			System.out.println(text);
			allElements.add(text);
		}
		/*System.out.println("-----print the unique values in the list ----");*/
		System.out.println("-----print the unique values in sorted order ----");
		for (String value : allElements) {
		System.out.println(value);
	}
	}


}
