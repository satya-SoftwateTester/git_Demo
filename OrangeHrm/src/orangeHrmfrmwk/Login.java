package orangeHrmfrmwk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends driver
{
static  By uname=By.xpath("//input[ @name=\"username\"]");

static By pname=By.xpath("//input[@name=\"password\"]");

static By lgn=By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]");

 static WebElement user=drv.findElement(uname);

 static WebElement pwdname=drv.findElement(pname);

 static WebElement login=drv.findElement(lgn);


public static void user_1() 
{
	user.sendKeys("Admin");

}
public static void pwd1() 
{
	pwdname.sendKeys("admin123");

}
public static void lgn() 
{
	login.click();

}






}
