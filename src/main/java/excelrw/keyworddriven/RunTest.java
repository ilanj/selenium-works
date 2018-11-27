package excelrw.keyworddriven;

import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class RunTest {
    public  static WebDriver driver;
    public static void main(String[] args) throws IOException, InterruptedException {
        RWData.readData();

    }
}
