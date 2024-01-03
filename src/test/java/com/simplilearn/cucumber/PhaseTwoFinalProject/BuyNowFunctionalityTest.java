package com.simplilearn.cucumber.PhaseTwoFinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BuyNowFunctionalityTest {

    private WebDriver driver;
    private static final String BASE_URL = "https://www.starhealth.in/";

    @BeforeClass
    public void setUp() {
       
        System.setProperty("webdriver.chrome.driver", "DRIVERS/WIN/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @Test
    public void testBuyNowFunctionality() {
    	
        // Click on the "Buy Now" button
    	
        WebElement buyNowButton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/header/div[2]/div[2]/div/button/span"));
        buyNowButton.click();
    
        String pageTitle = driver.getTitle();
      
        Assert.assertEquals(pageTitle.contains("Buy Now"), false);

    }

    @AfterClass
    public void tearDown() {
        // Close the browser after the test
        if (driver != null) {
            driver.quit();
        }
    }
}

