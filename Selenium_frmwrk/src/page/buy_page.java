package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class buy_page extends Add_to_Cart
{
static By chkot=By.xpath("//button[@class=\"btn btn_action btn_medium checkout_button\"]");
static By fname=By.xpath("//input[@class=\"input_error form_input\" and @id=\"first-name\"]");
static By lname=By.xpath("//input[@class=\"input_error form_input\" and @id=\"last-name\"]");
static By code=By.xpath("//input[@class=\"input_error form_input\" and @id=\"postal-code\"]");
static By ctnu=By.id("continue");
static By fns=By.id("finish");


public static WebElement ckot() 
{
	WebElement ckeckout=drv.findElement(chkot);
	return ckeckout;
	
}

public static WebElement frtnm() 
{
	WebElement firstname=drv.findElement(fname);
	return firstname;
	
}
public static WebElement lstnm() 
{
	WebElement lastname=drv.findElement(lname);
	return lastname;
	
}
public static WebElement code() 
{
	WebElement zipcode=drv.findElement(code);
	return zipcode;
	
}
public static WebElement ctnuu() 
{
	WebElement countinue=drv.findElement(ctnu);
	return countinue;
	
}
public static WebElement fns() 
{
	WebElement finish=drv.findElement(fns);
	return finish;
	
}

public static void action_checkout() throws InterruptedException 
{
	Thread.sleep(3000);
	ckot().click();
}
public static void firstnm_action() throws InterruptedException 
{
	frtnm().sendKeys("xyz");
	Thread.sleep(3000);
}
public static void lastname_action() throws InterruptedException 
{
	lstnm().sendKeys("sshd");
	Thread.sleep(3000);
	
}
public static void zip_code_action() throws InterruptedException
{
	code().sendKeys("123456");
	Thread.sleep(4000);
	
}
public static void continue_action() 
{
	ctnuu().click();
}
public static void action_finish() 
{
	fns().click();
	String res=drv.getTitle();
	
	System.out.println(res);
	if(res.contains("Swag")) 
	{
		System.out.println("test pass");
	}
	
}
}