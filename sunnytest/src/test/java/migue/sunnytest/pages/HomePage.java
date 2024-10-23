package migue.sunnytest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	
	//Locator
	private By header = new By.ByXPath("//*[@id=\"content\"]/h1");
	
	//Constructor
	public HomePage (WebDriver driver) {
		this.driver = driver;
	}
	
	//Methods
	public String getHeaderText() {
		return driver.findElement(header).getText();
	}
	

}
