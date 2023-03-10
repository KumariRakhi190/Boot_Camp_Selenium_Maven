package annotation_demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class class4 {
	@Test
	public void abc() {
		int a=10;
		int b=20;
		
//		if(a>b)
//			System.out.println("Passed");
//		else
//			System.out.println("Fail");
		
//		Assert.assertEquals(a, b);
		
//		Assert.assertTrue(true);
		// pass
//		Assert.assertTrue(false);  // fail
//		Assert.assertFalse(true);
		
		
//	//	Assert.assertEquals(condition, expected,"description");
//		Assert.assertEquals(a>b, true,"a is not greater than b.");
		Assert.assertEquals(a<b, true,"a is not greater than b.");
		
		String s1= "abc";
		String s2 = "abc1";
//		Assert.assertEquals(s1,s2,"String are equals.");
		
//		if(false) {
//			Assert.assertTrue(true);
//		}
//		else {
//			Assert.fail();
//		}
		
		
		
	}

}
