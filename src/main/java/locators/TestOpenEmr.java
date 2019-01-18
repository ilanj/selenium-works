package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestOpenEmr {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","browserdrivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://localhost/openemr");


        driver.findElement(By.cssSelector("id^=auth")).sendKeys("admin");
        driver.findElement(By.id("clearPass")).sendKeys("pass");
        driver.findElement(By.cssSelector("button.btn btn-block btn-large")).click();


    }
}
