package utilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class BaseClass
{

	public static WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	public void openBrowser() throws IOException
	{
		String browserName=FetchDataFromProperty.readDataFromPropery().getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.get(FetchDataFromProperty.readDataFromPropery().getProperty("URL"));
			driver.manage().window().maximize();
			addImpicitWait();
		}
		if(browserName.equalsIgnoreCase("edge"))
		{
                            EdgeOptions options = new EdgeOptions();
                            options.addArguments("--headless=new");
                            options.addArguments("--disable-gpu");
                            options.addArguments("--remote-debugging-port=9222");
                            // Avoid using --no-sandbox on Windows unless absolutely necessary
			
			driver=new EdgeDriver(options);
			driver.get(FetchDataFromProperty.readDataFromPropery().getProperty("URL"));
			driver.manage().window().maximize();
			addImpicitWait();
		}
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get(FetchDataFromProperty.readDataFromPropery().getProperty("URL"));
			driver.manage().window().maximize();
			addImpicitWait();
		}
	}
	
	public static void addExplicitWait(By locator) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static void addImpicitWait() {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void scrollDown()
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", " ");
	}
	
	@AfterTest(alwaysRun = true)
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
		
	}

}
