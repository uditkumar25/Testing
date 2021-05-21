package page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerifyLOGIN {
	
	
	@Test
	public void checkval() {
		
		WebDriver w =browserfactory.startbrowser("chrome", "http://demo.guru99.com/V4/");
		
		Login login_page=PageFactory.initElements(w, Login.class);
		login_page.login_cre("mgr123", "mgr!23");
		
	}

}
