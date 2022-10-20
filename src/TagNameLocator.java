import org.openqa.selenium.By;

public class TagNameLocator extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		driver.get("file:///C:/Users/Anup/Desktop/tagname.html");
		
		driver.findElement(By.tagName("input")).sendKeys("admin");
		
		//driver.findElement(By.className("unclass")).sendKeys("fsfsff");
		
		Thread.sleep(3000);
		
		//driver.findElement(By.linkText("GoogleLink")).click();
		
		driver.findElement(By.partialLinkText("GoogleLink")).click();
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	}

}
