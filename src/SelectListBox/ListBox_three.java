package SelectListBox;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
			//Script to check whether list box has duplicate or not
public class ListBox_three extends Baseclass {

	public static void main(String[] args) {
		driver.get("file://C:/Users/Anup/Desktop/List.html");
		
		WebElement listbox = driver.findElement(By.id("mtr"));
		
		Select s = new Select(listbox);
		
		List<WebElement> allOptions = s.getOptions();
		
		int count1 = allOptions.size();
		
		System.out.println("Number of elements in the list " + count1);
		
		HashSet<String> allElements = new HashSet<String>();
		/*for(int i=0; i<count1; i++) {
			String text = allOptions.get(i).getText();*/
		
		for(WebElement ele : allOptions) {
			String text = ele.getText();
			System.out.println(text);
			allElements.add(text);
		}
			int count2 = allElements.size();
			System.out.println("Number of elements in the hashset " + count2);
			
			if(count1==count2) {
				System.out.println("List box has no duplicate elements");
			} else {
				System.out.println("List box has duplicate elements");
			}
			
			System.out.println(allElements);
			driver.close();
	}

}
