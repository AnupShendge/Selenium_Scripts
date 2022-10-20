import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//WebElement username = driver.findElement(By.xpath("(//*[@class='inputtext _55r1 _6luy'])[1]"));
		
		WebElement username = driver.findElement(By.xpath("//*[@name='email'])"));
		
		username.sendKeys("Anup");
		
		

	}

}
