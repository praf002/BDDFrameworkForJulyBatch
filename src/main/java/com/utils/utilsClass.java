package com.utils;



import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseLayer.BaseClass;

public class utilsClass extends BaseClass {
	
	//handle drop down code
	public static void handleDropDown(WebElement wb, String dpvalue) {
		Select sel=new Select(wb);
		sel.deselectByVisibleText(dpvalue);
	}
	
	public static boolean checkDropDownList(WebElement wb, String dpvalue) {
		Select sel=new Select(wb);
		List<WebElement> ls=sel.getOptions();
		
		boolean dropdownValue=ls.contains(dpvalue);
		return dropdownValue;
	}
	
	// explcit wait
	
	public static void explicitwaitforElement(By wb, long l) {
		
		WebDriverWait wait=new WebDriverWait(driver,l);
		wait.until(ExpectedConditions.visibilityOfElementLocated(wb));
		
	}
	
	// take screen shot
	public static void takeScreenShotAttheEnd() {
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(f, new File(System.currentTimeMillis()+".jpg"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	// alert pop  code
	public void handlealertpop() {
		
	}
	
	

}
