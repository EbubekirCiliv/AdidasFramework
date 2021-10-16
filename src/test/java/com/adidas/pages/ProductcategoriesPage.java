package com.adidas.pages;

import com.adidas.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductcategoriesPage extends BasePage{
    public ProductcategoriesPage(){

        PageFactory.initElements(Driver.get("https://www.demoblaze.com/prod.html?idp_=8#"),this);

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

    @FindBy(xpath = "//a[@onclick='addToCart(8)']")
    public WebElement addToCartButton;




  //         //a[@id='itemc' and .='Laptops']  --->  laptopsButton
  //        //a[@onclick='byCat('notebook')'or @class='list-group-item'][3]   --->  laptopsButton
  //        a#itemc:nth-of-type(3)  --->  laptopsButton


   //       (//img[@class='card-img-top img-fluid'][@src='imgs/sony_vaio_5.jpg'])[1] --->This is also CORRECT locator for sonyVaioI5button


}
