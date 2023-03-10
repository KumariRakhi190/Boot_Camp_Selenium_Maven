package Maven_Demo;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class question2 {	
	ChromeDriver driver;
	String url = "https://flipkart.com";
	public void openBrowser(){			
		System.setProperty("webdriver.chrome.driver","C://bootcamp_2023_drivers//crome_driver/chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get(url);		
	}
	public void getLinkCount(){
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));	
		System.out.println("Number of links on a page :: "+alllinks.size());
	}	
	public void getLinkUrl(){
		String url = driver.findElement(By.linkText("Amazon Pay")).getAttribute("href");		
		System.out.println("Url :: "+ url);
	}	
	public void getAllLinkInfo(){
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));		
		for(WebElement x:alllinks){
			System.out.println("Link Text :: "+ x.getText());
			System.out.println("Link URL  :: "+ x.getAttribute("href"));
		}
	}
}
 