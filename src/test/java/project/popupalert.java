package project;

import java.util.concurrent.TimeUnit;

import javax.xml.ws.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popupalert {
	public static String url = "https://demoqa.com/alerts";
	WebDriver driver;
	@BeforeTest
	public void openurl()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Test (enabled = false)
	public void alert1() throws InterruptedException
	{
		//System.out.println("alert");
		driver.findElement(By.id("alertbutton")).click();
		System.out.println("click me button was clicked");
		Alert popAlert=driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		popAlert.accept();
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}
	
	@Test (enabled = true)
	public void alert2()
	{
		driver.findElement(By.id("time alert button")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Alert popAlert2=driver.switchTo().alert();
		popAlert2.accept();	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void winclose()
	{
		driver.close();
	}
}
