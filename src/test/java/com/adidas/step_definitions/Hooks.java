package com.adidas.step_definitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import com.adidas.utilities.Driver;

import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\this is coming from BEFORE");

    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){

            final byte[] screenshot =((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");


        }

        Driver.closeDriver();

    }

    @Before("@db")
    public void setUpdb(){
        System.out.println("\t connecting to database...");
    }

    @After("@db")
    public void closeDb(){

        System.out.println("\t disconnecting to databse...");

    }


    @Before
    public void before(){

        Driver.get().manage().window().maximize();

    }


    @After
    public void after(){

        Driver.get().close();

    }

}
