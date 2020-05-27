package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessChromeDemo {
	
	@Test
	public static void test() throws Exception {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/Driver/chromedriver/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation step by step");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
	}

}
