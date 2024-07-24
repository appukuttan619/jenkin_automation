package com.automation.tests;

import com.automation.pages.ConfigurePage;
import com.automation.pages.Dashboard;
import com.automation.pages.LoginPage;
import com.automation.pages.NewAddAllPage;
import com.automation.utils.ConfigManager;
import com.automation.utils.DriverManger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BastTest {
    LoginPage loginPage;
    Dashboard dashboard;
    NewAddAllPage newAddAllPage;
    ConfigurePage configurePage;
    @BeforeMethod
    public void setUp(){
        DriverManger.createDriver();
        ConfigManager.initProperties();
        loginPage = new LoginPage();
        dashboard = new Dashboard();
        newAddAllPage = new NewAddAllPage();
        configurePage = new ConfigurePage();
    }

    @AfterMethod
    public void tearDown(){
//        DriverManger.getDriver().quit();
    }
}
