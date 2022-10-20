package SelectListBox;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//Script to print the UNIQUE contents of the list box
public class ListBox_One extends Baseclass {

	public static void main(String[] args) {
		
		driver.get("file://C:/Users/Anup/Desktop/List.html");
		
		WebElement list = driver.findElement(By.id("mtr"));
		
		Select s = new Select(list);
		
		List<WebElement> alloptions = s.getOptions();
		
		int count = alloptions.size();
		
		System.out.println("Number of options is " + count);
		
		HashSet<String>allElements = new HashSet<String>();
		for(WebElement options : alloptions) {
			String text= options.getText();
			System.out.println(text);
			allElements.add(text);
		}
		System.out.println(allElements);
	}

}

//       OutPut of above Program 
/*Number of options is 5
IDLY
VADA
DOOSA
POORI
POORI
[VADA, DOOSA, IDLY, POORI]*/
