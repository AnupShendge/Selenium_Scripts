package SelectListBox;
 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	// set the driver executable path
   static {
	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
   }
	
	//launch the chrome
    protected static WebDriver driver =new ChromeDriver();

}
