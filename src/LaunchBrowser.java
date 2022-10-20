import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.close();
	}

}
