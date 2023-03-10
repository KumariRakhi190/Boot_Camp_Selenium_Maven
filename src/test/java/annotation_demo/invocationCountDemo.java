package annotation_demo;

import org.testng.annotations.Test;

public class invocationCountDemo {
	@Test(invocationCount =10)
	void meth() {
		System.out.println("Testing");
	}

}
