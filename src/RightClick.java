import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

// Using contextClick() method of Actions Class
public class RightClick {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/v4/index.php");
		
		driver.manage().window().maximize();
		
		WebElement un = driver.findElement(By.xpath("//*[@name='uid']"));
		
		un.sendKeys("mngr309753");
		
		WebElement pwd = driver.findElement(By.xpath("//*[@name='password']"));
		
		pwd.sendKeys("nEnurUj");
		
		WebElement submit = driver.findElement(By.xpath("//*[@name='btnLogin']"));
		
		submit.click();
		
		Thread.sleep(3000);
		
		String parentWH = driver.getWindowHandle();
		
		WebElement link = driver.findElement(By.linkText("Telecom Project"));
		
		
		
		// Below is the code for RightClick on a link and open in a new window
		
		Actions ac = new Actions(driver);
		
		ac.contextClick(link).perform();
		
		Thread.sleep(3000);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		
		Set<String> allWH = driver.getWindowHandles();
		int count = allWH.size();
		System.out.println("Number of browser window opened is " + count);
		
		for (String wh : allWH) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println("Window handle id of the page" + title +"--> is " + wh);
			
		}
	}

}
