//package WaitCommand;
//
//import java.time.Duration;
//import java.util.NoSuchElementException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class FluentWait {
//	public static void main(String args[]) throws InterruptedException{
////		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver =  new ChromeDriver();
//		driver.get(null);
//		
//		FluentWait<WebDriver> mywait=new FluentWait(driver);
//		
//		mywait.withTimeOut(Duration.ofSeconds(30));
//		mywait.pollingEvery(Duration.ofSeconds(5));
//		mywait.ignoring(NoSuchElementException.class);
//		
//		WebElement username= mywait.util(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
//		username.sendKeys("Admin");
//		
////		declaring explicit wait
//		
//}}
