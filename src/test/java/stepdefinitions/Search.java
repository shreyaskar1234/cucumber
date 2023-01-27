package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	 @Given("^I visit the website as a guest user$")
	    public void i_visit_the_website_as_a_guest_user() {
	    System.out.println(">> Given - I visit the website as a guest user");
	    		
	    }

	    @When("^I select the books option from the dropdown$")
	    public void i_select_the_books_option_from_the_dropdown()
	    {
	    	System.out.println(">>When - I select the books option from the dropdown");
	    
	    }

	    @When("^I select the baby option from the search dropdown$")
	    public void i_select_the_baby_option_from_the_search_dropdown() 
	    {
	    	System.out.println(">>When - I select the baby option from the dropdown");
	    }

	    @Then("^I should see the books page loaded$")
	    public void i_should_see_the_books_page_loaded() {
	    	System.out.println(">>Then - I should see the books page loaded");
	    }

	    @Then("^I should see the page having as offers on baby product is getting displayed$")
	    public void i_should_see_the_page_having_as_offers_on_baby_product_is_getting_displayed() {
	    	System.out.println(">>Then - I should see the page having as offers on baby product is getting displayed");
	    }

	    @And("^I click on Search icon$")
	    public void i_click_on_search_icon() {
	    	System.out.println(">>And - I click on Search icon");

	    }

	    @And("^I click on search icon option$")
	    public void i_click_on_search_icon_option() {
	    	System.out.println(">>And - I click on search icon option ");
	    }

	    @But("^I should not see the other category products$")
	    public void i_should_not_see_the_other_category_products() {
	    	System.out.println(">>But -I should not see the other category products ");

	    }

	}