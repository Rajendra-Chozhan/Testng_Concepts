package testdata;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Ebay {

	
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Firefox Driver\\geckodriver.exe");
		driver = new FirefoxDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.MILLISECONDS);
		driver.get("https://signup.ebay.com/pa/crte");
		
	}
		
		
	@DataProvider
	public void getData() {
		
		
	}
	
	
		
		@Test
		public void Registerpage(String firstname,String lastname,String email,String password) {
			
			
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[3]/div[1]/div[2]/form[1]/div[1]/span[1]/span[1]/span[1]/input[1]")).clear();	
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[3]/div[1]/div[2]/form[1]/div[1]/span[1]/span[1]/span[1]/input[1]")).sendKeys(firstname);
			
			driver.findElement(By.id("lastname")).clear();
			driver.findElement(By.id("lastname")).sendKeys(lastname);
			
			
			driver.findElement(By.id("Email")).clear();
			driver.findElement(By.id("Email")).sendKeys(email);
			
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys(password);
			
	
			driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT")).click();
		}
		@AfterMethod
		public void teardown() {
			
			
		}
	
}
