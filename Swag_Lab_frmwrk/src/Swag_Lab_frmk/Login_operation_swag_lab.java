package Swag_Lab_frmk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login_operation_swag_lab extends driver_swag
{
static By uid=By.id("user-name");
static By pwd=By.id("password");
static By login=By.id("login-button");


public static WebElement id() 
{
	WebElement usrid=drv.findElement(uid);
	return usrid;
}

public static WebElement pwd() 
{
	WebElement pwdd=drv.findElement(pwd);
	return pwdd;
	
}

public static WebElement lgn() 
{
	WebElement ln=drv.findElement(login);
	return ln;
	
}

public static void user_action() 
{
	wait.until(ExpectedConditions.visibilityOfAllElements(id() ));
	id().sendKeys("standard_user");
	
}
public static void password_action() 
{
	wait.until(ExpectedConditions.visibilityOfAllElements(pwd() ));
	pwd().sendKeys("secret_sauce");
}

public static void Logn_action() 
{
	wait.until(ExpectedConditions.visibilityOfAllElements(lgn() ));
	lgn().click();
}

}
