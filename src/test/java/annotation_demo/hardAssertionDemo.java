package annotation_demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssertionDemo {
	@Test
	void hardAssert() {
		System.out.println("Testing");
		System.out.println("Testing");
		System.out.println("Testing");
		System.out.println("Testing");
		System.out.println("Testing");
		
		Assert.assertEquals(1, 1);
		System.out.println("HardAssertion is completed");
		
	}

}
