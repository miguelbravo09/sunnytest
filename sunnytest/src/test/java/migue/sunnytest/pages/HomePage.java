package migue.sunnytest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	
	private By header = new By.ByXPath("//*[@id=\"content\"]/h1");
	
	public HomePage (WebDriver driver) {
		this.driver = driver;
	}
	
	public String getHeaderText() {
		return driver.findElement(header).getText();
	}

}
