package TestNG_Package;

import org.apache.log4j.Priority;
import org.testng.Reporter;
import org.testng.annotations.Test;

/*public class TestA extends BaseTestNgClass  {
	@Test
	public void testA()
	
	
	{
		Reporter.log("A", true);
		
	}*/

public class TestA {
	
	@Test
	public void FirstMethod() {
		
		System.out.println("I am in first method");
	}
	
	@Test(priority=0)
	public void SecondMethod() {
		
		System.out.println("I am in second method");
	}
	
	

}
