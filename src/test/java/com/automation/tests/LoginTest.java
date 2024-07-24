package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BastTest{

    @Test
    public void checkingWhetherUserCanLogin(){
        loginPage.getPage();
        loginPage.doLogin();
        Assert.assertTrue(dashboard.isDashboardDisplayed());
    }
    @Test
    public void addingNewProjectInJenkin(){
        loginPage.getPage();
        loginPage.doLogin();
        Assert.assertTrue(dashboard.isDashboardDisplayed());
        dashboard.clickOnAddNewButton();
        newAddAllPage.addNewProject();
        Assert.assertTrue(configurePage.isConfigureDisplayed());


    }

}
