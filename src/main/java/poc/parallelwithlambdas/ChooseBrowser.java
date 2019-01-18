package poc.parallelwithlambdas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class ChooseBrowser {
    static WebDriver selectBrowser(String choice)
    {
        WebDriver driver;

        choice=choice.toLowerCase();
        if(choice.contains("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","browserdrivers/chromedriver.exe");
            driver=new ChromeDriver();//constructor-invokes browser automatically
        }
        else if(choice.contains("firefox")||choice.contains("mozilla"))
        {
            System.setProperty("webdriver.gecko.driver","browserdrivers/geckodriver.exe");
            driver=new FirefoxDriver();//constructor-invokes browser automatically
        }
        else
        {
            System.out.println("invalid exiting");
            driver=null;
    }
    return driver;

    }
}
