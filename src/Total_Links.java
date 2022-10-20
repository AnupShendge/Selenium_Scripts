import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Total_Links extends BaseClass {

	public static void main(String[] args) {
		
		
		driver.get("https://www.selenium.dev/");
		
		driver.manage().window().maximize();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		int count = allLinks.size();
		
		System.out.println("Total links in the webpage is " + count);
		
		int Count =0;
		for(WebElement link : allLinks) {
			Count++;
			if(Count>4) {
				break;
			}
			
			//String text = allLinks.get(i).getText();
			
			System.out.println(link.getText());
		}

	}

}
