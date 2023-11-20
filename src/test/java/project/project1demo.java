package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class project1demo {
	public static String url="https://demo.guru99.com/test/newtours/login.php";
	WebDriver driver;
	@BeforeTest
	public void b1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","/Users/sagars/eclipse-workspace/JavaDemo1/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(30000);
	}
@Test
public void c1()
{
	driver.findElement(By.name("userName")).sendKeys("user");

}
}      
