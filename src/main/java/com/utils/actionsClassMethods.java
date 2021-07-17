package com.utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BaseLayer.BaseClass;

public class actionsClassMethods extends BaseClass{
	
	public static void clickOnElementByActionClass(WebElement wb) {
		Actions act=new Actions(driver);
		act.click(wb).build().perform();
	}

	// move end of the page by using actions class
	public static void moveEndOfPageByUsingActionsClass() {
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).build().perform();
	
	}
	// drag and drop by using actions 
	public static void dragAndDrop(WebElement source, WebElement target ) {
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
	}
	
	// right click by uusig actions
	public static void rightClickByActionClass(WebElement wb) {
		Actions act=new Actions(driver);
		act.contextClick(wb).build().perform();
	}
	
	
}
