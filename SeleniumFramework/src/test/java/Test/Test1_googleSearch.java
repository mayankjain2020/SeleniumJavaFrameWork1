package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1_googleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		googleSearch();

	}
	
	public static void googleSearch() throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/Driver/chromedriver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		
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
		
		
		
		driver.close();
		
		System.out.println("Test completed Sucessfully");
		
	}

}
