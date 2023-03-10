package annotation_demo_Pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test11 {
	@Test
	public void abc() {
		System.out.println("This is abc from test1.");
	}
	@BeforeTest
	void m() {
		System.out.println("This is before class");
	}
	
	@BeforeSuite
	void a() {
		System.out.println("This is before suit");
	}
	@AfterSuite
	void b() {
		System.out.println("This is after Suit.");
	}

}
