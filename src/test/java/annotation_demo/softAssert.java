package annotation_demo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
	@Test
	void softAssertion() {
		System.out.println("Testing");
		System.out.println("Testing");
		System.out.println("Testing");
		System.out.println("Testing");
		System.out.println("Testing");
		
		SoftAssert sa= new SoftAssert();
		
		sa.assertEquals(1, 2);
		System.out.println("Soft assertion completed...");
		
		sa.assertEquals(1, 1);
		sa.assertAll();  //mandatory
		
	}

}
