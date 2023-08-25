package HYR_Web_Waits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver 
{
	static  WebDriver drv;
	public static void browser()
	{	
		
		
	drv=new ChromeDriver();
	drv.get("https://www.hyrtutorials.com/");
	drv.manage().window().maximize();
	drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	//Thread.sleep(2000);
	}
}
