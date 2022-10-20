import org.openqa.selenium.By;

public class CssSelectorLocator extends BaseClass {
	
	public static void main(String[] args) {
		
		driver.get("http://localhost/login.do");
		
		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("manager");
		
		driver.findElement(By.cssSelector("#loginButton")).click();
		
		driver.findElement(By.cssSelector(".startExploringLink")).click();
		
		
		
		
		
	}

}
