package migue.sunnytest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class BasicAuthPage {

	private WebDriver driver;
	
	//Locators
	private By congratsText = new By.ByXPath("/html/body/div[2]/div/div/p");
	
	//Constructor
	public BasicAuthPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Methods
	public boolean isCongratsTextDisplayed() {
		try {
			return driver.findElement(congratsText).isDisplayed();
			
		} catch(NoSuchElementException e) {
			return false;
		}
	}
	
}
