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
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import app.LoginService.LoginService;
import app_Objects.LoginObjects;

public class AppLoginTest extends BrowserFactory
{
	
	//Add Extent Reports
	
   public LoginObjects loginpage;
   public WebDriver driver;
   public LoginService login;
   public Property_Loader prop;
   
   public ExtentReports extent;
   public ExtentTest test;
	
	@BeforeSuite
	public void setupSuite() {
		prop=new Property_Loader();
		extent = new ExtentReports("./TestReports/testoutput.html");
		test=extent.startTest("page Object Model");
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
    	   	
    	test.log(LogStatus.INFO, "verify login account");
    	
    	
    	
    }
    
    
    @Test(priority=1)
    public void verifyButton() {
    	login=new LoginService(driver);
    	login.clickLoginButton();
    	System.out.println("Clicking Login button");
    	test.log(LogStatus.INFO, "Click Login Button");
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
