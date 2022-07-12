package selenium_tests.feature_steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import selenium_tests.page_object_model.*;

import static selenium_tests.Runner.driver;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class addtocart_feature {
	
	@Given("customer is on product page")
	public void customer_is_on_product_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.get().esm.check_text_exists("Shop"));

	}

	@When("product page is accessible")
	public void product_page_is_accessible()  throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		driver.get().esm.click(AddToCard_POM.btnShop);
		Assert.assertTrue(driver.get().esm.check_text_exists("Shop"));

		//throw new PendingException();
	}

	@When("he added four items in the card")
	public void he_added_four_items_in_the_card() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
   
		driver.get().esm.click(AddToCard_POM.prod1);
		driver.get().esm.click(AddToCard_POM.prod2);
		driver.get().esm.click(AddToCard_POM.prod3);
		driver.get().esm.click(AddToCard_POM.prod4);
		
		driver.get().esm.click(AddToCard_POM.btnCart);
		
		
		//throw new PendingException();
	}

	@Then("he see {int} items in the cart")
	public void he_see_items_in_the_cart(Integer int1) throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.get().esm.check_text_exists("Cart"));
		int items = driver.get().esm.count_matching_elements(AddToCard_POM.txtQty);
		Assert.assertEquals(items, 4);
		
	   // throw new PendingException();
	}

	@When("he removed {int} items from the cart")
	public void he_removed_items_from_the_cart(Integer int1) throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		
		driver.get().esm.click(AddToCard_POM.btnRemove);
		
	    //throw new PendingException();
	}
	
		

}
