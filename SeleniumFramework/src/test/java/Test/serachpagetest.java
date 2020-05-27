package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.SerachPageObject;

public class serachpagetest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		googleserachtest();
		
	}

	public static void googleserachtest() throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/Driver/chromedriver/chromedriver.exe");
		driver =  new ChromeDriver();
		
		SerachPageObject serachPageObj = new SerachPageObject(driver);
		
		driver.get("https://www.google.com/");
		
		serachPageObj.setTextInSearchBox("Automation");
		
		Thread.sleep(3000);
		
		serachPageObj.ClickSearchButton();
		
		driver.close();	

	}
}
