package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportBasicDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");
		
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test One", "this is test to validate google search functionality");
        
        String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/Driver/chromedriver/chromedriver.exe");
		driver =  new ChromeDriver();
		test1.log(Status.INFO, "Starting test case");
		
		driver.get("https://www.google.com/");
		test1.pass("Navigated to google.com");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation");	
		test1.pass("Enter the test in searchbox");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.RETURN);
		test1.pass("Pressed keyboard enter key");
		
		driver.close();
		driver.quit();
		
		test1.pass("Closed the browser");
		
		test1.info("Test completed");
		
		// calling flush writes everything to the log file
        extent.flush();
		
		

	}

}
