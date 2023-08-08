package pratice_test_automation_frmwk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logout_pratice_test_automation extends driver_pratice_test_automation
{
	static By lgt=By.xpath("//a[text()=\"Log out\"]");

    static WebElement logout=drv.findElement(lgt);
    
    public static void logout_action() 
    {
		logout.click();

    }
	


}
