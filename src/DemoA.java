
public class DemoA extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		driver.get("http://localhost/login.do");

		PomExample p=new PomExample(driver);

		/*p.setUsername("admin 1");
		Thread.sleep(3000);
		driver.navigate().refresh();
		p.setUsername("admin 2");
		Thread.sleep(3000);*/
		
		p.setUsername("hi");
		p.setPassword("bye");
	
		p.clickLogin();
		Thread.sleep(3000);
		
		p.setUsername("admin");
		p.setPassword("manager");
		p.clickLogin();
		
		




	}

}
