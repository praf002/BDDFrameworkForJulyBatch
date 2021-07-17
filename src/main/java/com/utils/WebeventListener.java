package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WebeventListener implements WebDriverEventListener {

	public void beforeAlertAccept(WebDriver driver) {
		
		//System.out.println("generate alert pop in web page");
		
	}

	public void afterAlertAccept(WebDriver driver) {
		
		//System.out.println("Clicked on OK button ");
		
	}

	public void afterAlertDismiss(WebDriver driver) {
		//System.out.println("Clicked on Cancel button ");
		
	}

	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Before Navigating to "+url);
		
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("After Navigating to "+url);
		
	}

	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		System.out.println("Before Refreshing web page ");
		
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
			System.out.println("Before Trying to find Element By: "+by.toString());
		
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println(" After Trying to find Element By: "+by.toString());
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		
		System.out.println("Before Trying to click on element "+element.toString());
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("After Trying to click on element "+element.toString());
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("Before changing value of element "+element.toString());
		
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("After changing value of element "+element.toString());
		
	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		
		//System.out.println("before switching to windows "+ windowName.toString());
	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		//System.out.println("After switching to windows "+ windowName.toString());
	}

	public void onException(Throwable throwable, WebDriver driver) {
		System.out.println("Exception occur  Soft Tech :: "+throwable);
	
		utilsClass.TakeScreenShotEndOfTest();
		
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	public void beforeGetText(WebElement element, WebDriver driver) {
		
		//System.out.println("before get text on text box "+ element.toString());
		
	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {
		//System.out.println("After get text on text box "+ element.toString());
		
	}

}
