package TestNG_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	// set the driver executable path
   static {
	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
   }
	
	//launch the chrome
    static WebDriver driver =new ChromeDriver();

}
