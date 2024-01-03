package com.simplilearn.cucumber.PhaseTwoFinalProject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HealthInsuranceTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "DRIVERS/WIN/chromedriver.exe");

        // Initialize the ChromeDriver
        driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.starhealth.in/");
    }

    @Test
    public void testHealthInsuranceFunctionality() {
    	
        // Find the health insurance link using XPath
    	
        WebElement healthInsuranceLink = driver.findElement(By.xpath("//*[@id=\"rc-tabs-0-tab-0\"]/div/span[1]/span/img"));

        // Click on the health link
        
        healthInsuranceLink.click();

        
        String currentUrl = driver.getCurrentUrl();
        Assert.assertFalse(currentUrl.contains("Health"));
        
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
