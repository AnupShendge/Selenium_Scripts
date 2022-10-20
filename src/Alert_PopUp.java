import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Alert_PopUp extends BaseClass  {

	public static void main(String[] args) throws InterruptedException {
		
				//Enter the url
				driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
				
				driver.manage().window().maximize();
				
				//find this button : "Say my name"
				driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
				Thread.sleep(2000);
				
				//Switch to alert pop up 
				Alert alert = driver.switchTo().alert();
				Thread.sleep(2000);
				
				//print the text present on the alert pop up
				System.out.println(alert.getText());
				Thread.sleep(2000);
				
				//enter your name in the text box present on the alert pop up
				alert.sendKeys("anup");
				Thread.sleep(5000);
				
				//click on OK button
				alert.accept();
				Thread.sleep(5000);
				
				//print the text present on the second alert pop up
				System.out.println(alert.getText());
				
				//click on Cancel button
				alert.dismiss();
				
				
				driver.close();

		

	}

}
