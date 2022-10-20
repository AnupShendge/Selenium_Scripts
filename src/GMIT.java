import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GMIT extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		driver.get("http://www.gmit.ac.in/gmitnew/index.html#");
		
		WebElement Departments = driver.findElement(By.xpath("//a[contains(text(),'Departments')] "));
		
		Actions action =new Actions(driver);

		action.moveToElement(Departments).perform();

		Thread.sleep(3000);
		
		WebElement IS = driver.findElement(By.xpath("//a[text()='Information Science & Engg'] "));

		IS.click();

		Thread.sleep(3000);
		
		

	}

}
