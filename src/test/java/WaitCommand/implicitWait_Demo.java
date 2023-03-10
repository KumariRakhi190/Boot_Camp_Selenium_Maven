package WaitCommand;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitWait_Demo {
	public static void main(String args[]) {
		//WebDriverManager.chromedriver().setup(); //required in previous version
		
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(null);
		
	}

}
