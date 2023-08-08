
package pratice_test_automation_frmwk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class negative_testcase_1 extends login_pratice_test_automation
{
	static By unm1=By.xpath("//input[@id=\"username\"]");

	static By pwd1=By.xpath("//input[@id=\"password\"]");
	
	static By smt1=By.id("submit");
	
	static WebElement usrnm1=drv.findElement(unm1);
	
	static WebElement pswd1=drv.findElement(pwd1);
	
	static WebElement submit1=drv.findElement(smt1);


public static void unm_action() 
{
	usrnm1.sendKeys("incorrectUser");

}
public static void pwd_action() 
{
	pswd1.sendKeys("Password123");

}
public static void smt_action() 
{
	submit1.click();

}

}
