package selenium_Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class first_task extends Selenium_Utility
{
	static 	By srch=By.xpath("//input[@id=\"twotabsearchtextbox\"]");
	static By entr=By.xpath("//input[@id=\"nav-search-submit-button\"and @value=\"Go\"]");

	public static WebElement search() 
	{
		WebElement searchbar=drv.findElement(srch);
		return searchbar;
	}
	public static WebElement enter() 
	{
		WebElement entere=drv.findElement(entr);
		return entere;
	}

	public static void enter_value(String name) 
	{
		search().sendKeys(name);
	}
	public static void enter_go_action() 
	{
		enter().click();
	}




}
