package SelectListBox;


import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//Script to print the UNIQUE contents of the list box in a sorted order
public class ListBox_two extends Baseclass {

	public static void main(String[] args) {
		
		driver.get("file://C:/Users/Anup/Desktop/List.html");
		
		WebElement list = driver.findElement(By.id("mtr"));
		
		Select s = new Select(list);
		
		List<WebElement> alloptions = s.getOptions();
		
		int count = alloptions.size();
		
		System.out.println("Number of options is " + count);
		
		TreeSet<String>allElements = new TreeSet<String>();
		for(WebElement options : alloptions) {
			String text= options.getText();
			System.out.println(text);
			allElements.add(text);
		}
		System.out.println(allElements);
	}

}

// OutPut
/*Number of options is 5
IDLY
VADA
DOOSA
POORI
POORI
[DOOSA, IDLY, POORI, VADA]*/
