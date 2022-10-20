 
public class NavigationExample extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		
		driver.navigate().to("http://www.gmail.com");
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	}

}
