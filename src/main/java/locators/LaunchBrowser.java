package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class LaunchBrowser {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        WebDriver driver;
        String choice;
        System.out.println("which browser you want to launch mozilla or chrome");
        choice=in.next();

            choice=choice.toLowerCase();
            if(choice.contains("chrome"))
            {
                System.setProperty("webdriver.chrome.driver","browserdrivers/chromedriver.exe");
                driver=new ChromeDriver();//constructor-invokes browser automatically
            }
             else if(choice.contains("firefox")||choice.contains("mozilla"))
                driver=new FirefoxDriver();//constructor-invokes browser automatically
            else
                System.out.println("invalid exiting");

    }
}
