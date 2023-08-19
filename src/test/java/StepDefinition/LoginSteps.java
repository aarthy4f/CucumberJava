package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageFactory.loginPageFactory;

public class LoginSteps {
	
	WebDriver driver=null;
	loginPageFactory loginpf;
	
	@Given("user is in login page")
	public void user_is_in_login_page() {
		
		System.out.println("User in Login screen");
		
	//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
		//driver=new ChromeDriver();
		
		driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.saucedemo.com/inventory.html");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();*/
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) {
		System.out.println("Login with user name,password ");
		loginpf= PageFactory.initElements(driver, loginPageFactory.class);
		
		loginpf.enterusername(username);
		loginpf.enterpassword(password);
		
	//	driver.findElement(By.id("user-name")).sendKeys(username);
	//	driver.findElement(By.id("password")).sendKeys(password);

	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("Click on login");
		driver.findElement(By.id("login-button")).click();


	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("user  is navigated to login page")
	public void user_is_navigated_to_login_page() {
		
		System.out.println("navigated to screen");
 
		driver.close();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

}
