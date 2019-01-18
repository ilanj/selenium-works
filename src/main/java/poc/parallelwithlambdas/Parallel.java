package poc.parallelwithlambdas;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class Parallel {
    public static void main(String[] args) {
        WebDriver driver;
    List<String> browser=new ArrayList<>();
    browser.add("chrome");
    browser.add("firefox");


browser.parallelStream().forEach(b-> {
    try {
        ParallelOperation.runOpenEmr(ChooseBrowser.selectBrowser(b));
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
});

    }


}
