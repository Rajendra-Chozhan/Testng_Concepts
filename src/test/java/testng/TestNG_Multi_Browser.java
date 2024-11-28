package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Multi_Browser {

	
	WebDriver driver = null;
	
	
	@Parameters("BrowserName")
	@BeforeTest
	public void setup(String BrowserName) {
		System.out.println("Browser Name is "+BrowserName);	
		System.out.println("Thread Id is "+Thread.currentThread().getId());	
	
	if(BrowserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
				driver = new ChromeDriver();
		}
	else
		
		if (BrowserName.equals("ie")) {
			
			System.setProperty("webdriver.ie.driver","C:\\IE Driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();	
	}
		else if (BrowserName.equals("firefox")) {
			{
			System.setProperty("webdriver.gecko.driver","C:\\Firefox Driver\\geckodriver.exe");
		driver = new FirefoxDriver();	
	}}

		else if (BrowserName.equals("edge")) {
			{
			System.setProperty("webdriver.edge.driver","C:\\Edge\\msedgedriver.exe");
		driver = new EdgeDriver();	
	}}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	@Test
	public void test1() throws InterruptedException {
		
		driver.get("https://www.google.com");
		
		Thread.sleep(3000);
	}

  @AfterTest
  public void teardown() {
	  
	  driver.close();
	  System.out.println("Test Completed");
  }
	
}
