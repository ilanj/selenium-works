package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class OpenEMR {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","browserdrivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        //implicit (global) and explicit wait- thread.sleep
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http:/localhost/openemr");
        WebElement username=driver.findElement(By.id("authUser"));
        WebElement password=driver.findElement(By.id("clearPass"));
        WebElement language=driver.findElement(By.name("languageChoice"));
        WebElement loginButton=driver.findElement(By.xpath("//button"));// as this is unique
        username.sendKeys("admin");
        password.sendKeys("pass");

        //using dropdown
        Select selectLang=new Select(language);
        selectLang.selectByVisibleText("English (Indian)");
        loginButton.click();

        //driver.findElement(By.xpath("//div[text()='Patient/Client']"));//practice
//        driver.findElement(By.xpath("//div[contains(text(),'Patient/Client')]"));//practice
        WebDriverWait expWait=new WebDriverWait(driver,30);
        expWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Patient/Client']")));
        WebElement patientTab=driver.findElement(By.xpath("//div[text()='Patient/Client']"));

        Actions act=new Actions(driver);

        act.moveToElement(patientTab).moveToElement(driver.findElement(By.xpath("//div[text()='Patients']"))).click().build().perform();
        //driver.findElement(By.xpath("//div[text()='Patients']")).click();

        //driver.switchTo().frame("fin");
        WebElement temp=driver.findElement(By.xpath("//*[@id='framesDisplay']/div[3]/iframe"));
        driver.switchTo().frame(temp);
       Thread.sleep(1000);
        List<WebElement> frames=driver.findElements(By.xpath("//*[@id=\"pt_table\"]/tbody/tr"));
        int length=frames.size();
        //length=3;
        System.out.println(length);
        for(int i=0;i<length;i++)
        {
            List<WebElement> rows=driver.findElements(By.xpath("//*[@id='pt_table']//tbody/tr["+i+"]/td"));
            for(WebElement w:rows)
                System.out.println(w.getText());
            System.out.println("-----------------------------------------------");
        }
////*[@id="pt_table"]//tbody/tr/td[1]-this searches only names in all rows
        String name="Benji";
       // driver.findElement(By.xpath("//*[@id='pt_table']//tbody//tr//td[1][contains(text(),"+name+")]")).click();
        driver.findElement(By.xpath("//*[@id='pt_table']//tbody//tr//td[1][starts-with(text(),"+name+")]")).click();
        driver.navigate().back();

        //xpath axes method
        //1.following
        int noOfRows=driver.findElements(By.xpath("//th//following::tr")).size();
        System.out.println("no of rows= "+noOfRows);
        //2.ancestor-	The ancestor axis selects all ancestors element (grandparent, parent, etc.)
        //a[contains(text(),'Learn SAP BI')]//ancestor::ul
        //3.child
        //*[@id="java_technologies"]//child::li
        //4.Preceding: Select all nodes that come before the current node
        //*[@id="java_technologies"]//preceding::li
        //5.Following-sibling:	Select the following siblings of the context node
        //*[@id="pt_table"]/thead/tr[2]/th[2]//following-sibling::th
        //6.Parent: Selects the parent of the current node as shown in the below screen.
        //*[@id="pt_table"]/thead/tr[2]/th[2]//parent::tr
        //*[@id="pt_table"]/thead/tr[2]/th[2]//parent::th//selects the previous header always
         //7.self
        //8.descendant
        ////*[@id="pt_table"]//descendant::th
driver.switchTo().defaultContent();





        Thread.sleep(1500);
        driver.switchTo().defaultContent();
       // driver.close();
    }
}
