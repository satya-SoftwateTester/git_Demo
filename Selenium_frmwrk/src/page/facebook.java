package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class facebook extends Login_page
{
static By fb=By.xpath("//a[text()=\"Facebook\"]");

static By feml=By.xpath("//input[@id=\":rm:\"]");


	
	

public static WebElement fcebk() 
{
	return drv.findElement(fb);
	
}
public static WebElement email() 
{
	WebElement emailnm=drv.findElement(feml);
	return emailnm;
	
}
public static void action_email() throws InterruptedException 
{
	Thread.sleep(3000);
	email().sendKeys("abc@gmail.com");
}

}