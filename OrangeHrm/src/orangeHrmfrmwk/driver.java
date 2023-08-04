package orangeHrmfrmwk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class driver 
{
	static  WebDriver drv;
	public static void orange() throws InterruptedException
	{	
	drv=new ChromeDriver();
	drv.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	drv.manage().window().maximize();
	Thread.sleep(2000);
	}
}
