package com.adidas.step_definitions;

import com.adidas.pages.ProductcategoriesPage;
import com.adidas.utilities.BrowserUtils;
import com.adidas.utilities.ConfigurationReader;
import com.adidas.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ProductCategStepDef {


    @Given("the customer navigate the Home page")
    public void the_customer_navigate_the_Home_page() {

        Driver.get("https://www.demoblaze.com/prod.html?idp_=8#").get(ConfigurationReader.get("url"));


    }

    @Then("the customer should see following options")
    public void the_customer_should_see_following_options(List<String> categories) {

        BrowserUtils.waitFor(10);
        List<String> actualOptions=BrowserUtils.getElementsText(new ProductcategoriesPage().categories);

        Assert.assertEquals(actualOptions,categories);

        System.out.println("CATEGORIES = " + categories);
        System.out.println("actualOptions = " +actualOptions );
       //Think about later again.

    }
}