package pratice_test_automation_frmwk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class login_pratice_test_automation extends driver_pratice_test_automation 
{
	static By ptc=By.xpath("//a[text()=\"Practice\"]");

	static By tstlgn=By.xpath("//a[text()=\"Test Login Page\"]");

	static	WebElement pratice=drv.findElement(ptc);

	static WebElement testlogin=drv.findElement(tstlgn);
	
	public static void ptc_aton() 
	{
		pratice.click();

	}
	public static void tstlgn_action() 
	{
		testlogin.click();

	}
	
	

}
