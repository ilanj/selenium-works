package windowstabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class MultipleWindows {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","browserdrivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://toolsqa.com/automation-practice-switch-windows/");
        //String mainWindow=driver.getWindowHandle();
        for(int i=0;i<4;i++)
        driver.findElement(By.id("button1")).click();
        Set<String> windowHandles=driver.getWindowHandles();
        windowHandles.forEach(w->{
            driver.switchTo().window(w);
            System.out.println(driver.getTitle());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.close();
        });

//        for(String s:windowHandles)
//        {
//            driver.switchTo().window(s);
//            System.out.println(driver.getTitle());
//            Thread.sleep(2500);
//            driver.close();
//        }
      //driver.switchTo().window(mainWindow);
    }
}
