package com.simplilearn.cucumber.PhaseTwoFinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class StarHealthLogoTest {

    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "DRIVERS/WIN/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeClass
    public void beforeClass() {
        // Launching Star Health website
        driver.get("https://www.starhealth.in/");
    }

    @Test
    public void testStarHealthFlow(
            @Optional("John Doe") String name,
            @Optional("1234567890") String mobile,
            @Optional("john.doe@example.com") String email
    ) 
    {
        // Validate the alt value of the star health logo
    	
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/header/div[2]/div[1]/span/span/img"));
        Assert.assertEquals(logo.getAttribute("alt"), "Star Health Logo");

      
    }

    @AfterClass
    public void afterClass() {
      
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterSuite
    public void afterSuite() {
      
    }
}

