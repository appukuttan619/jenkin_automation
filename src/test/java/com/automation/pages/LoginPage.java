package com.automation.pages;

import com.automation.utils.ConfigManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public void getPage(){
        driver.get("http://localhost:8080/");
    }

    @FindBy(id = "j_username")
    WebElement userName;
    @FindBy(id = "j_password")
    WebElement password;
    @FindBy(name = "Submit")
    WebElement submitButton;
    public void doLogin() {
        userName.sendKeys(ConfigManager.getTheProperty("loginUserName"));
        password.sendKeys(ConfigManager.getTheProperty("loginPassword"));
        submitButton.click();
    }
}
