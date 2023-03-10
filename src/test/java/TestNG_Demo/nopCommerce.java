package TestNG_Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class nopCommerce {
	WebDriver driver;
	@Test(dataProvider = "dp")
	void testLogin(String email, String pwd) {
		driver.get("");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("")).sendKeys(" ");
	}
	
//	@DataProvider(name="dp")
	
	@DataProvider(name="dp",indices = {0,1,4})
	String [][] loginData(){
	String data[][]= {
			{"abc123@gmail.com","test123"},
			{"zcx@gmail.com","gy283y8"},
			{"jdij298902@gamil.com","i9wu9238"},
			{"huhi82@gmail.com","9839892we"}
	};
	return data;
}
}
