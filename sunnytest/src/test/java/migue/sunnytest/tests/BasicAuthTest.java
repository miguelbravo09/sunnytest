package migue.sunnytest.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import migue.sunnytest.drivers.WebDriverFactory;
import migue.sunnytest.pages.BasicAuthPage;

public class BasicAuthTest {
	WebDriver driver;
	private BasicAuthPage basicAuthPage;

	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser) {

		driver = WebDriverFactory.getDriver(browser);

		basicAuthPage = new BasicAuthPage(driver);
	}

	@Test
	public void testAuthenticationRightCredentials() {
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth/");
		
		Assert.assertTrue(basicAuthPage.isCongratsTextDisplayed(), "Not authenticated");
	}
	
	@Test
	public void testAuthenticationWrongCredentials() {
		driver.get("https://admin:admin1@the-internet.herokuapp.com/basic_auth/");
		
		Assert.assertFalse(basicAuthPage.isCongratsTextDisplayed(), "Not authenticated");
	}

	@AfterTest
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
