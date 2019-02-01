package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertEx {
        WebDriver driver;
        @BeforeTest
        void checkBrowser()
        {
            System.out.println("this is google");
            System.setProperty("webdriver.gecko.driver","browserdrivers/geckodriver.exe");
            driver=new FirefoxDriver();
            driver.get("https://www.google.com");
        }

        @Test(groups="level1")
        void checkTitle()
        {
         String expected="Google";
         Assert.assertEquals(driver.getTitle(),expected);
            System.out.println("actual title="+driver.getTitle());
        }

        @Test(groups="level1")
        void enterSearchText()
        {
            driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("seleniumhq");
            driver.findElement(By.xpath("//input[@value='Google Search']")).click();
        }

        @Test(groups="level1")
        void navigateBack()
        {
            driver.navigate().back();

        }

        @AfterTest
        void closeBrowser() throws InterruptedException {
            System.out.println("waiting for 4 secs");
            Thread.sleep(4000);
            System.out.println("google driver is closing   ");
            driver.close();
        }
    }
