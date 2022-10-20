import org.openqa.selenium.By;

public class XpathByAttributeExample extends BaseClass {

	public static void main(String[] args) {
		
		driver.get("http://localhost/login.do");
		
		driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]")).click();
		
		
		
		

	}

}
