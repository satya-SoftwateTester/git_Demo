package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logout_page extends Login_page
{
	static By btn=By.xpath("//button[@id=\"react-burger-menu-btn\"]");
	static By lgt=By.xpath("//a[@id=\"logout_sidebar_link\"]");
	
	
	
	
	public static WebElement bton() 
	{
		WebElement bn=drv.findElement(btn);
		return bn;
		
	}
	
	public static WebElement lgot() throws InterruptedException 
	{
		Thread.sleep(2000);
		WebElement logout=drv.findElement(lgt);
		return logout;
		
	}
	public static void action_btn() 
	{
		bton().click();
		
	}
	
	public static void action_logout() throws InterruptedException 
	{
		lgot().click();
	}

	
}
