package excelrw.keyworddriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ActionsMethod {
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver","browserdrivers/chromedriver.exe");
        RunTest.driver=new ChromeDriver();
        RunTest.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        RunTest.driver.navigate().to("https://www.google.com/");
    }
    public static void search() throws InterruptedException {
        RunTest.driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("seleniumhq");
        Thread.sleep(2000);
        RunTest.driver.findElement(By.xpath("//input[@value='Google Search']")).click();
        Thread.sleep(2000);
    }
    public static void closeBrowser()
    {
        RunTest.driver.close();
    }

}
