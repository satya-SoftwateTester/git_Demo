package w3school_iframepratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iframe_operation extends driver_w3school
{
static By fname=By.xpath("//input[@id=\"fname\"]");
static By lname=By.id("lname");
static By smt=By.xpath("//input[@value=\"Submit\"]");

public static WebElement input_firstname() 
{
	drv.switchTo().frame("iframeResult");
	WebElement fnme=drv.findElement(fname);
	return fnme;
}

public static WebElement input_lastname() 
{
	WebElement lnme=drv.findElement(lname);
	return lnme;
	
}
public static WebElement submit() 
{
	WebElement sbmit=drv.findElement(smt);
	return sbmit;
}

public static void action_fname() throws InterruptedException 
{
	input_firstname().sendKeys("satya");
	Thread.sleep(2000);
}

public static void action_lname() throws InterruptedException 
{
	input_lastname().sendKeys("brata");
	Thread.sleep(2000);
}

public static void action_submit() throws InterruptedException 
{
	submit().click();	
	Thread.sleep(2000);
}




}
