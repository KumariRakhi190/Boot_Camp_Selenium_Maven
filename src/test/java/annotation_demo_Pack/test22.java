package annotation_demo_Pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class test22 {
	@Test
	public void xyz() {
		System.out.println("This is xyz from test2.");
	}
	@AfterTest
	void m() {
		System.out.println("This is after class");
	}

}
