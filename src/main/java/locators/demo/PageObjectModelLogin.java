package locators.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectModelLogin {

    static WebElement getUsernameField(WebDriver driver)
    {
        return driver.findElement(By.id("authUser"));
    }
    static WebElement getPasswordField(WebDriver driver)
    {
        return driver.findElement(By.id("clearPass"));
    }
    static WebElement getSubmitButton(WebDriver driver)
    {
        return driver.findElement(By.xpath("//button[@type='submit']"));
    }
}
