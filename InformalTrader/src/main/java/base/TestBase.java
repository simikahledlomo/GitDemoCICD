package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

//import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;

public class TestBase {
	private ConfigReader config;
    public static WebDriver driver;
    public static JavascriptExecutor js;
    
    
    
    @BeforeSuite
    public WebDriver setup() {
    	
    	this.config = new ConfigReader(); // Initialize before use
    	String browser = config.getBrowser();
        
        // Proceed with driver initialization
        if(browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
        
        driver.get(config.getBaseUrl());
        driver.manage().window().maximize();
        return driver;
    }
    
    @BeforeMethod
    public JavascriptExecutor setJS() {
    	js = (JavascriptExecutor) this.driver;
    	return js;
    } 

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
