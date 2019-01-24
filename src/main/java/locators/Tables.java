package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Tables {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","browserdrivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///G:\\workspace\\selenium\\table.html");
        List<WebElement> rows=driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println("NO OF ROWS= "+rows.size());
        for(int i=2;i<=rows.size();i++)
        {
            System.out.println("this is row no "+i);
            List<WebElement> eachColumn=driver.findElements(By.xpath("//table/tbody/tr["+i+"]/td"));
            eachColumn.forEach(item-> System.out.println(item.getText()));
        }

//        for(WebElement w:rows)
//            System.out.println(w.getText());
//
//        rows.forEach(a-> {
//            System.out.println(a.getText());
//        });
//        driver.quit();
    }
}
