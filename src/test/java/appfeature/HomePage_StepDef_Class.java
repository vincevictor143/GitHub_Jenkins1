package appfeature;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import qa.DriverFactory;

public class HomePage_StepDef_Class 
{
	HomePage homepage=new HomePage(DriverFactory.getDriver()); // driver as argument
	@Given("User is at landing page")
	public void user_is_at_landing_page() 
	{
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://amazon.in");
	}

	@Then("Page title should contains {string}")
	public void page_title_should_contains(String titleString)
	{
		String title = homepage.getTitleOfpage();
		boolean isPresent=title.contains(titleString);
		
		Assert.assertTrue(isPresent); // Hard assertion
		
	}

	@Then("Cart icon should get displayed")
	public void cart_icon_should_get_displayed() 
	{
		boolean isdisplay=homepage.verifyCart();
		
		Assert.assertTrue(isdisplay);
	}

	@When("User click on the black friday section deal")
	public void user_click_on_the_black_friday_section_deal() 
	{
		homepage.blackFridayDeal();
	}

	@When("User click on sign in button")
	public void user_click_on_sign_in_button() 
	{
		homepage.gotoSignPage();
	}

	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String uname)
	{
		homepage.enterUsername(uname);
	}

	@When("User enters the password as {string} with Sign in")
	public void user_enters_the_password_as_with_sign_in(String pwd)
	{
		homepage.finalSign(pwd);
	}

	


}
