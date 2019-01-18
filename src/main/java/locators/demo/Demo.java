package locators.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","browserdrivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://localhost/openemr");

       PageObjectModelLogin.getUsernameField(driver).sendKeys(Credentials.userName);
       PageObjectModelLogin.getPasswordField(driver).sendKeys(Credentials.password);
       PageObjectModelLogin.getSubmitButton(driver).click();

    }
}
