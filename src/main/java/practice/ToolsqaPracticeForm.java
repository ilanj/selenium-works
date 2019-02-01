package practice;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.awt.*;

public class ToolsqaPracticeForm {
    public static void main(String[] args) throws AWTException, InterruptedException {
        System.setProperty("webdriver.gecko.driver","browserdrivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver( );
        run(driver);

    }
    static void run(WebDriver driver) throws InterruptedException, AWTException {
        FillForm.fillForm(driver);

    }

}
