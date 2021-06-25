package com.Project_Utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenCapture {
	
public WebDriver drver;
	
	
	
	public  String screencapture(WebDriver driver,String screename) throws Exception {
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File file = element.getScreenshotAs(OutputType.FILE);
		
		String dateName = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
		
		File dest = new File("./screens/"+screename+dateName+".png");
		String destpath = dest.getAbsolutePath();
		FileUtils.copyFile(file, dest);
		
			
		return destpath;
		
		
	}

}
