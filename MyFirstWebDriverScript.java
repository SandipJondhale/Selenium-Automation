package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class MyFirstWebDriverScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactinhotelapp.com");
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("SandipJondhale");
		driver.findElement(By.id("password")).sendKeys("Sandip@123");
		driver.findElement(By.id("login")).click();
		driver.quit();
	}

}
