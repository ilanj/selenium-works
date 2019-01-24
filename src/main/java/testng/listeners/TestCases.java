package testng.listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
@Listeners(testng.listeners.ListenerTest.class)

public class TestCases {
    @Test
    public void login()
    {
        System.setProperty("webdriver.gecko.driver","browserdrivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        //implicit (global) and explicit wait- thread.sleep
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriverWait expWait=new WebDriverWait(driver,15);

        driver.get("http:/localhost/openemr");
        WebElement username=driver.findElement(By.id("authUser"));
        WebElement password=driver.findElement(By.id("clearPass"));
        WebElement language=driver.findElement(By.name("languageChoice"));
        WebElement loginButton=driver.findElement(By.xpath("//button"));// as this is unique


        username.sendKeys("admin");
        password.sendKeys("pass");

        //using dropdown
        Select selectLang=new Select(language);
        selectLang.selectByVisibleText("English (Indian)");
        loginButton.click();

    }
    @Test
    public void TestToFail()
    {
        System.out.println("This method to test fail");
        Assert.assertEquals("efheihf","d");
    }
}
