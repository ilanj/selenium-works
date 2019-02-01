package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fb {
    WebDriver driver;
    @BeforeTest
    void checkBrowser()
    {
        System.out.println("this is facebook");
        System.setProperty("webdriver.chrome.driver","browserdrivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
    }

    @Test(groups="level2")
    void checkTitle()  {
        String expected="Facebook – log in or sign up";
        Assert.assertEquals(driver.getTitle(),expected);
        //System.out.println("actual title="+driver.getTitle());
    }

    @Test(enabled = false)
    void print()
    {
        int a=36/0;
        System.out.println(" print");
    }

    @Test(groups="level2")
    void print1()
    {
        System.out.println(" print1");
    }

    @AfterTest
    void closeBrowser()
    {
        System.out.println("fb driver is closing");
        driver.close();
    }
}
