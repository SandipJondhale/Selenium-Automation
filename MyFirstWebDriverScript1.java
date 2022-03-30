package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebDriverScript1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactinhotelapp.com");
		WebElement uname = driver.findElement(By.cssSelector("#username"));
		uname.sendKeys("SandipJondhale");
		driver.findElement(By.cssSelector("#password")).sendKeys("Sandip@123");
		driver.findElement(By.cssSelector("#login")).click();
		driver.quit();


	}

}
