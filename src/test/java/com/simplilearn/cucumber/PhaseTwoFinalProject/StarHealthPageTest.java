package com.simplilearn.cucumber.PhaseTwoFinalProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StarHealthPageTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "DRIVERS/WIN/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testStarHealthHomePage() {
        // Open Star Health website
        driver.get("https://www.starhealth.in/");

        // Validate the page title
        String expectedTitle = "Star Health Insurance: Medical, Accident and Travel insurance policies";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @AfterClass
    public void tearDown() {
        // Quit the driver session
        if (driver != null) {
            //driver.quit();
        }
    }
}

