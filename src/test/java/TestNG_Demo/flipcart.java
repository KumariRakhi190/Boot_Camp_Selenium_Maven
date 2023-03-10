package TestNG_Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class flipcart {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		
			driver.get("https://www.flipkart.com");
			driver.manage().window().maximize();
	
			String Title = driver.getTitle();
			System.out.println("Actual title : "+Title);

			String Expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
			System.out.println("Expected title" +Expectedtitle);
			
			if(Expectedtitle.equals(Title)) {
				System.out.println("Test Passed");
			}
			else {
				System.out.println("Test Failed");
			}
			
			System.out.println(driver.getPageSource());
		 	Boolean bl=driver.getPageSource().contains("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!");
			System.out.println("Result :"+bl);
			driver.close();	
	}
}
