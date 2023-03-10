package Maven_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class question1{	
	public WebDriver driver;
	
	@BeforeClass
	public void invokeBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\bootcamp_2023_drivers\\crome_driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.fb.com");
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
	
	
	@Test(priority = 4)
	public void facebookSignUp() {
		driver.findElement(By.xpath("//a[@id='u_0_0_CR']")).click();
		
		driver.findElement(By.xpath("//input[@id='u_3_b_cT']")).sendKeys("Rakhi");
		driver.findElement(By.xpath("//input[@id='u_3_d_T+']")).sendKeys("User");
		driver.findElement(By.xpath("//input[@id='u_3_g_+C']")).sendKeys("testuser@test.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("testPassword");
		
		Select selDate = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		Select selMonth = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		Select selYear = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		
		selDate.selectByVisibleText("7");
		selMonth.selectByVisibleText("Jun");
		selYear.selectByVisibleText("2001");
		
		driver.findElement(By.xpath("//label[@for='u_3_4_S3']")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}
	
	
	@AfterClass
	public void closeBrowser(){		
		driver.quit();
		
	}

}