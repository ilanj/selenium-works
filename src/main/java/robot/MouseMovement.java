package robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;

public class MouseMovement {
    public static void main(String[] args) throws AWTException, InterruptedException {
//        WebDriver driver=new FirefoxDriver();
//        driver.get("https://www.google.com/");
        Robot r=new Robot();
        int x=500;
        int y=500;
        for(int i=0;i<100;i++)
        {
            r.mouseMove(x++,y++);
            Thread.sleep(50);
        }

    }
}
