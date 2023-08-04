package orangeHrmfrmwk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class logout extends Login
{
static 	By pfl=By.xpath("//span[@class=\"oxd-userdropdown-tab\" and //text()=\"Shekar reddy\"]");

static By lgt=By.xpath("//a[@class=\"oxd-userdropdown-link\" and text()=\"Logout\"]");

static WebElement profile=drv.findElement(pfl);

static WebElement logout=drv.findElement(lgt);

public static void pfle()
{
profile.click();

}
public static void logot() 
{
	logout.click();

}


}
