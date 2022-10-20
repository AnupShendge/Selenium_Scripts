import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementMethodExample extends BaseClass {

	public static void main(String[] args) {

		driver.get("http://localhost/login.do");


		WebElement unobj = driver.findElement(By.id("username"));

		boolean status = unobj.isEnabled();

		System.out.println(status);

		System.out.println(unobj.isDisplayed());

		System.out.println(unobj.isSelected());
		
		


	}

}
