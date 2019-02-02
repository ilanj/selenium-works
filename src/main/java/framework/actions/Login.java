package framework.actions;

import framework.pom.LoginPom;
import framework.utils.LoginCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Login {
    public static void login()
    {
        System.setProperty("webdriver.gecko.driver","browserdrivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        //implicit (global) and explicit wait- thread.sleep
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http:/localhost/openemr");

        LoginPom.getUsernameField(driver).sendKeys(LoginCredentials.userName);
        LoginPom.getPasswordField(driver).sendKeys(LoginCredentials.password);

        //using dropdown
        Select selectLang=new Select(LoginPom.getSelectDropdown(driver));
        selectLang.selectByVisibleText("English (Indian)");
        LoginPom.getSubmitButton(driver).click();
    }
    public  static void test1()
    {
        System.out.println("i am test 1");
    }

    public  static void test2()
    {
        System.out.println("i am test 2");
    }

    public  static void test3()
    {
        System.out.println("i am test 3");
    }
}
