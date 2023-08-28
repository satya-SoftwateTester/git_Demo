package Swag_Lab_frmk;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class driver_swag 

{

	static  WebDriver drv;
	static WebDriverWait wait;
	public static void browser()
	{	
		
		
	drv=new ChromeDriver();
	drv.get("https://www.saucedemo.com/");
	drv.manage().window().maximize();
	//drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	//Thread.sleep(2000);
}
	public static void explicity(By by_login,int time)
	{
		wait=new WebDriverWait(drv,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by_login));
	}
	public static void explicity()
	{
		wait=new WebDriverWait(drv,Duration.ofSeconds(10));
		
	}
}
