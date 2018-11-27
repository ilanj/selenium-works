package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertWithOkCancel {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","browserdrivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("file:///G:/workspace/selenium/ConfirmationAlert.html");
        driver.findElement(By.xpath("//button")).click();
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(1000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(1000);
    }
}
