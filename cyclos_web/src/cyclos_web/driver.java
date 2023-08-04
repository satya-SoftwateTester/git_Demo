package cyclos_web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver 
{
	static  WebDriver drv;
	public static void cyclos() throws InterruptedException
	{	
		drv=new ChromeDriver();
		drv.get("https://demo.cyclos.org/ui/home");

		drv.manage().window().maximize();
		Thread.sleep(2000);

	}
}
