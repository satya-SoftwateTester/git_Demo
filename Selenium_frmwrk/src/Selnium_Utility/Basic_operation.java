package Selnium_Utility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import page.create_account;
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
				create_account.action_create();
				Thread.sleep(3000);
			//	String subchild=drv.getWindowHandle();
				Set<String>allwindo=drv.getWindowHandles();
				Object[] windows=allwindo.toArray();
				String window1=	windows[0].toString();
				System.out.println(window1);
				
				String window2=windows[1].toString();
				System.out.println(window2);

				String window3=windows[2].toString();
				System.out.println(window3);

				drv.switchTo().window(window3);
				
//				for(String y:allwindo) 
//				{
//					if(!(subchild.equals(y))) 
//					{
//						drv.switchTo().window(y);
//					}
//				}
				
				
			}
		
		
	}


