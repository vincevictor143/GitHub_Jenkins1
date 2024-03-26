package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps 
{
	@Given("User is at login page")
	public void preconditions()
	{
		System.out.println("User is at login page");
	}
	
	@When("Enter the username")
	public void enterUsername()
	{
		System.out.println("Entered the username ");
	}
	
	@When("Enter the Password")
	public void enterPassword()
	{
		System.out.println("Entered the password ");
	}
	
	@When("Click on the login button")
	public void clickOnLogin()
	{
		System.out.println("Click on login button  ");
	}
	
	@Then("User is logged in")
	public void finaOutput()
	{
		System.out.println("User is logged in  ");
	}
	
	@Given("user is launched the URL")
	public void launchURL()
	{
		System.out.println("User launched the URL");
	}
	
	@Given("user is logged into application")
	public void logged()
	{
		System.out.println("User logged into application");
	}
	
	@When("Click on insurance tab")
	public void clickButton()
	{
		System.out.println("Triggered to insurnace tab");
	}
	
	@When("Click on car insurance option")
	public void carInsurnace()
	{
		System.out.println("Clicked on Insurance option");
	}
	
	@Then("user is at car insurance page")
	public void endPage()
	{
		System.out.println("User is at car insurance page");
	}
	
}
