package annotation_demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AfterBeforeClass {
	@BeforeClass
	void login() {
		System.out.println("Login...");
	}
	@Test(priority = 1)
	void Search() {
		System.out.println("Search...");
	}
	
	@Test(priority = 2)
	void AdvanSearch() {
		System.out.println("Advanced Search...");
	}
	
	@AfterClass
	void logout() {
		System.out.println("Logout...");
	}
	
	

}
