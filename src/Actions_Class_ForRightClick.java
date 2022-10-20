import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

// Below code performs right click on a link and open into the new tab
public class Actions_Class_ForRightClick extends BaseClass {

	public static void main(String[] args) throws AWTException, InterruptedException  {
		
		//driver.get("http://localhost/login.do");
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		
		driver.manage().window().maximize();
		
		//WebElement linkObj = driver.findElement(By.linkText("actiTIME Inc."));
		
		WebElement button = driver.findElement(By.id("rightClickBtn"));
		
		Actions action=new Actions(driver);
		
		action.contextClick(button).perform();
		
		
	/*	Robot r =new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);*/
		
		driver.close();
		
		
		
	}

}
