package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Add_to_Cart extends Login_page
{

	static By adcrt=By.id("add-to-cart-sauce-labs-backpack");
	static By crt=By.xpath("//span[@class=\"shopping_cart_badge\"]");
	
	public static WebElement cart() 
	{
		WebElement add=drv.findElement(adcrt);
		return add;
		
	}
	public static WebElement crrt() 
	{
		WebElement ct=drv.findElement(crt);
		return ct;
		
	}
	
	public static void action_cart() throws InterruptedException 
	{
		cart().click();
		Thread.sleep(3000);
	}
	
	public static void action_ct() 
	{
		crrt().click();
	}
}
