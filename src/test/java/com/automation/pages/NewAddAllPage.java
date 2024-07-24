package com.automation.pages;

import com.automation.utils.ConfigManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileNotFoundException;
import java.util.Random;

public class NewAddAllPage extends BasePage{
    public void createRandomProjectName(){
        String currentName = ConfigManager.getTheProperty("jenkinsBaseProjectName");
        Random rand = new Random();
        currentName += rand.nextInt(10,9999);
        try {
            ConfigManager.setProperty("jenkinsProjectName", currentName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static  void main(String[] args){
        ConfigManager.initProperties();
        NewAddAllPage na = new NewAddAllPage();
        na.createRandomProjectName();
    }


    @FindBy(id = "name")
    WebElement jenkinsProjectNameElement;
    @FindBy(xpath = "//div[@id='j-add-item-type-standalone-projects']//ul[@class = 'j-item-options']/li[1]")
    WebElement freeStyleProjectElement;
    @FindBy(id = "ok-button")
    WebElement okButton;
    public void addNewProject(){
        createRandomProjectName();
        jenkinsProjectNameElement.sendKeys(ConfigManager.getTheProperty("jenkinsProjectName"));
        freeStyleProjectElement.click();
        okButton.click();
    }

}
