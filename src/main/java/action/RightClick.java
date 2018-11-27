package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        //To maximize the browser
        driver.manage().window().maximize();
        //Create an object 'action' of an Actions class
        Actions action = new Actions(driver);
        //Wait for the element. Used Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".context-menu-one")));
        WebElement locator = driver.findElement(By.cssSelector(".context-menu-one"));

        WebElement rightClickElement=locator;
        //contextClick() method to do right click on the element
        action.contextClick(rightClickElement).build().perform();
        Thread.sleep(1500);
        WebElement getCopyText =driver.findElement(By.cssSelector(".context-menu-icon-copy"));
        //getText() method to get the text value
        String GetText = getCopyText.getText();
        //To print the value
        System.out.println(GetText);
        //To close the browser
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();


    }
}
