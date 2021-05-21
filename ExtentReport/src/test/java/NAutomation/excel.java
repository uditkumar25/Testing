package NAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class excel {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udkumar\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		String  beforexpath="//*[@id=\"customers\"]/tbody/tr[";
		String afterxpath ="]/td[1]";
		List<WebElement> w =driver.findElements(By.xpath("//*[@id=\"customers\"]//tr"));
		System.out.println(w.size());
		int count =w.size();
		for(int i=2;i<=count;i++) {
			String actual = beforexpath+i+afterxpath;
			System.out.println(driver.findElement(By.xpath(actual)).getText());
		}
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
	}

}
