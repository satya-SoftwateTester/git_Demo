package w3school_windowhandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class windowhandles_javaPratices extends driver_windowhandles
{
	static By jvptc=By.xpath("//a[@class=\"ga-bottom\" and text()=\"Java Certificate\"]");

	static By adct=By.xpath("//button[@class=\"accordion\" and text()=\"Step 1: Add to cart\"]");

	public static WebElement javaptc() 
	{
		String ename=drv.getWindowHandle();
		System.out.println("base page element-"+ename);
		WebElement ele=drv.findElement(jvptc);
		return ele;
	}
	public static WebElement  alwindow() 
	{
		Set<String>allwindows=drv.getWindowHandles();

		Object[] windows=allwindows.toArray();
		String window1=	windows[0].toString();
		String window2=windows[1].toString();
		drv.switchTo().window(window2);

		return          drv.findElement(adct);
	}
	public static void action_ele() throws InterruptedException 
	{
		javaptc().click();
		Thread.sleep(2000);
	}
	public static void action_window2() 
	{
		alwindow().click();
	}



}
