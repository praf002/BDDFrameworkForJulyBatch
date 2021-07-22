package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class dealsPage extends BaseClass{

	@FindBy(xpath="//a[@href='/deals']")
	WebElement dealsLink;
	
	
	@FindBy(xpath="//a[@href='/deals/new']")
	WebElement CreateDealbutton;
	
	public dealsPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void clickonDealLink() {
		dealsLink.click();
	}
	
	public void clickonCreateDealButton() {
		CreateDealbutton.click();
	}
	
	
	
	
}
