package SelectListBox;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
// Program to print the all the values from Amazon Search box drop down list

public class Amazon_DropDown extends Baseclass {

	public static void main(String[] args) {
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		WebElement list = driver.findElement(By.xpath("//*[@name='url']"));
		
		list.click();
		
		Select s = new Select(list);
			
		List<WebElement> allOptions = s.getOptions();
		
			int count = allOptions.size();
			
			System.out.println("Number of options in dropdown is " + count);
			
			// ArrayList<WebElement> allElements = new ArrayList<>();
			for (WebElement ele : allOptions) {
				String text = ele.getText();
				System.out.println(text);
			}
				
				driver.close();
			}

	}

