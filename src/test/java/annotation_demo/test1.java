package annotation_demo;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class test1 {
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
	
	
	@AfterMethod
	void logout() {
		System.out.println("Logout...");
	}
	
}
