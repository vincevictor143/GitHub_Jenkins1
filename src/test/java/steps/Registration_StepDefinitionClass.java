package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import io.cucumber.datatable.DataTable;

public class Registration_StepDefinitionClass 
{
	@Given("user should be at registration page")
	public void user_should_be_at_registration_page() 
	{
	    System.out.println("User is at registration page");
	}

	@When("user enters the following information")
	public void user_enters_the_following_information(DataTable dataTable) 
	{
		List<List<String>> data = dataTable.asLists(String.class);
		System.out.println("Below is the list of users");
		for(List<String> listvalue:data)
		{
			System.out.println(listvalue);
		}
	}

	@When("User clicks on registration button")
	public void user_clicks_on_registration_button() 
	{
	    System.out.println("When statement for submit button ");
	}

	@Then("User got created successfully")
	public void user_got_created_successfully() 
	{
	    System.out.println("User account is created successfully");
	}

}
