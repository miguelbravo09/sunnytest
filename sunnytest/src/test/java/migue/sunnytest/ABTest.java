package migue.sunnytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ABTest {
	WebDriver driver;
	
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver-win64/chromedriver.exe");
        
        driver = new ChromeDriver();
        
        driver.get("https://the-internet.herokuapp.com/");
    }

    @Test
    public void testHomePageTitle() {
   }

    @Test
    public void testHomePageHeader() {
   }

    @AfterClass
    public void tearDown() {
        if (driver!=null) {
        	driver.quit();
        }
    }
}
