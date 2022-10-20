import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginToActiTime extends BaseClass {

	public static void main(String[] args) {
		
		driver.get("http://localhost/login.do");
		WebElement unobj = driver.findElement(By.id("username")); //ctrl+1+enter
		
		unobj.sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.linkText("startExploringLink")).click();
		
		
		
		
		

	}

}
