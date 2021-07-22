package StepDefination;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import com.BaseLayer.BaseClass;
import com.PageLayer.ContactPage;
import com.PageLayer.HomePage;
import com.PageLayer.LoginPage1;
import com.PageLayer.dealsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class contactpage extends BaseClass{
	LoginPage1 loginpage;
	HomePage homepage;
	ContactPage contactpage;
	dealsPage dealspage;

	@Given("user is login page")
	public void user_is_login_page() throws InterruptedException {
		BaseClass.intiliazation();
		Thread.sleep(4000);
	}
	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() throws InterruptedException {
		 loginpage=new LoginPage1();
		 Thread.sleep(4000);
		loginpage.typeusername(prop.getProperty("username"));
		loginpage.typepassword(prop.getProperty("password"));
		loginpage.clickOnLoginButton();
	}
	@Then("user is on home page")
	public void user_is_on_home_page() throws InterruptedException {
		 homepage=new HomePage();
		 Thread.sleep(4000);
		String actualtitle= homepage.validateTitle();
		assertEquals(actualtitle, "Cogmento CRM");
		String actualUrl=homepage.validateurl();
		assertEquals(actualUrl,actualUrl);
		
	}
	@Then("user click on contact link")
	public void user_click_on_contact_link() throws InterruptedException {
		Thread.sleep(4000);
		homepage.clickOnContact();
	}
	@Then("user click on create button")
	public void user_click_on_create_button() throws InterruptedException {
		 contactpage=new ContactPage();
		 contactpage.clickOnCreateButton();
		 Thread.sleep(4000);
		
	}
	@Then("user enter first name and last name")
	public void user_enter_first_name_and_last_name() throws InterruptedException {
		contactpage.typeFirstName(prop.getProperty("firstname"));
		contactpage.typeLastname(prop.getProperty("lastname"));
		Thread.sleep(10000);
		driver.close();
		
	}

	@Then("user click on Deals link")
	public void user_click_on_deals_link() throws InterruptedException {
		 dealspage=new dealsPage();
		dealspage.clickonDealLink();
		Thread.sleep(5000);
	}
	@Then("user click on create deals button")
	public void user_click_on_create_deals_button() throws InterruptedException {
		dealspage.clickonCreateDealButton();
		Thread.sleep(5000);
		driver.findElement(By.name("title")).sendKeys("automation testing");
		Thread.sleep(5000);
		driver.close();
	}
	
}
