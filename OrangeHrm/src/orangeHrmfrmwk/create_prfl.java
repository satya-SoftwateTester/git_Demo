package orangeHrmfrmwk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class create_prfl extends Login
{
	static	By myinf=By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"and text()=\"My Info\"]");

	static	By fname=By.xpath("//input[@name='firstName']");

	static	By eid=By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[3]");

	static	By sv=By.xpath("(//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"])[1]");

	public static WebElement myinfo() 
	{
		WebElement info=drv.findElement(myinf);
		return info;
	}
	
	public static WebElement frtname() 
	{
		WebElement ftname=drv.findElement(fname);
		return ftname;

	}

	public static WebElement empid() 
	{
		WebElement emp_id=drv.findElement(eid);
		return emp_id;
	}

	public static WebElement save() 
	{
		WebElement sve=drv.findElement(sv);
		return sve;
	}

	public static void mf() 
	{
		myinfo().click();

	}
	public static void fnm() throws InterruptedException 
	{
		Thread.sleep(3000);
		frtname().sendKeys("satyabrata");

	}
	public static void ei() 
	{
		empid().sendKeys("50");

	}
	public static void sv() 
	{
		save().click();

	}




}
