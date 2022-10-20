package TestNG_Package;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameter_TestNg {
	
	@Test
	@Parameters({"city","area"})
	public void testParameter(String city, String area) {
		
		
		Reporter.log(city+ "--->"+ area, true);
	}
	
	

}
