package locators;

import excelrw.datadriven.KeywordFW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class TestOpenEmr {
    public static void main(String[] args) throws IOException {

        Map<String,String> up=new HashMap<>();
        up= KeywordFW.readWorkbook();


        up.forEach((u,p)->{
            new Thread(()->run(u,p)).start();


        });

    }

    static void run(String u,String p)
    {
        System.setProperty("webdriver.gecko.driver","browserdrivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://localhost/openemr");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("authUser")).sendKeys(u);
        driver.findElement(By.id("clearPass")).sendKeys(p);
        driver.findElement(By.xpath("//button")).click();
        driver.close();
    }
}
