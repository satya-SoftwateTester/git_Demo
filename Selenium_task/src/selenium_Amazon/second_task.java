package selenium_Amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class second_task extends first_task 
{
	public static void details() throws InterruptedException 
	{
		List<WebElement>allproduct=drv.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		System.out.println(allproduct.size());
		Thread.sleep(3000);

		List<WebElement>price=drv.findElements(By.xpath("//span[@class=\"a-price-whole\"]"));
		System.out.println(price);
		for(WebElement ele:allproduct) 
		{
			String element=ele.getText();
			Thread.sleep(3000);
			System.out.print(element);

			System.out.println();
		}
		for(WebElement prc:price) 
		{
			String price_details=prc.getText();
			System.out.println("price details are"+price_details);

		}

	}
}



