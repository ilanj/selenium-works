package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","browserdrivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        //implicit (global) and explicit wait- thread.sleep
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com/");
       // driver.findElement(By.xpath("//header/div/div/div/div/div/a")).click();

        driver.findElement(By.className("_2AkmmA _1LctnI jUwFiZ")).click();

        driver.findElement(By.className("_2zrpKA")).sendKeys(" 9898987456");

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hkbbh");

        driver.findElement(By.className("_2zrpKA")).submit();
    }
}