package com.automation.pages;

import com.automation.utils.DriverManger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    WebDriver driver;

    public BasePage(){
        driver = DriverManger.getDriver();
        PageFactory.initElements(driver, this);
    }


    public boolean isDisplayed(WebElement element){
        try{
            return element.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }
}
