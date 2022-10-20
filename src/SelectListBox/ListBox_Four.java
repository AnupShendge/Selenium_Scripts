package SelectListBox;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//Script to print only the duplicate elements in the list box
public class ListBox_Four extends Baseclass {
	
	public static void main(String[] args) {
		driver.get("file://C:/Users/Anup/Desktop/List1.html");
		
		WebElement listbox = driver.findElement(By.id("mtr"));
		
		Select s = new Select(listbox);
		
		List<WebElement> allOptions = s.getOptions();
		
		int count = allOptions.size();
		System.out.println("Number of elements in the list " + count);
		
		System.out.println("Duplicate elements in the list");
		
		HashSet<String> allElements = new HashSet<String>();
		
		for(WebElement ele : allOptions) {
			String text = ele.getText();
			
			if(!allElements.add(text)) {
			System.out.println(text);
			}
		}
}
	
}
