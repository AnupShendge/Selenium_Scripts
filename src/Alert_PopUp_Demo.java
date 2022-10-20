import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alert_PopUp_Demo extends BaseClass{

	public static void main(String[] args) {
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("=====Simple Alert========");
		
		WebElement simpleAlert = driver.findElement(By.id("simpleAlert"));
		
		simpleAlert.click();
		
		Alert al = driver.switchTo().alert();
		
		System.out.println(al.getText());
		
		String actualMessage = al.getText();
		
		String expectedMessage = "Simple Alert" ;
		
		if(actualMessage.contains(expectedMessage))
			System.out.println("Alert message is correct");
		else
			System.out.println("Alert message is incorrect");
		
		al.accept();
		
		System.out.println("=====Confimation Alert========");
		
		WebElement confimationAlert = driver.findElement(By.id("confirmationAlert"));
		
		confimationAlert.click();
		
		Alert all = driver.switchTo().alert();
		
		System.out.println(all.getText());
		
		//all.accept();
		
		all.dismiss();
		
		System.out.println("=====Prompt Alert========");
		
		WebElement promptAlert = driver.findElement(By.id("promptAlert"));
		
		promptAlert.click();
		
		Alert alll = driver.switchTo().alert();
		
		System.out.println(alll.getText());
		
		all.accept();
		
		//all.dismiss();
		
		
		
		
	}

}
