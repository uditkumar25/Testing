package JavaPoint;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udkumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/brands/lakme/c/604?transaction_id=bf36e291f73bf0454be9a5932a33a375&intcmp=hp,in_the_spotlight,4,lakme");
driver.findElement(By.className("AddBagIcon")).click();
		List<WebElement> productNames = driver.findElements(By.xpath(".//*[@class='product-name']"));

		for(WebElement productName : productNames){

		System.out.println(productName);
		
	}

}}
