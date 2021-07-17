package com.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseLayer.BaseClass;

public class utilsClass extends BaseClass {

	// handle drop down code
	public static void handleDropDown(WebElement wb, String dpvalue) {
		Select sel = new Select(wb);
		sel.deselectByVisibleText(dpvalue);
	}

	public static boolean checkDropDownList(WebElement wb, String dpvalue) {
		Select sel = new Select(wb);
		List<WebElement> ls = sel.getOptions();

		boolean dropdownValue = ls.contains(dpvalue);
		return dropdownValue;
	}

	// explcit wait

	public static void explicitwaitforElement(By wb, long l) {

		WebDriverWait wait = new WebDriverWait(driver, l);
		wait.until(ExpectedConditions.visibilityOfElementLocated(wb));

	}

	public static void TakeScreenShotEndOfTest() {

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String distSS = System.getProperty("user.dir");

		try {
			FileUtils.copyFile(f, new File(distSS + "/screenshot/" + System.currentTimeMillis() + ".jpg"));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void ExplicitWait(long timeOut, WebElement wb) {

		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOf(wb));

	}

	public static void SwitchToMainFrame() {
		driver.switchTo().frame("");
	}

	public static void SwitchToLeftFrame() {
		driver.switchTo().frame("");
	}

	public static void EmailAfterComletionOfTest() {

	}

	public static void SendUCInTextBox(String Str) {
		Actions act = new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys(Str).keyUp(Keys.SHIFT).build().perform();
	}

}
