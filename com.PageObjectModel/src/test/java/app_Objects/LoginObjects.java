package app_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Project_Utilities.Property_Loader;

public class LoginObjects {
	
	
	
	@FindBy(name="user")WebElement username;
	@FindBy(name="pass")WebElement password;
	@FindBy(name="btnSubmit")WebElement loginbutton;
	
	public WebDriver driver;
	
	public LoginObjects(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void getusername(String un) {
		
		username.sendKeys(un);
		
	}
	
	
	public void getpassword(String pw) {
		password.sendKeys(pw);
	}
	
	
	public void clickButton() {
		loginbutton.click();
	}
	

}
