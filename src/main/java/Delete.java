import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Delete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "browserdrivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.flaconi.de");
        driver.findElement(By.xpath("//*[@id=\"main-navigation\"]/ul/li[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"80023520-C\"]/div[2]/a/img")).click();
        driver.findElement(By.xpath("//button[@title='In den Warenkorb']")).click();
        driver.findElement(By.xpath("//div[@class='close']")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("//*[@id=\"mini-basket\"]/a/span[1]")).click();
        System.out.println("there are " + driver.findElement(By.xpath("//*[@id=\"mini-basket\"]/a/span[1]/span")).getText() + " item(s) present in the cart");
        try {
            driver.findElement(By.xpath("//div[@class='cart-details']"));
            System.out.println("Items are present in cart");
        } catch (Exception e) {
            System.out.println("No items are present in cart");
        }
    }
}
