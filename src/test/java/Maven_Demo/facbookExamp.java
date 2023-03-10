package Maven_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facbookExamp {
public WebDriver driver;
	
	@BeforeClass
	public void openBrowser(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
		@Test(priority=1)
		public void testURL() {
			driver.get("http://www.fb.com");
			driver.manage().window().maximize();		
		}
		
	 @Test(priority=2)
	 public void login() {
		String url = "https://www.facebook.com/";
		String acurl=driver.getCurrentUrl();
		System.out.println(acurl);
		Assert.assertEquals(url, acurl);
	}
	 
	 @Test(priority=3)
	 void check() {
		 try {
			 boolean status=driver.findElement(By.linkText("Create new account")).isDisplayed();
			 Assert.assertEquals(status, true);
		 }
		 catch(Exception e) {
			 Assert.fail();
		 }
	 }
	
}
