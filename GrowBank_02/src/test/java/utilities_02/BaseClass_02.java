package utilities_02;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseClass_02
{
	static String browserName;
	public static WebDriver driver;

	public static WebDriver initializeDriver() 
	{

		try {
			browserName=FetchDataFromProperty_02.readDataFromProperty().getProperty("browser");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(browserName.equalsIgnoreCase("chrome"))
		{

			driver=new ChromeDriver();
			try {
				driver.get(FetchDataFromExcel_02.getURL());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			driver.manage().window().maximize();
		}

		if(browserName.equalsIgnoreCase("firefox"))
		{

			driver=new FirefoxDriver();
			try {
				driver.get(FetchDataFromExcel_02.getURL());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			driver.manage().window().maximize();
		}

		if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			try {
				driver.get(FetchDataFromExcel_02.getURL());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			driver.manage().window().maximize();
		}

		return driver;

	}

	public static void addImplicitWait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public static void scrollDown()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
	}

	public static String getPageTitle()
	{
		String title=driver.getTitle();
		return title;
	}

	public void addHardcodedWait() throws InterruptedException
	{
		Thread.sleep(3000);
	}

	public static void addExplicitWait(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static void getWindowHandle()
	{
		Set<String> alltabs=driver.getWindowHandles();
		Iterator<String> pcid=alltabs.iterator();
		@SuppressWarnings("unused")
		String parentTab=pcid.next();
		String childTab=pcid.next();
		driver.switchTo().window(childTab);
	}

}
