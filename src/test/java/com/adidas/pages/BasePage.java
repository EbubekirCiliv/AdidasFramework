package com.adidas.pages;

import com.adidas.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage{
public BasePage() {

   PageFactory.initElements(Driver.get("https://www.demoblaze.com/prod.html?idp_=8#"),this);}

}
