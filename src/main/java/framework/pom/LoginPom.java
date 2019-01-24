package framework.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPom {
    public static WebElement getUsernameField(WebDriver driver)
    {
        return driver.findElement(By.id("authUser"));
    }
    public static WebElement getPasswordField(WebDriver driver)
    {
        return driver.findElement(By.id("clearPass"));
    }
    public static WebElement getSubmitButton(WebDriver driver)
    {
        return driver.findElement(By.xpath("//button[@type='submit']"));
    }
    public static WebElement getSelectDropdown(WebDriver driver)
    {
        return driver.findElement(By.name("languageChoice"));
    }
}
