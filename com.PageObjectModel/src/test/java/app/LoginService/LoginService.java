package app.LoginService;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import app_Objects.LoginObjects;

public class LoginService {
	
	
	public static LoginObjects loginpage;
	public static WebDriver driver;
	
	public LoginService(WebDriver driver) {
		
		LoginService.driver=driver;
		loginpage=PageFactory.initElements(driver, LoginObjects.class);
	}
	
	public LoginService insertusername(String un) {
		
		
		loginpage.getusername(un);
		return this;
		
				
	}
	
	public LoginService insertpassword(String pw) {
		loginpage.getpassword(pw);
		return this;
	}
	
	public LoginService clickLoginButton() {
		loginpage.clickButton();
		return this;
	}
	

}
