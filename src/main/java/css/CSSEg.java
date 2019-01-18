package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSEg {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","browserdrivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        ((FirefoxDriver) driver).findElementByCssSelector("input[name=email]").sendKeys("efifefef");
        driver.findElement(By.cssSelector("label#loginbutton>input")).click();
        driver.findElement(By.cssSelector("label#loginbutton input")).click();
        driver.findElement(By.cssSelector("input[id*='emai']")).sendKeys("helloworld");


    }
}
