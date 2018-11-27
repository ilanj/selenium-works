package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LaunchBr {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","browserdrivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.google.com/");
        // relative xpath "//tagname[@attributename='value']"

        //driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[2]/div/div/div[2]/div/div/div/div/input")).sendKeys("ninite");
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("seleniumhq");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Google Search']")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.close();
    }
}
