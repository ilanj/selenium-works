package others;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;

public class Screenshot {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.gecko.driver","browserdrivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com");
        String time= LocalTime.now().toString();
        takeSnapShot(driver,"screenshots/"+time+".png");
        driver.close();
    }

    public static void takeSnapShot(WebDriver driver, String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot = (TakesScreenshot) driver;

        //Call getScreenshotAs method to create image file

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

        File DestFile=new File(fileWithPath);

        //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);//u need to add dependency

    }
}
