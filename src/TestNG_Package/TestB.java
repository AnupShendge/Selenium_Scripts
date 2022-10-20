package TestNG_Package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestB extends BaseTestNgClass {
	
	
	@Test
	
	public void testB() {
		
		Reporter.log("B", true);
		
		
	}

}
