package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public static WebDriver driver;
	
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactinhotelapp.com");
		WebElement uname = driver.findElement(By.cssSelector("#username"));
		uname.sendKeys("SandipJondhale");
		driver.findElement(By.cssSelector("#password")).sendKeys("Sandip@123");
		driver.findElement(By.cssSelector("#login")).click();
	  }

  @AfterTest
  public void afterTest() {
  }

}
