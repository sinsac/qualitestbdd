package selenium_tests.feature_steps;

import cucumber.api.PendingException;
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
	@When("^adds items to cart$")
	public void adds_items_to_cart() throws Throwable {

			driver.get().esm.click(AddToCard_POM.prod1);
			driver.get().esm.click(AddToCard_POM.prod2);
			driver.get().esm.click(AddToCard_POM.prod3);
			driver.get().esm.click(AddToCard_POM.prod4);
			
	}
}
