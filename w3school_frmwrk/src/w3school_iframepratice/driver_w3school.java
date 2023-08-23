package w3school_iframepratice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

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
	//implicit wait
	//drv.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//Thread.sleep(2000);
	}

}
