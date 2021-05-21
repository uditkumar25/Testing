package Mavenfirdt.ExtentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksSeparate {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\udkumar\\Downloads\\chromedriver_win32_Latest\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer =driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement Column =footer.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		System.out.println(Column.findElements(By.tagName("a")).size());
		for(int j=1;j<Column.findElements(By.tagName("a")).size();j++) {
			
		String clickonLink=	Keys.chord(Keys.CONTROL,Keys.ENTER);
			Column.findElements(By.tagName("a")).get(j).sendKeys(clickonLink);
			Thread.sleep(3000);
			driver.getWindowHandles();
			
		}
		
		
		
	}

}
