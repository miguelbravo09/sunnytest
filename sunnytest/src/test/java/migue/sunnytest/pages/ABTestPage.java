package migue.sunnytest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ABTestPage {
	
	private WebDriver driver;
	
	private By header = new By.ByXPath("//*[@id=\"content\"]/div/h3");
	
	public ABTestPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public String getHeaderText() {
		return driver.findElement(header).getText();
	}

}
