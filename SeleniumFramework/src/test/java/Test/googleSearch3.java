package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pages.GoogleSerachPage;

public class googleSearch3 {
	
	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		googleSearch();

	}
	
	public static void googleSearch() throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/Driver/chromedriver/chromedriver.exe");
		driver =  new ChromeDriver();
		
		//go to google.com
		
		driver.get("https://www.google.com/");
		
		//enter  text in text box

		GoogleSerachPage.textbox_search(driver).sendKeys("Automation");
		Thread.sleep(3000);
		GoogleSerachPage.button_search(driver).sendKeys(Keys.RETURN);

		driver.close();
		
		System.out.println("Test completed Sucessfully");
		
	}

}
