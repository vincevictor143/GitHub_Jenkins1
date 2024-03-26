package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Campaign_StepDefClass 
{
	
	@Given("User is at campaign Page")
	public void user_is_at_campaign_page() 
	{
	    System.out.println("A");
	}

	@When("User click on create campaign button")
	public void user_click_on_create_campaign_button() 
	{
		System.out.println("B");
	}

	@When("User Enters the information")
	public void user_enters_the_information() 
	{
		System.out.println("C");
	}

	@When("User clicks on save button")
	public void user_clicks_on_save_button() 
	{
		System.out.println("D");
	}

	@Then("Campaign Should get created")
	public void campaign_should_get_created() 
	{
		System.out.println("E");
	}

	@When("User click on Edit campaign button")
	public void user_click_on_edit_campaign_button() 
	{
		System.out.println("F");
	}

	@When("User Enters Sending information")
	public void user_enters_sending_information() 
	{
		System.out.println("G");
	}

	@When("User clicks on Schedule button")
	public void user_clicks_on_schedule_button() 
	{
		System.out.println("H");
	}

	@Then("Campaign Should get Scheduled")
	public void campaign_should_get_scheduled() 
	{
		System.out.println("I");
	}

	@When("User click on Sent campaign button")
	public void user_click_on_sent_campaign_button() 
	{
		System.out.println("J");
	}

	@Then("User should see the sent count")
	public void user_should_see_the_sent_count() 
	{
		System.out.println("K");
	}

}
