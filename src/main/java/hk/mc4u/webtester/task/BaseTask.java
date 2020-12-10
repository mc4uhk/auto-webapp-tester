package hk.mc4u.webtester.task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Base class for all the JUnit-based test classes
 */
public class BaseTask {

  protected static String baseUrl;
  protected static Capabilities capabilities;

  protected WebDriver driver;

  public void loadConfig() throws Throwable {
    SuiteConfiguration config = new SuiteConfiguration();
    baseUrl = config.getProperty("site.url");
    capabilities = config.getCapabilities();
  };

  public void initDriver() throws Throwable {
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    
  }
}
