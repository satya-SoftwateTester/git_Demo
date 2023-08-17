package w3school_iframepratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver_w3school 
{
	static  WebDriver drv;
	public static void browser() throws InterruptedException
	{	
	drv=new ChromeDriver();
	drv.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
	drv.manage().window().maximize();
	Thread.sleep(2000);
	}

}
