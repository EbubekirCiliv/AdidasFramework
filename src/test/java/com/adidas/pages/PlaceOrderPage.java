package com.adidas.pages;

import com.adidas.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPage extends BasePage {

    public PlaceOrderPage(){

        PageFactory.initElements(Driver.get(""),this);

    }

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id="country")
    public WebElement coutry;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id="card")
    public WebElement creditCard;

    @FindBy(id="month")
    public WebElement month;

    @FindBy(id="year")
    public WebElement year;

    @FindBy(xpath = "//button[@onclick='purchaseOrder()']")
    public WebElement purchaseButton;

    @FindBy(xpath = "//button[@class='confirm btn btn-lg btn-primary']")
    public WebElement okButton;


}
