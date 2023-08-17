package orangeHrmfrmwk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends driver
{
static  By uname=By.xpath("//input[ @name=\"username\"]");

static By pname=By.xpath("//input[@name=\"password\"]");

static By lgn=By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]");

public static WebElement user() 
{
	 WebElement user1=drv.findElement(uname);
	 return user1;
	
}
 //static WebElement user=drv.findElement(uname);

public static WebElement password() 
{
	WebElement pwdname=drv.findElement(pname);
	return pwdname;
}
 //static WebElement pwdname=drv.findElement(pname);

public static WebElement login() 
{
	 WebElement logn=drv.findElement(lgn);
	 return logn;
}
 //static WebElement login=drv.findElement(lgn);


public static void action_user_1() 
{
	user().sendKeys("Admin");

}
public static void action_pwd1() 
{
	password().sendKeys("admin123");

}
public static void lgn() 
{
	login().click();

}






}
