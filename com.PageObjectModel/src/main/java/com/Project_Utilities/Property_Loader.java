package com.Project_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Property_Loader {
	
	public Properties prop;
	
	public Property_Loader() {
		
		try {
			
			
			File file = new File("./appFiles/LoginApp.properties");
			FileInputStream fis = new FileInputStream(file);
			
			prop = new Properties();
			prop.load(fis);
			
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("File loaded ");
		}
	}
	

	//Creating default methods for property names
	public String getbrowsername() {
		return prop.getProperty("browsername");
	}
	
	public String getbrowsersetuppath() {
		
		return prop.getProperty("browsersetuppath");
	}
	
	public String getbrowserdriverpath() {
		
		return prop.getProperty("browserdriverpath");
	}
	
	public String getweburl() {
		return prop.getProperty("weburl");
	}
	
	public String getusername() {
		return prop.getProperty("username");
	}
	
	public String getpassword() {
		return prop.getProperty("password");
	}
	
	
	
	
	
	
}
