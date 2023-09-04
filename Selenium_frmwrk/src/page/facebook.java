package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class facebook extends Login_page
{
	static By fb=By.xpath("//a[text()=\"Facebook\"]");

	static By feml=By.xpath("//*[@id=\":rm:\"]");
	static By pwd=By.xpath("//*[@id=\":ro:\"]");
	static By lgn=By.xpath("//span[@class=\"x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft x1j85h84\"and text()=\"Log in\"]");





	public static WebElement fcebk() 
	{
		return drv.findElement(fb);

	}

	public static WebElement email() 
	{
		WebElement emailnm=drv.findElement(feml);
		return emailnm;

	}
	public static WebElement passwd() 
	{
		WebElement password=drv.findElement(pwd);
		return password;
	}
	public static WebElement login() 
	{
		WebElement ln=drv.findElement(lgn);
		return ln;
	}
	public static void action_email(String emailid) throws InterruptedException 
	{
		Thread.sleep(3000);
		email().sendKeys(emailid);
	}
	public static void action_password(String pass) throws InterruptedException 
	{
		Thread.sleep(3000);
		passwd().sendKeys(pass);
	}
	public static void Login_action() 
	{
		login().click();
	}


}