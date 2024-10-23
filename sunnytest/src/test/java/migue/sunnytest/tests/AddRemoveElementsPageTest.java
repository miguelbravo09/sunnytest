package migue.sunnytest.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import migue.sunnytest.drivers.WebDriverFactory;
import migue.sunnytest.pages.AddRemoveElementsPage;

public class AddRemoveElementsPageTest {
	
	WebDriver driver;
	private AddRemoveElementsPage addRemoveElementsPage;
	
	@Parameters("browser")
    @BeforeClass
    public void setUp(String browser) {
    	
    	driver = WebDriverFactory.getDriver(browser);
    	
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        
        addRemoveElementsPage = new AddRemoveElementsPage(driver);
    }

    @Test
    public void testClickAddElementButton() {
            
        WebElement button = addRemoveElementsPage.clickAddElementButton();
        
        Assert.assertTrue(button.isDisplayed(), "Element button is not displayed");
    }
    

    @AfterClass
    public void tearDown() {
        if (driver!=null) {
        	driver.quit();
        }
    }

}
