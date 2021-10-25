package com.adidas.pages;

import com.adidas.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.WeakHashMap;

public class CartPage extends BasePage{
    public CartPage(){
        PageFactory.initElements(Driver.get(""),this);

    }

    @FindBy(css = "#cartur")
    public WebElement cartButton;

    @FindBy(xpath = "//td[.='Dell i7 8gb'] /../td[4]/a")      //This important locator for dynamic,parent-child relationship and four coloum.
    public WebElement deleteDellbutton;

    @FindBy(id="totalp")
    public WebElement totalPrice;

   @FindBy(xpath = "//h2[.=\"Total\"]")
    public WebElement totalText;

   @FindBy(xpath = "//button[@class='btn btn-success']")
   public WebElement placeOrderbutton;

   @FindBy(xpath = "//p[@class='lead text-muted 'and@style='display: block;']")
    public WebElement purchaseInfo;




       //EXTRA lOCATORS
      //p[class="lead text-muted "][style="display: block;"] ----> purchaseInfo
      // (css = "p[class='lead text-muted ']") ----->  purchaseInfo


}
