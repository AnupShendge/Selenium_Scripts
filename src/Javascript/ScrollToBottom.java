package Javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollToBottom extends BaseClass {
	public static void main(String[] args) throws InterruptedException {

		driver.get("http://www.seleniumhq.org/download/");
		
		driver.manage().window().maximize();

		//select an element which is present at the bottom of the page
		WebElement element = driver.findElement(By.xpath("(//*[@class='backer-logo'])[9]"));

		int x = element.getLocation().getX();
		int y = element.getLocation().getY();

		System.out.println("X coordinate is :"+x + " and Y coordinate is :"+ y);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		element.click();
	}
}
