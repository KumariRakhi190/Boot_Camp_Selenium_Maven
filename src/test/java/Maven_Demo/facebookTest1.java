package Maven_Demo;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class facebookTest1 {
WebDriver driver;
public String actUrl = "https://www.facebook.com/";
@BeforeClass
public void invokeBrowser(){
System.setProperty("webdriver.chrome.driver","C:\\bootcamp_2023_drivers\\crome_driver\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.fb.com");
}

@Test(priority = 1)
void checkurl() {
driver.manage().window().maximize();
String url = driver.getCurrentUrl();
Assert.assertEquals(url, actUrl, "True");
}
@Test(priority = 2)
public void signup() {
driver.findElement(By.linkText("Create new account")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.name("firstname")).sendKeys("Shashank");
driver.findElement(By.name("lastname")).sendKeys("Singh");
driver.findElement(By.name("reg_email__")).sendKeys("asusshashank@gmail.com");
driver.findElement(By.name("reg_email_confirmation__")).sendKeys("asusshashank@gmail.com");
driver.findElement(By.name("reg_passwd__")).sendKeys("123456788");
Select selDate = new Select(driver.findElement(By.id("day")));
Select selMonth = new Select(driver.findElement(By.id("month")));
Select selYear = new Select(driver.findElement(By.id("year")));
selDate.selectByVisibleText("23");
selMonth.selectByVisibleText("Jan");
selYear.selectByVisibleText("2001");
driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
String newurl = driver.getCurrentUrl();
String acturl = "https://www.facebook.com/checkpoint/1501092823525282/?next=https%3A%2F%2Fwww.facebook.com%2F&__req=8";
Assert.assertEquals(newurl, acturl, "New Facebook ID Created Successfully");

}
@AfterClass

public void closeBrowser(){
driver.quit();

}
}