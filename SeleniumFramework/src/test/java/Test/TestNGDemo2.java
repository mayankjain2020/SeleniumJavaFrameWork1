package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class TestNGDemo2 {

	static WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/Driver/chromedriver/chromedriver.exe");
		driver =  new ChromeDriver();
	}

	@Test
	public static void googleSearch2() throws InterruptedException {

		//go to google.com

		driver.get("https://www.google.com/");

		//enter  text in text box

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation");		
		//click on search button

		Thread.sleep(3000);

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
	
	public static void googleSearch3() throws InterruptedException {

		//go to google.com

		driver.get("https://www.google.com/");

		//enter  text in text box

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation");		
		//click on search button

		Thread.sleep(3000);

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
		driver.quit();
		System.out.println("Test completed Sucessfully");

	}

}
