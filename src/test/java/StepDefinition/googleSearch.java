package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.MalformedURLException;
import java.net.URL;

public class googleSearch {
	
	public static final String Username="aarthyselvaraj_JV9QXF";
	public static final String AutomateKey="zNZsXxozE5MpSnfB1fog";

			
	
	public static final String URL="https://"+Username+":"+AutomateKey+"@hub-cloud.browserstack.com/wb/hub";
	
	WebDriver driver=null;

	@Given("browser is open")
	public void browser_is_open() throws MalformedURLException {
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("os", "window");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "chrome");
		caps.setCapability("browser_version", "80");
		caps.setCapability("name", "Run with browser");
				
		//WebDriverManager.firefoxdriver().setup();
		 driver= new RemoteWebDriver(new URL(URL),caps);
		
		//ChromeOptions options = new ChromeOptions();
		//options.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
		driver.manage().window().maximize();
		//driver.get("https://www.deepl.com/translator");
		
		driver.get("https://www.google.com");
	   
	}

	@And("user is navigaated to google search")
	public void user_is_navigaated_to_google_search() {
	
		driver.findElement(By.className("gLFyf")).sendKeys("one");
	}

	@When("user enter  a text on search box")
	public void user_enter_a_text_on_search_box() {
	    
	}

	@And("click on search")
	public void click_on_search() {
	   
	}

	@Then("User must be navigated to the searched screen")
	public void user_must_be_navigated_to_the_searched_screen() {
	    
	}
}
