package testng.CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowser {
    WebDriver driver;
    @BeforeTest
    @Parameters("browser")
    public void initializeBrowser(String browser) throws Exception{
        if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "./browserdrivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
    }

    @Test
    public void startTest() throws InterruptedException {
        driver.get("https://www.flipkart.com/");
        Thread.sleep(5000);
        driver.close();
    }
}
