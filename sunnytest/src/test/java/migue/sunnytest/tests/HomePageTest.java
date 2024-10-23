package migue.sunnytest.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import migue.sunnytest.drivers.WebDriverFactory;
import migue.sunnytest.pages.HomePage;

public class HomePageTest {

	WebDriver driver;
	private HomePage homePage;
	
	@Parameters("browser")
    @BeforeClass
    public void setUp(String browser) {
    	
    	driver = WebDriverFactory.getDriver(browser);
    	
        driver.get("https://the-internet.herokuapp.com/");
        
        homePage = new HomePage(driver);
    }

    @Test
    public void testHomePageTitle() {
    
        String pageTitle = driver.getTitle();
        
        Assert.assertEquals(pageTitle, "The Internet", "Title does not match");
    }

    @Test
    public void testHomePageHeader() {
    	
    	Assert.assertEquals(homePage.getHeaderText(), "Welcome to the-internet");
       
    }

    @AfterClass
    public void tearDown() {
        if (driver!=null) {
        	driver.quit();
        }
    }
}