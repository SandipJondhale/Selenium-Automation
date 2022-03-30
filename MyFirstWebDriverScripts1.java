package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebDriverScripts1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.adactinhotelapp.com");
		driver.manage().window().maximize();
		driver.navigate().to("http:\\www.google.com");
		driver.navigate().back();
		driver.navigate().forward();

	}

}
