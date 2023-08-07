package pratice_test_automation_frmwk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class positive_testcase extends login_pratice_test_automation
{
	
	static By unm=By.xpath("//input[@id=\"username\"]");

	static By pwd=By.xpath("//input[@id=\"password\"]");

	static By smt=By.id("submit");

	static WebElement usrnm=drv.findElement(unm);
	
	static	WebElement pswd=drv.findElement(pwd);
	
	static WebElement submit=drv.findElement(smt);
	
	public static void unm_action() 
	{
		usrnm.sendKeys("student");

	}
	public static void pwd_action() 
	{
		pswd.sendKeys("Password123");

	}
	public static void smt_action() 
	{
		submit.click();

		
	}



}
