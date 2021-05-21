package NAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class highlight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udkumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

        //To launch gmail.com
	driver.get("https://www.softwaretestingmaterial.com/highlight-element-using-selenium/");
        //Collects the webelement
	WebElement ele = driver.findElement(By.linkText("JavascriptExecutor in Selenium WebDriver"));
        //Create object of a JavascriptExecutor interface
	JavascriptExecutor js = (JavascriptExecutor) driver;
        //use executeScript() method and pass the arguments 
        //Here i pass values based on css style. Yellow background color with solid red color border. 
	//js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border:solid black')", ele);
	//js.executeScript("arguments[0].style.border='3px solid red'", ele);
	
	}

}
