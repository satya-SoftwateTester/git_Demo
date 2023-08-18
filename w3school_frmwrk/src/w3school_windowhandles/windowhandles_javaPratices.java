package w3school_windowhandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class windowhandles_javaPratices extends driver_windowhandles
{
	static By jvptc=By.xpath("//a[@class=\"ga-bottom\" and text()=\"Java Certificate\"]");

	public static WebElement javaptc() 
	{
		String ename=drv.getWindowHandle();
		System.out.println("base page element-"+ename);
		WebElement ele=drv.findElement(jvptc);
		return ele;
	}
	public static void action_ele() throws InterruptedException 
	{
		javaptc().click();
		Thread.sleep(2000);
	}
	
}
