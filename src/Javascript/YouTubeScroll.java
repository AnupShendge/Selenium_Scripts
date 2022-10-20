package Javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class YouTubeScroll extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		driver.get("https://www.youtube.com/");

		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.cssSelector("//span[text()='YouTube Movies']"));

		Thread.sleep(3000);
		int x = Element.getLocation().getX();
		int y = Element.getLocation().getY();
		
		System.out.println("X coordinate is :"+x + " and Y coordinate is :"+ y);
		
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		Element.click();






	}



}
