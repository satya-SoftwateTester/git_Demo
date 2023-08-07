package pratice_test_automation_frmwk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class positive_testcase extends login_pratice_test_automation
{
	
	By unm=By.xpath("//input[@id=\"username\"]");

	By pwd=By.xpath("//input[@id=\"password\"]");

	By smt=By.id("submit");

	WebElement usrnm=drv.findElement(unm);
	
	WebElement pswd=drv.findElement(pwd);


}
