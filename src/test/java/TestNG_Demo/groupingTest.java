package TestNG_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameters;

public class groupingTest {
	
	
	public class test_demo{
		
		@Test(priority=1,groups= {"sanity", "regression"})
		void loginByEmail() {
			System.out.println("This is login by email.");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.flipkart.com");
			driver.manage().window().maximize();
		}
		
		@Test(priority=2,groups= {"sanity"})
		void loginByFacebook() {
			System.out.println("This is login by facebook.");
		}
		
		@Test(priority=3,groups= {"sanity"})
		void loginByTwitter() {
			System.out.println("This is login by twitter.");
		}
	}
	
	

}
