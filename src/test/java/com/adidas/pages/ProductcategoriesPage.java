package com.adidas.pages;

import com.adidas.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductcategoriesPage extends BasePage{
    public ProductcategoriesPage(){

        PageFactory.initElements(Driver.get(""),this);

    }

    @FindBy(xpath="//div[@class='list-group']")
    public List<WebElement> categories;

    @FindBy(xpath = "//a[@onclick='byCat('phone')'']")  //It might be wrong
    public WebElement phonessButton;

    @FindBy(css = "a#itemc:nth-of-type(3)")  //Correct
    public WebElement laptopsButton;

    @FindBy(xpath = "//a[@onclick='byCat('monitor')']")  //It might be wrong
    public WebElement monitorsButton;

    @FindBy(xpath = "(//img[@class='card-img-top img-fluid'])[1]")
    public WebElement sonyVaioI5button;

    @FindBy(css = "a[onclick='addToCart(8)']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//h3[@class='price-container']")
    public WebElement priceText;

    @FindBy(xpath="//div//h4//a[.='Dell i7 8gb']")  //This locator is important one.Parent child relationship and multiple laptop options.
    public WebElement delli7Button;

    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    public WebElement homeButton;

    @FindBy(xpath = "//div//h4//a[.='2017 Dell 15.6 Inch']") //This locator is important one.Parent child relationship example.
    public WebElement dell15Inch;                            // Extra example

    @FindBy (css = "a[onclick='addToCart(12)']")
    public WebElement dellAddcart;


   //               DIFFERENT LOCATORS
  //         //a[@id='itemc' and .='Laptops']  --->  laptopsButton
  //        //a[@onclick='byCat('notebook')'or @class='list-group-item'][3]   --->  laptopsButton
  //        a#itemc:nth-of-type(3)  --->  laptopsButton


   //       (//img[@class='card-img-top img-fluid'][@src='imgs/sony_vaio_5.jpg'])[1] --->This is also CORRECT locator for sonyVaioI5button

    //      (//a[@onclick='addToCart(8)' and @class='btn btn-success btn-lg'])[1]   --> addToCartButton
    //      css = "a[onclick='addToCart(8)']"--> addToCartButton
    //      xpath = "//div[@class='col-sm-12 col-md-6 col-lg-6']")--> addToCartButton
    //      xpath ="//div[@class="col-sm-12 col-md-6 col-lg-6"]"--> addToCartButton


    /**
     * I have to create page classes for each page
     *  I have to create a method for calculate laptop price
     */
}
