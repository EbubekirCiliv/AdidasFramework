package com.adidas.step_definitions;

import com.adidas.pages.ProductcategoriesPage;
import com.adidas.utilities.BrowserUtils;
import com.adidas.utilities.ConfigurationReader;
import com.adidas.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class NavigationMenuStepDef {

    @Given("the customer on the Home page")
    public void the_customer_on_the_Home_page() {
    Driver.get("https://www.demoblaze.com/prod.html?idp_=8#").get(ConfigurationReader.get("url"));

    }

    @When("the customer click on Laptops")
    public void the_customer_click_on_Laptops() {
        BrowserUtils.waitFor(5);
        ProductcategoriesPage productcategoriesPage=new ProductcategoriesPage();
        productcategoriesPage.laptopsButton.click();

    }
    @When("the customer click on Sony vaio i5")
    public void the_customer_click_on_Sony_vaio_i5() {
        BrowserUtils.waitFor(5);
        ProductcategoriesPage productcategoriesPage=new ProductcategoriesPage();
        productcategoriesPage.sonyVaioI5button.click();
        BrowserUtils.waitFor(5);

    }

    @When("the customer click on Add to cart")
    public void the_customer_click_on_Add_to_cart() {
      BrowserUtils.waitFor(5);
      ProductcategoriesPage productcategoriesPage=new ProductcategoriesPage();
      productcategoriesPage.addToCartButton.click();
      BrowserUtils.waitFor(10);

    }

    @When("the customer Accept pop up confirmation")
    public void the_customer_Accept_pop_up_confirmation() {
        WebDriver webDriver = Driver.get("https://www.demoblaze.com/prod.html?idp_=8#");
        webDriver.switchTo().alert().accept();
        BrowserUtils.waitFor(10);


    }

    @Then("the title should be Sony vaio i5")
    public void the_title_should_be_Sony_vaio_i5() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
