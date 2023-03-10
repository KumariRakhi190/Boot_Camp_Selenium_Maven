package annotation_demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationCommands {
	public class AfterBeforeClass {
		@BeforeClass
		@BeforeMethod
		@BeforeSuite
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
		@AfterClass
		@AfterSuite
		void logout() {
			System.out.println("Logout...");
		}
	}
}
