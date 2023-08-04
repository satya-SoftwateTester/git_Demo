package orangeHrmfrmwk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class create_prfl extends Login
{
static	By myinf=By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"and text()=\"My Info\"]");

static	By fname=By.xpath("//input[@class=\"oxd-input oxd-input--active orangehrm-firstname\" and @name=\"firstName\"]");

static	By eid=By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[3]");

static	By sv=By.xpath("(//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"])[1]");

static WebElement myinfo=drv.findElement(myinf);

static WebElement frtname=drv.findElement(fname);

static WebElement empid=drv.findElement(eid);

static WebElement save=drv.findElement(sv);

public static void mf() 
{
	myinfo.click();

}
public static void fnm() 
{
	frtname.sendKeys("satyabrata");

}
public static void ei() 
{
	empid.sendKeys("50");

}
public static void sv() 
{
	save.click();

}




}
