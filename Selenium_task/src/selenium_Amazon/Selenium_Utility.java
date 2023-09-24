package selenium_Amazon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Utility 
{
	static WebDriver drv;

	public static void browser() 
	{
		drv=new ChromeDriver();
		drv.get("https://www.amazon.in/");
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);


	}
	public static void dropdown() throws InterruptedException 
	{
		List<WebElement> allcategory=drv.findElement(By.id("searchDropdownBox")).findElements(By.tagName("option"));
		for(WebElement allitem:allcategory) 
		{
			String each_item=allitem.getText();
			Thread.sleep(3000);
			if(each_item.equalsIgnoreCase("All Categories")) 
			{
				allitem.click();
				break;
			}

		}
	}

}
