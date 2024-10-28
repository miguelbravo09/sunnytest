package migue.sunnytest.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {
	public static WebDriver getDriver(String browser) {
        WebDriver driver;
        
        boolean headless = true;

        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();  // WebDriverManager setup
                ChromeOptions chromeOptions = new ChromeOptions();
                if(headless) {
                	chromeOptions.addArguments("--headless");
                    chromeOptions.addArguments("--disable-gpu");
                    chromeOptions.addArguments("--window-size=1920,1080");
                }
                driver = new ChromeDriver(chromeOptions);
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup(); // WebDriverManager setup
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                if(headless) {
                	firefoxOptions.addArguments("-headless");
                }
                driver = new FirefoxDriver(firefoxOptions);
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();    // WebDriverManager setup
                EdgeOptions edgeOptions = new EdgeOptions();
                if(headless) {
                	edgeOptions.addArguments("headless");
                	edgeOptions.addArguments("disable-gpu");
                    edgeOptions.addArguments("window-size=1920,1080");
                	
                }
                driver = new EdgeDriver(edgeOptions);
                break;

            default:
                throw new IllegalArgumentException("Browser not supported: " + browser);
        }

        return driver;
    }
}
