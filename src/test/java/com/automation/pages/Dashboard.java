package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends BasePage{

    @FindBy(id = "description-link")
    WebElement descriptionLink;
    public boolean isDashboardDisplayed(){
        return isDisplayed(descriptionLink);
    }

    @FindBy(xpath = "//div[@id = 'side-panel']/div[1]//span[@class = 'task-link-wrapper ']/a/span[text() = 'New Item']/..")
    WebElement newItemButton;
    public void clickOnAddNewButton() {
        newItemButton.click();
    }
}
