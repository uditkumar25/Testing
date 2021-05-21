package page;



import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver ldriver) {
		
		this.driver=ldriver;
		
	}
	
	
    @FindBy(how=How.ID,using="message23")	
    WebElement userid;
	
	@FindBy(how=How.NAME,using ="password")
	WebElement pas;
	
	@FindBy(how=How.NAME,using="btnLogin")
	WebElement login;
	
	@FindBy(how=How.NAME,using ="btnReset")
	@CacheLookup	
	WebElement Reset;
	
	public void login_cre(String ui,String pass) {
		
		userid.sendKeys(ui);
		pas.sendKeys(pass);
		login.click();
		
	}

	
	

}
