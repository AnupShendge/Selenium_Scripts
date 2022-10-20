package TestNG_Package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {


	@Test(priority=1)
	public void createUser() {

		//System.out.println("iam anup");

		Reporter.log("createuser...", true);
	}

	@Test(priority=2, invocationCount=1, enabled=false)
	public void editUser() {

		Reporter.log("edituser...", true);



	}

	@Test(priority=3)
	public void deleteUser() {

		Reporter.log("deleteuser...", true);



	}



}



