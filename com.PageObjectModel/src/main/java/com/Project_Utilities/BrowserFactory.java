package com.Project_Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;



public class BrowserFactory {
	
	public static WebDriver driver;
	public static ChromeDriver chromedriver;
	
	private static Property_Loader property = new Property_Loader();
   
public static WebDriver InvokeBrowser(String browsername,String browserurl) {
		
		if(browsername.equals("chrome")) {
			
			
			ChromeDriverManager.chromedriver();
			ChromeOptions options = new ChromeOptions();
			//options.addArguments("--headless");
			options.addArguments("--chrome");
				
			
			//System.setProperty(property.getbrowsersetuppath(), property.getbrowserdriverpath());
			driver=new ChromeDriver(options);
			
		}else if(browsername.equals("firefox")) {
			
			//System.setProperty("webdriver.gecko.driver", "./appDrivers/geckodriver.exe");
			
			FirefoxDriverManager.firefoxdriver();
			
			driver=new FirefoxDriver();
			
		} else if(browsername.equals("edge")) {
			
			
		//	System.setProperty("webdriver.edge.driver", "./appDrivers/edgedriver.exe");
			EdgeDriverManager.edgedriver();
			driver=new EdgeDriver();
			
		}
		
		
		
		driver.get(browserurl);
		driver.manage().window().maximize();
		
		
		return driver;
		
	
}

public void closeBrowser() {
	driver.close();
}


}
