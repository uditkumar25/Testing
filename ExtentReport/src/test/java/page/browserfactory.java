package page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserfactory {
	static WebDriver driver;
	
	
	public static WebDriver startbrowser(String Browser,String url) {
		
		if(Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\udkumar\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(Browser.equalsIgnoreCase("other")) {
			System.out.println("Type again");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
	}

}
