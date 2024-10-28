package migue.sunnytest.tests;

import org.openqa.selenium.WebDriver;
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
            
        addRemoveElementsPage.clickAddElementButton();
        
        //Assert Element button is displayed
        Assert.assertTrue(addRemoveElementsPage.isElementButtonDisplayed(), "Element button is not displayed");
    }
    
    @Test
    public void testClickElementButton() {
            
        addRemoveElementsPage.clickElementButton();
        
        //Assert Element button is displayed
        Assert.assertFalse(addRemoveElementsPage.isElementButtonDisplayed(), "Element button is still displayed");
    }
    

    @AfterClass
    public void tearDown() {
        if (driver!=null) {
        	driver.quit();
        }
    }

}
