package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LocatorsEx {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
       // driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
//        driver.findElement(By.id("lst-ib")).sendKeys("seleniumhq");//search box
//        driver.findElement(By.name("btnK")).click();//google search
//        driver.findElement(By.className("gb_P")).click();//signin
//        driver.findElement(By.id("fsettl")).click();//settings
        //driver.findElement(By.tagName("a")).click();
       // driver.findElement(By.tagName("a")).click();
        //driver.findElement(By.linkText("Gmail")).click();
        //driver.findElement(By.partialLinkText("mail")).click();
//        driver.findElement(By.xpath("//input[@maxlength='2048']")).sendKeys("ninite");// relative xpath "//tagname[@attributename='value']"
//        driver.findElement(By.xpath("//input[@aria-label='Google Search']")).click();// relative xpath "//tagname[@attributename='value']"
        //contains-dynamically
        driver.findElement(By.xpath("//*[contains(@maxlength,'204')]")).sendKeys("ninite");// relative xpath
        driver.findElement(By.xpath("//*[contains(@name,'btnK')]")).click();// relative xpath


        driver.navigate().back();
        driver.navigate().refresh();
        //text()
        driver.findElement(By.xpath("//*[contains(text(),'Images')]")).click();
        driver.findElement(By.xpath("//*[@type=\"submit\" and @value=\"Search\"]")).click();
        driver.navigate().back();
        //driver.navigate().to("localhost:2018//test//hello");

        //Start-with function: Start-with function finds the element whose attribute value changes on refresh or any operation on the webpage.
        // For example -: Suppose the ID of particular element changes dynamically like:
        //
        //Id=" message12"
        //
        //Id=" message345"
        //
        //Id=" message8769"
        driver.findElement(By.xpath("//input[starts-with(@id,'lst-')]")).sendKeys("openEMR");
        driver.findElement(By.xpath("//input[starts-with(@value,'Google')]")).click();



    }
}
