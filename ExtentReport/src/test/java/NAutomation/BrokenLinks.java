package NAutomation;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udkumar\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("http://www.zlti.com");
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		Iterator<WebElement> it=links.iterator();
		while(it.hasNext()) {
			String url=it.next().getAttribute("href");
				if(url==null || url.isEmpty()) {
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}
//			if(!url.startsWith("http://www.zlti.com")) {
//				System.out.println("URL belongs to another domain, skipping it.");
//				continue;
//			}
//			
			try {
				URL link = new URL(url);
				HttpURLConnection httpconn= (HttpURLConnection)link.openConnection();
				httpconn.setConnectTimeout(3000);
				httpconn.connect();	
				if(httpconn.getResponseCode()==200) {
					System.out.println(url+" is a valid link with response code as "+httpconn.getResponseCode());
				
				}
				
				else {
					System.out.println(url+" is an invalid link with response code as "+httpconn.getResponseCode());
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
