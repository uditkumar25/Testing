package NAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Recorder {
WebDriver driver;
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udkumar\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		 driver=new ChromeDriver();
			}
	
	@Test
	public void navigation() throws Exception {
		MyScreenRecorder.startRecording("navigation");
		Thread.sleep(5000);
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		MyScreenRecorder.stopRecording();
		
	}
	@AfterMethod
	public void terminate() {
		driver.quit();
	}
	}
