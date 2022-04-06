package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyFirstHotelAppAutomationProject {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactinhotelapp.com");
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("SandipJondhale");
		driver.findElement(By.id("password")).sendKeys("Sandip@123");
		driver.findElement(By.id("login")).click();
		new Select(driver.findElement(By.id("location"))).selectByVisibleText("London");
		new Select(driver.findElement(By.id("hotels"))).selectByIndex(3);
		new Select(driver.findElement(By.id("room_type"))).selectByIndex(3);
		new Select(driver.findElement(By.id("room_nos"))).selectByIndex(3);
		WebElement idate = driver.findElement(By.id("datepick_in"));
		idate.click();
		idate.clear();
		idate.sendKeys("05/11/2022");
		
		WebElement odate = driver.findElement(By.id("datepick_out"));
		odate.click();
		odate.clear();
		odate.sendKeys("07/11/2022");
		
		
		new Select(driver.findElement(By.id("adult_room"))).selectByIndex(3);
		new Select(driver.findElement(By.id("child_room"))).selectByIndex(2);
		
		driver.findElement(By.id("Submit")).click();
		
		//driver.findElement(By.id("Reset")).click();
		
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		//driver.findElement(By.id("cancel")).click();
		
		WebElement name = driver.findElement(By.id("first_name"));
		name.sendKeys("Sandy");
		
		WebElement lname = driver.findElement(By.id("last_name"));
		lname.sendKeys("Jondhale");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Nanded");
		
		WebElement cc = driver.findElement(By.id("cc_num"));
		cc.sendKeys("1234123412341234");
		
		new Select(driver.findElement(By.id("cc_type"))).selectByIndex(3);
		new Select(driver.findElement(By.id("cc_exp_month"))).selectByVisibleText("November");
		new Select(driver.findElement(By.id("cc_exp_year"))).selectByVisibleText("2020");
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("997");
		driver.findElement(By.id("book_now")).click();
		//driver.findElement(By.id("cancel")).click();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.findElement(By.id("my_itinerary")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.findElement(By.id("search_hotel")).click();
		driver.findElement(By.id("logout")).click();
		//driver.quit();
	}


}



 


