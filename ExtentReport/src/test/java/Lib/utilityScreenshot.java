package Lib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class utilityScreenshot {
	
	public static void captureScreenshots(WebDriver driver,String screenname) {
		
		
		try {
			File SrcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(SrcFile,new File("./Screenshots/"+screenname+".png"));
			System.out.println("Screenshot taken");
		} catch (Exception e) {
		System.out.println("Exception while taken screenshot "+e.getMessage());
		}
		
	}

}
