package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Add_to_Cart extends Login_page
{

	static By adcrt=By.id("add-to-cart-sauce-labs-backpack");
	
	
	public static WebElement cart() 
	{
		WebElement add=drv.findElement(adcrt);
		return add;
		
	}
	
	public static void action_cart() 
	{
		cart().click();
	}
	
}
