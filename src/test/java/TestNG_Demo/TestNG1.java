package TestNG_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG1 {
//	WebDriver driver = new ChromeDriver();
//  @Test(priority=1)
//  public void openapp() throws InterruptedException {
//	  driver.get("https://auth.geeksforgeeks.org");
//	  Thread.sleep(1000);
//  }
//  
//  @Test(priority=2)
//  public void login() throws InterruptedException {
//	  driver.findElement(By.id("luser")).sendKeys("ruchika@bebotechnologies.com");
//		driver.findElement(By.id("password")).sendKeys("test123");
//		
//		driver.findElement(By.className("signin-button")).click();
//		Thread.sleep(1000);
//	  
//  }
//  
//  @Test(priority=3)
//  public void closeapp() {
//	  driver.close();
//	  
//  }
//}
	
	@Test(priority = 1)
	public void myTestCaseWithPriority() {
	   try {
	       System.out.println("High priority");
	   } catch (Exception e) {
	   }
	}
}
	
