package SelectListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Demo_DropDown extends Baseclass {

	public static void main(String[] args) {

		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement list = driver.findElement(By.xpath("//*[@name='cars']"));

		Select s = new Select(list);

		List<WebElement> allOptions = s.getOptions();

		int count = allOptions.size();

		for (WebElement ele : allOptions) {
			String text = ele.getText();
			System.out.println(text);
		}

		System.out.println("Number of options present in car drop down are " + count);

		s.selectByVisibleText("Audi");

		driver.findElement(By.xpath("(//*[@type='submit'])[3]")).click();
	}

}
