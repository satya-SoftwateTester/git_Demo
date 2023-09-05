package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class create_account extends facebook
{
	static  By crt=By.xpath("//span[@class=\"x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft x1j85h84\"and text()=\"Create new account\"]");
	static By fn=By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\" and @name=\"firstname\"]");
	static By ln=By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\" and @name=\"lastname\"]");
	static By eml=By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\" and @name=\"reg_email__\"]");
	static By reml=By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"and @name=\"reg_email_confirmation__\"]");
	static By pwd=By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"and @name=\"reg_passwd__\"]");
    static By dy=By.xpath("//select[@class=\"_9407 _5dba _9hk6 _8esg\" and @name=\"birthday_day\"]");




	public static WebElement create() 
	{
		WebElement crt_acnt=drv.findElement(crt);
		return crt_acnt;
	}
	public static WebElement firstname() 
	{
		WebElement fnm=drv.findElement(fn);
		return fnm;
	}
	public static WebElement lastname() 
	{
		WebElement lnm=drv.findElement(ln);
		return lnm;

	}
	public static WebElement email() 
	{
		WebElement emai=drv.findElement(eml);
		return emai;
	}
	public static WebElement remail() 
	{
		WebElement reenterml=drv.findElement(reml);
		return reenterml;

	}
	public static WebElement password() 
	{
		WebElement passwd=drv.findElement(pwd);
		return passwd;

	}
	public static WebElement day() 
	{
		WebElement dayy=drv.findElement(dy);
		return dayy;
	}

	public static void action_create() throws InterruptedException 
	{
		Thread.sleep(3000);
		create().click();
	}
	public static void action_fname(String fnme) throws InterruptedException 
	{
		Thread.sleep(6000);
		firstname().sendKeys(fnme);
	}
	public static void action_lname(String lnme) throws InterruptedException 
	{
		Thread.sleep(3000);
		lastname().sendKeys(lnme);
	}
	public static void action_email(String mail) throws InterruptedException 
	{
		Thread.sleep(3000);
		email().sendKeys(mail);
	}
	public static void action_remail(String remail) throws InterruptedException 
	{
		Thread.sleep(2000);
		remail().sendKeys(remail);
	}
	public static void action_password(String pass) throws InterruptedException 

	{
		Thread.sleep(3000);
		password().sendKeys(pass);
	}
	public static void action_day(String dayn) throws InterruptedException 
	{
		Thread.sleep(3000);
		day().sendKeys(dayn);
	}

}




