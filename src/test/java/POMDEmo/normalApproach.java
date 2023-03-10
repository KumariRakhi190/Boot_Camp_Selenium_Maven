package POMDEmo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class normalApproach {
	public WebDriver driver;
	
//	constructor
	 normalApproach(WebDriver driver){
		 this.driver = driver;
	 }
	 
//	 locators
//	 By.xpath("//img[@alt='company-branding']");
	 By img_logo = By.xpath("//img[@alt='company-branding']");
	 By txt_username = By.name("username");
	 By txt_Password = By.xpath("//input[@placeholder='Password']");
	 By submit = By.xpath("//button[@type='submit']");
	 
//	 Action method
	 public void setUserName() {
		 driver.findElement(txt_username).sendKeys("Admin");
	 }
	 
	 public void setPassword() {
		 driver.findElement(txt_Password).sendKeys("admin123");
	 }
	 
	 public void clickSubmit() {
		 driver.findElement(submit).click();
	 }
	 
	 

}
