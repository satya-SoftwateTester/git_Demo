package Selnium_Utility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import page.facebook;

public class Basic_operation 
{
	protected static WebDriver drv;
	public static WebDriverWait wait;

	public static void browser()
	{	
		drv=new ChromeDriver();
		drv.get("https://www.saucedemo.com/");
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	public static void explicity()
	{
		wait=new WebDriverWait(drv,Duration.ofSeconds(10));

	}

	public static void windowhandle() throws InterruptedException 
	{
		facebook.fcebk().click();
		Thread.sleep(2000);
		String ename=drv.getWindowHandle();
		System.out.println("base page element-"+ename);
		Set<String>allwindows=drv.getWindowHandles();
		for(String x:allwindows) 
		{
			if(!ename.equals(x)) 
			{
				drv.switchTo().window(x);
			}
		}
	}
}

