package Swag_Lab_frmk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class logout_Swaglab extends Login_operation_swag_lab
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
