package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks_StepDefinitionClass 
{
	@Given("User should be at profile picture portal")
	public void user_should_be_at_profile_picture_portal() 
	{
	   System.out.println("Given Statemen for Profile picture portal");
	}

	@When("User should click on Add Profile button")
	public void user_should_click_on_add_profile_button() 
	{
	    System.out.println("When statement for add profile button");
	}

	@When("User should be select the profile picture to upload")
	public void user_should_be_select_the_profile_picture_to_upload() 
	{
		System.out.println("When statement profile picture upload");
	}

	@Then("Profile picture should get Added")
	public void profile_picture_should_get_added() 
	{
		System.out.println("Then statement for profile picture got added ");
	}

	@When("User should click on update Profile button")
	public void user_should_click_on_update_profile_button()
	{
		System.out.println("When statement profile picture update button");
	}

	@When("User should update the Image")
	public void user_should_update_the_image() 
	{
		System.out.println("When statement profile picture update image");
	}

	@Then("Profile picture should get updated")
	public void profile_picture_should_get_updated() 
	{
		System.out.println("Then statement profile picture got updated");
	}

	@When("User should click on delete Profile button")
	public void user_should_click_on_delete_profile_button() 
	{
		System.out.println("When statement profile picture delete button");
	}

	@Then("Profile picture should get deleted")
	public void profile_picture_should_get_deleted() 
	{
		System.out.println("Then statement profile picture got delete");
	}

}
