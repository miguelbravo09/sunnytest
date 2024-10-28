package migue.sunnytest.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import migue.sunnytest.drivers.WebDriverFactory;
import migue.sunnytest.pages.ABTestPage;

public class ABPageTest {
	WebDriver driver;
	private ABTestPage aBTestPage;

	@Parameters("browser")
	@BeforeClass
	public void setUp(String browser) {
		driver = WebDriverFactory.getDriver(browser);

		driver.get("https://the-internet.herokuapp.com/abtest");

		aBTestPage = new ABTestPage(driver);
	}

	@Test
	public void testABTestPageTitle() {

		String header = aBTestPage.getHeaderText();

		Assert.assertTrue(header.equals("A/B Test Variation 1") || header.equals("A/B Test Control"),
				"Title does not match");
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
