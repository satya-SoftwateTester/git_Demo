package Selnium_Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	
}

