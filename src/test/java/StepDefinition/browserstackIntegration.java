package StepDefinition;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;


public class browserstackIntegration {
	

	public static final String Username="aarthyselvaraj_JV9QXF";
	public static final String AutomateKey="zNZsXxozE5MpSnfB1fog";

			
	
	public static final String URL="https://"+Username+":"+AutomateKey+"@hub-cloud.browserstack.com/wb/hub";
	 
	
	public static void main(String[] arg) throws MalformedURLException {
		 WebDriver driver=null;
		 MutableCapabilities capabilities = new MutableCapabilities();
	        HashMap<String, String> bstackOptionsMap = new HashMap<String, String>();
	       
	        capabilities.setCapability("browserName", "chrome");
	        capabilities.setCapability("browserVersion", "80");
	        bstackOptionsMap.put("os", "Windows");
	        bstackOptionsMap.put("osVersion", "11");

	        bstackOptionsMap.put("buildName", "browserstack-build-1");

	        bstackOptionsMap.put("sessionName", "test");

	        bstackOptionsMap.put("local", "false");
	        bstackOptionsMap.put("seleniumVersion", "4.1.0");

	      //  		
	        
	      //  bstackOptionsMap.put("source", "java-selenium:sample-main:v1.0");
	        capabilities.setCapability("bstack:options", bstackOptionsMap);
	       
				driver = new RemoteWebDriver(
				        new URL(URL), capabilities);
			
	
	/*	DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("os", "window");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "chrome");
		caps.setCapability("browser_version", "80");
		caps.setCapability("name", "Run with browser");
				
		//WebDriverManager.firefoxdriver().setup();
		 WebDriver driver= new RemoteWebDriver(new URL(URL),caps);*/
		
		//ChromeOptions options = new ChromeOptions();
		//options.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
		driver.manage().window().maximize();
		//driver.get("https://www.deepl.com/translator");
		
		driver.get("https://www.google.com");
		driver.findElement(By.className("gLFyf")).sendKeys("one");
		
	}

}
