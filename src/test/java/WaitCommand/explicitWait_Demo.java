package WaitCommand;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitWait_Demo {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
//		declaring explicit wait
		WebDriver mywait = (WebDriver) new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get(null);
		
	}

}
