package w3school_windowhandles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver_windowhandles 
{
	static  WebDriver drv;
	public static void browser() throws InterruptedException
	{	
	drv=new ChromeDriver();
	drv.get("https://www.w3schools.com/");
	drv.manage().window().maximize();
	Thread.sleep(2000);
	}
}
