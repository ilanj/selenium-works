package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;


public class ListEg {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","browserdrivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("file:///G:/workspace/selenium/list.html");
        List<WebElement> li=new ArrayList<>();
        li=driver.findElements(By.cssSelector("ul#automation>li"));

//        li.forEach(w->System.out.println(w.getText()));
        System.out.println("size="+li.size());
        for(WebElement w:li)
        {
            if(w.getText().contains("Sel"))
            System.out.println(w.getText());






        }
//        String s1=driver.findElement( By.cssSelector("ul#automation li:nth-of-type(2)")).getText();
//        String s2=driver.findElement( By.cssSelector("ul#automation li:last-child")).getText();
//        String s3=driver.findElement( By.cssSelector("ul#automation li:first-child")).getText();


        //System.out.println(s1+"  "+s2+"  "+s3);
    }
}
