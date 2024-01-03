package com.simplilearn.cucumber.PhaseTwoFinalProject;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static WebDriver driver;

    @Before
    public void setUp() {
       
        System.setProperty("webdriver.chrome.driver", "DRIVERS/WIN/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        // Close WebDriver session
        if (driver != null) {
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}

