package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageFactory {

	
	//driver.findElement(By.id("user-name")).sendKeys(username);
	//driver.findElement(By.id("password")).sendKeys(password);
 WebDriver driver;
	@FindBy(id="user-name")
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_pwd;
	
	public loginPageFactory(WebDriver driver) {
		
		this.driver=driver;
		
		
		
		
	}
	
	public void enterusername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterpassword(String password) {
		txt_pwd.sendKeys(password);
	}
	
}

