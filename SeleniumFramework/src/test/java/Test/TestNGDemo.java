package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.PropertiesFile;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class TestNGDemo {

	static WebDriver driver = null;
	public static String browserName=null;

	@BeforeTest
	public void setUpTest() {
		
		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();

		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",projectPath+"/Driver/chromedriver/chromedriver.exe");
			driver =  new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",projectPath+"/Driver/geckodriver/geckodriver.exe");
		    driver =  new FirefoxDriver();
		}
		
		
	}

	@Test
	public static void googleSearch() throws InterruptedException {

		//go to google.com

		driver.get("https://www.google.com/");

		//enter  text in text box

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation");		
		//click on search button

		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.RETURN);

		//Thread.sleep(3000);

		//		try {
		//			  //  Block of code to try
		//			driver.findElement(By.xpath("//input[@name='btnK'][@type='submit']")).sendKeys(Keys.RETURN);
		//			}
		//			catch(Exception e) {
		//			  //  Block of code to handle errors
		//				
		//			System.out.println("Something went wrong.");
		//			}



	}

	@AfterTest
	public void teardownTest() {

		driver.close();
		//driver.quit();
		System.out.println("Test completed Sucessfully");
		PropertiesFile.setPrpperties();

	}

}
