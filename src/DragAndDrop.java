import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends BaseClass {

	public static void main(String[] args) {

		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		
		String wh = driver.getWindowHandle();
		
		System.out.println(wh);

		String xp1 = "//h1[.='Block 1']";
		WebElement block1 = driver.findElement(By.xpath(xp1));
		
		String xp2 = "//h1[.='Block 3']";
		WebElement block3 = driver.findElement(By.xpath(xp2));
		
		Actions actions = new Actions(driver);
		// drag block 1 element and drop it on block 3 element 
		actions.dragAndDrop(block1, block3).perform();
	}




}


