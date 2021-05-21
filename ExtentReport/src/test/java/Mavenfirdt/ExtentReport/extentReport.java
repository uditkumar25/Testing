package Mavenfirdt.ExtentReport;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReport {
	
	ExtentReports extent;
@BeforeTest
public void loginTest(){
	String path = System.getProperty("user.dir")+"\\reports\\index1.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setReportName("Web Selenium");
	reporter.config().setDocumentTitle("Test Result");
	
	extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Shetty");
	
}
 @Test
 public void initial() {
	 ExtentTest test = extent.createTest("Demo-Start");
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\udkumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
	 System.out.println(driver.getTitle());
	 test.log(Status.FAIL, "fail because of error");
		test.log(Status.PASS, "Pass - All pass");
		test.log(Status.SKIP, "Skip");
		test.log(Status.ERROR, "Error");
		test.log(Status.INFO, "Information");
	 extent.flush();
 }






}
