package orangeHrmfrmwk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class logout extends Login
{
static 	By pfl=By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]");

static By lgt=By.xpath("//a[@class=\"oxd-userdropdown-link\" and text()=\"Logout\"]");

public static WebElement profile() 
{
	WebElement profle=drv.findElement(pfl);
	return profle;
}
//static WebElement profile=drv.findElement(pfl);

public static WebElement logout_1() 
{
	WebElement lgout=drv.findElement(lgt);
	return lgout;
}
//static WebElement logout=drv.findElement(lgt);

public static void pfle()
{
profile().click();

}
public static void logot() 
{
	logout_1().click();

}


}
