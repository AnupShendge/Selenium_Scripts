import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.id("doubleClickBtn"));
		
		Actions ac = new Actions(driver);
		
		ac.contextClick(button).doubleClick().build().perform();
		
		//Switch to alert pop up 
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		
		//print the text present on the alert pop up
		System.out.println(alert.getText());
		
		alert.accept();
		
		driver.close();

	}

}
