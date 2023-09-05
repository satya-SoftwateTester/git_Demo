package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class create_account extends facebook
{
static  By crt=By.xpath("//span[@class=\"x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft x1j85h84\"and text()=\"Create new account\"]");
static By fn=By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\" and @name=\"firstname\"]");
static By ln=By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\" and @name=\"lastname\"]");




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

	
	
}
