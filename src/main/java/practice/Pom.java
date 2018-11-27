package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pom {
    static WebElement linkText(WebDriver driver)
    {
        return driver.findElement(By.linkText("Link Test"));
    }
    static WebElement partialLinkText(WebDriver driver)
    {
        return driver.findElement(By.partialLinkText("Partial Link Test"));
    }

    static WebElement firstName(WebDriver driver)
    {
        return driver.findElement(By.name("firstname"));
    }
    static WebElement lastName(WebDriver driver)
    {
        return driver.findElement(By.name("lastname"));
    }
    static WebElement sexRadioButton(WebDriver driver)
    {
        return driver.findElement(By.id("sex-0"));
    }
    static WebElement experienceRadioButton(WebDriver driver)
    {
        return driver.findElement(By.id("exp-3"));
    }
    static WebElement datePicker(WebDriver driver)
    {
        return driver.findElement(By.id("datepicker"));
    }
    static WebElement professionCheckbox(WebDriver driver)
    {
        return driver.findElement(By.id("profession-1"));
    }
    static WebElement uploadButton(WebDriver driver)
    {
        return driver.findElement(By.id("photo"));
    }
    static WebElement downloadSeleniumAutomationLink(WebDriver driver)
    {
        return driver.findElement(By.partialLinkText("Selenium Automation Hy"));
    }
    static WebElement automationToolCheckbox(WebDriver driver)
    {
        return driver.findElement(By.id("tool-2"));
    }
    static WebElement dropboxContinents(WebDriver driver)
    {
        return driver.findElement(By.id("continents"));
    }
    static WebElement downloadTestFile(WebDriver driver)
    {
        return driver.findElement(By.partialLinkText("Test File to"));
    }
    static WebElement seleniumCommandsSelectbox(WebDriver driver)
    {
        return driver.findElement(By.id("selenium_commands"));
    }
    static WebElement submitButton(WebDriver driver)
    {
        return driver.findElement(By.id("submit"));
    }

}
