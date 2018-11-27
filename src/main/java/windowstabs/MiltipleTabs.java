package windowstabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MiltipleTabs {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","browserdrivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://toolsqa.com/automation-practice-switch-windows/");
        driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
        Thread.sleep(2500);
        Set<String> windowHandles=driver.getWindowHandles();
        System.out.println("size="+windowHandles.size());
        windowHandles.forEach(w->{
            System.out.println("current window handle="+w);
            driver.switchTo().window(w);
            System.out.println("current title"+driver.getTitle());
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.close();
        });
    }
}
