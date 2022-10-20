import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MoveToElements_ActionsClass  extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

		driver.get("http://istqb.in/");

		WebElement foundation = driver.findElement(By.xpath("//span[text()='FOUNDATION']"));

		Actions action =new Actions(driver);

		action.moveToElement(foundation).perform();

		Thread.sleep(3000);
		
		WebElement ER = driver.findElement(By.xpath("//a[@id='menu775']"));

		action.moveToElement(ER).perform();

		Thread.sleep(3000);

		WebElement CE = driver.findElement(By.xpath("//span[text()='CORPORATE ENROLLMENT']"));

		action.moveToElement(CE).perform();

		Thread.sleep(3000);


		WebElement OE = driver.findElement(By.xpath("//span[text()='ONLINE ENROLLMENT']"));

		action.moveToElement(OE).click().perform();

		Thread.sleep(3000);








	}

}
