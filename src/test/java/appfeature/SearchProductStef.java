package appfeature;

import io.cucumber.java.en.When;
import pages.SearchPage;
import qa.DriverFactory;

public class SearchProductStef 
{
	SearchPage searchpage=new SearchPage(DriverFactory.getDriver());
	
	@When("user search the product name {string}")
	public void user_search_the_product_name(String productName) 
	{
		searchpage.searchProduct(productName);
	}

	@When("User click on search button")
	public void user_click_on_search_button()
	{
		searchpage.searchClick();
	}

}
