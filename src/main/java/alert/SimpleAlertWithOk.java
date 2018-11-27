package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleAlertWithOk {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("file:///G:/workspace/selenium/Alert.html");
        driver.findElement(By.xpath("//button[text()=\"Click on me\"]")).click();
        Thread.sleep(1500);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }
}
