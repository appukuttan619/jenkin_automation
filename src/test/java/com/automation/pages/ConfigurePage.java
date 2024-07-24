package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfigurePage extends BasePage{

    @FindBy(tagName = "h1")
    WebElement configureTitle;
    public boolean isConfigureDisplayed(){
        return isDisplayed(configureTitle);
    }
}
