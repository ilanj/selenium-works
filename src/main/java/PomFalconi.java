import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PomFalconi {
	
	public static WebElement parfumTab(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/header/nav/ul/li[2]"));
	}
	public static WebElement dufleLabel(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/header/nav/ul/li[2]/ul/li[1]/ul/li[1]/a"));
	}
	public static WebElement maisonPerfume(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id=\"80033321-C\"]/div[2]/a/img"));
	}
	public static WebElement addToCartButton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id=\"productAddToCartForm-80033321-50\"]/button"));
	}
//	public static WebElement dufleLabel(WebDriver driver)
//	{
//		return driver.findElement(By.xpath("//*[@id=\"main-navigation\"]/ul/li[2]/ul/li[1]/ul/li[1]/a"));
//	}
}
