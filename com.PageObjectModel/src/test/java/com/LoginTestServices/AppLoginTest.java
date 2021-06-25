package com.LoginTestServices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Project_Utilities.BrowserFactory;
import com.Project_Utilities.Property_Loader;

import app.LoginService.LoginService;
import app_Objects.LoginObjects;

public class AppLoginTest extends BrowserFactory
{
   public LoginObjects loginpage;
   public WebDriver driver;
   public LoginService login;
   public Property_Loader prop;
	
	@BeforeSuite
	public void setupSuite() {
		prop=new Property_Loader();
		
	}
	
	
	@BeforeTest
	public void launchBrowser() {
		driver = InvokeBrowser(prop.getbrowsername(),prop.getweburl());
	}
	
	
	
    @Test(priority=2)
   
    public void verifyTest()
    {
    		login=new LoginService(driver);
    	   	login.insertusername(prop.getusername()).insertpassword(prop.getpassword()).clickLoginButton();
    	   	
    	
    	
    	
    	
    }
    
    
    @Test(priority=1)
    public void verifyButton() {
    	login=new LoginService(driver);
    	login.clickLoginButton();
    	System.out.println("Clicking Login button");
    }
    
    
    @AfterSuite
    public void aftersuite() {
    	if(null != driver) {
    		driver.close();
    		driver.quit();
    		
    		System.out.println("Closing Browser");
    	}
    }
    
    
    
}
