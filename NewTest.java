package sowgit;
import org.testng.annotations.Test;
import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class NewTest 
{
public String baseUrl = "https://www.google.com/";
String driverPath = "C:\\Users\\Shilpa\\workspace\\chromedriver_win32\\chromedriver.exe";
public WebDriver driver ;
@BeforeTest public void launch()
{
System.out.println("launching chrome browser");
System.setProperty("webdriver.chrome.driver", driverPath);
driver = new ChromeDriver();
driver.get(baseUrl);
}
@Test public void func() {
String searchkey = "software testing";
WebElement searchText = driver.findElement(By.name("q"));
searchText.sendKeys(searchkey);
searchText.submit();
String expectedTitle = "software testing - Google Search";
String actualTitle = driver.getTitle();
Assert.assertEquals(actualTitle, expectedTitle);
}
@AfterTest
public void afterTest()
{
	driver.quit();
	System.out.println("Closed Chrome");

  }

}


