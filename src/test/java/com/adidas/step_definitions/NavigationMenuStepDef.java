

package com.adidas.step_definitions;

import com.adidas.pages.BasePage;
import com.adidas.pages.CartPage;
import com.adidas.pages.PlaceOrderPage;
import com.adidas.pages.ProductcategoriesPage;
import com.adidas.utilities.BrowserUtils;
import com.adidas.utilities.ConfigurationReader;
import com.adidas.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class NavigationMenuStepDef {
    ProductcategoriesPage productcategoriesPage = new ProductcategoriesPage();
    CartPage cartPage=new CartPage();
    PlaceOrderPage placeOrderPage=new PlaceOrderPage();

    @Given("the customer on the Home page")
    public void the_customer_on_the_Home_page() {
        Driver.get("https://www.demoblaze.com/prod.html?idp_=8#").get(ConfigurationReader.get("url"));

    }

    @When("the customer click on Laptops")
    public void the_customer_click_on_Laptops() {
        BrowserUtils.waitFor(3);
        productcategoriesPage.laptopsButton.click();

    }

    @When("the customer click on Sony vaio i5")
    public void the_customer_click_on_Sony_vaio_i5() {
        BrowserUtils.waitFor(3);
        productcategoriesPage.sonyVaioI5button.click();
        BrowserUtils.waitFor(3);
    }

    @When("the customer click on Add to cart")
    public void the_customer_click_on_Add_to_cart() {
        BrowserUtils.waitFor(3);
        productcategoriesPage.addToCartButton.click();
        BrowserUtils.waitFor(5);

    }

    @When("the customer Accept pop up confirmation")
    public void the_customer_Accept_pop_up_confirmation() {
        WebDriver webDriver = Driver.get("https://www.demoblaze.com/prod.html?idp_=8#");
        webDriver.switchTo().alert().accept();

    }

    @Then("the price should be visible")
    public void the_price_should_be_visible() {
        BrowserUtils.waitFor(3);
        String actualText = productcategoriesPage.priceText.getText();
        Assert.assertEquals("$790 *includes tax", actualText);
        System.out.println("$790 *includes tax" + actualText);

    }

    @When("click the Home button")
    public void click_the_Home_button() {
        productcategoriesPage.homeButton.click();
        BrowserUtils.waitFor(3);


    }
    @When("click on Laptops")
    public void click_on_Laptops() {
        productcategoriesPage.laptopsButton.click();
        BrowserUtils.waitFor(3);

    }

    @When("click on Dell i7 8gb")
    public void click_on_Dell_i7_8gb() {
       productcategoriesPage.delli7Button.click();
       BrowserUtils.waitFor(3);

    }

    @When("click on Add to cart on Dell")
    public void click_on_Add_to_cart_on_Dell() {
        productcategoriesPage.dellAddcart.click();
        BrowserUtils.waitFor(5);
    }

    @When("Accept pop up confirmation")
    public void accept_pop_up_confirmation() {
        WebDriver webDriver = Driver.get("https://www.demoblaze.com/prod.html?idp_=12#");
        webDriver.switchTo().alert().accept();
        BrowserUtils.waitFor(5);

    }

    @When("click on Add to Chart button")
    public void click_on_Add_to_Chart_button() {
        cartPage.cartButton.click();
        BrowserUtils.waitFor(3);
    }

    @When("delete Dell i7 8gb from Cart.")
    public void delete_Dell_i7_8gb_from_Cart() {
        cartPage.deleteDellbutton.click();
        BrowserUtils.waitFor(3);

    }

    @Then("verify the price decreased as expected")
    public void verify_the_price_decreased_as_expected() {

//        String actualTotalText=cartPage.totalPrice.getText(); --->Only locate for one Webelement
//        Assert.assertEquals("790",actualTotalText);
//        System.out.println("790 " + actualTotalText);

        String actualTotaltext=cartPage.totalText.getText();
        String actualTotalprice=cartPage.totalPrice.getText();
        String all=actualTotaltext+actualTotalprice;

        Assert.assertEquals("Total790",all);
        System.out.println("Total790"+all);
    }

    @Then("click on Place Order button")
    public void click_on_Place_Order_button() {

        cartPage.placeOrderbutton.click();
        BrowserUtils.waitFor(3);

    }

    @Then("fill in all web form fields.")
    public void fill_in_all_web_form_fields() {

       placeOrderPage.name.sendKeys("Abdullah");
       BrowserUtils.waitFor(3);
       placeOrderPage.coutry.sendKeys("Turkey");
       BrowserUtils.waitFor(3);
       placeOrderPage.city.sendKeys("Istanbul");
       BrowserUtils.waitFor(3);
       placeOrderPage.creditCard.sendKeys("8956247914163278");
       BrowserUtils.waitFor(3);
       placeOrderPage.month.sendKeys("April");
       BrowserUtils.waitFor(3);
       placeOrderPage.year.sendKeys("2021");
       BrowserUtils.waitFor(3);
       placeOrderPage.purchaseButton.click();
       BrowserUtils.waitFor(3);

    }

    @Then("Click on Purchase")
    public void click_on_Purchase() {
        placeOrderPage.purchaseButton.click();

    }

    @Then("Capture and log purchase Id and Amount")
    public void capture_and_log_purchase_Id_and_Amount() {
        BrowserUtils.waitFor(7);
        String actualPurchaseinfo=cartPage.purchaseInfo.getText();
        System.out.println(actualPurchaseinfo);
        BrowserUtils.waitFor(5);


    }

    @Then("assert purchase amount equals expected")
    public void assert_purchase_amount_equals_expected() {
        String actualamount=cartPage.purchaseInfo.getText();
        Assert.assertTrue("assert purchase amount equals expected", actualamount.contains("Amount: 790 USD"));
        BrowserUtils.waitFor(5);


    }

    @Then("click on Ok button")
    public void click_on_Ok_button() {

      placeOrderPage.okButton.click();
      BrowserUtils.waitFor(5);


    }


}



//    @When("click on {string}")                    Note--->Try to do it dynamic later.
//    public void click_on(String string) {
//
//
//    }



//    @When("delete {string} from cart.")
//    public void delete_from_cart(String string) {
//        // Write code here that turns the phrase above into concrete actions     Note--->Try to do it dynamic later.
//        throw new io.cucumber.java.PendingException();
//    }



