package HYR_Web_Waits;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class wait_operation extends driver

{

	static By selptc=By.xpath("//a[text()=\"Selenium Practice\"]");
	static By wat=By.xpath("//a[text()=\"Waits Practice\"]");
	static By rmvad=By.xpath("//span[text()=\"Close\"]");
	
	
	
	
	public static WebElement selprtc() 
	{
		WebElement sel=drv.findElement(selptc);
		return sel;
	}
	public static WebElement wait_1() 
	{
		WebElement wait_a=drv.findElement(wat);
		return wait_a;
		
	}
	public static WebElement rmvadd() 
	{
//		WebElement rd=drv.findElement(rmvad);
//		return rd;
		drv.switchTo().frame("ad_iframe");
		WebElement rd=drv.findElement(rmvad);
		return rd;
		
		
	}
	public static void selptc_action() 
	{
		selprtc().click();
	}
	public static void wait_action1() throws InterruptedException 
	{
		wait_1().click();
		Thread.sleep(3000);
	}
	public static void remove_ad_action() 
	{
		
		rmvadd().click();
		//drv.switchTo().defaultContent();
	}
	
	
	
}
