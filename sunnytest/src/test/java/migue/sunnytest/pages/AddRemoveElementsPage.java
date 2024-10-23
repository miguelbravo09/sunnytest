package migue.sunnytest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddRemoveElementsPage {

	private WebDriver driver;
	
	//Locators
	private By addElementButton = new By.ByXPath("//*[@id=\"content\"]/div/button");
	private By ElementButton = new By.ByXPath("//*[@id=\"elements\"]/button");
		
	//Constructor
	public AddRemoveElementsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Page Methods
	public WebElement clickAddElementButton() {
		driver.findElement(addElementButton).click();
		return driver.findElement(ElementButton);
	}
	
	public void clickElementButton() {
		driver.findElement(ElementButton).click();
	}
	
}
