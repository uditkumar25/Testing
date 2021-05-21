package Mavenfirdt.ExtentReport;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udkumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("document.getElementById('identifierId').value='Helloz';");
		
		
		
		

	}

}
