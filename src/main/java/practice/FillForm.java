package practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import static practice.Pom.*;

public class FillForm {
    static void fillForm(WebDriver driver) throws AWTException, InterruptedException {
        driver.get("http://toolsqa.com/automation-practice-form/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        boolean checkboxstatus;
        firstName(driver).sendKeys("ila");
        lastName(driver).sendKeys("jayamurthy");
        sexRadioButton(driver).click();
        experienceRadioButton(driver).click();
        datePicker(driver).sendKeys("1990-03-08");
        professionCheckbox(driver).clear();
        professionCheckbox(driver).click();
        checkboxstatus=professionCheckbox(driver).isSelected();
        uploadButton(driver).sendKeys("G:\\workspace\\selenium\\screenshots\\aaa.png");
        Robot r=new Robot();
        downloadSeleniumAutomationLink(driver).click();
        Thread.sleep(4500);
//        r.keyPress(KeyEvent.VK_DOWN);
//        Thread.sleep(500);
//
//        r.keyPress(KeyEvent.VK_TAB);
//        Thread.sleep(500);
//
//        r.keyPress(KeyEvent.VK_TAB);
//        Thread.sleep(500);
//
//        r.keyPress(KeyEvent.VK_TAB);
//        Thread.sleep(500);

        r.keyPress(KeyEvent.VK_ENTER);
        downloadTestFile(driver).click();
        Thread.sleep(4500);
//        r.keyPress(KeyEvent.VK_DOWN);
//        Thread.sleep(500);
//
//        r.keyPress(KeyEvent.VK_TAB);
//        Thread.sleep(500);
//
//        r.keyPress(KeyEvent.VK_TAB);
//        Thread.sleep(500);
//
//        //r.keyPress(KeyEvent.VK_TAB);
//        Thread.sleep(500);

        r.keyPress(KeyEvent.VK_ENTER);

        automationToolCheckbox(driver).click();
        Select s=new Select(dropboxContinents(driver));
        s.selectByIndex(2);
        Select s1=new Select(seleniumCommandsSelectbox(driver));
        s1.selectByIndex(2);
        submitButton(driver).click();
        driver.quit();

    }
}
