package w3school_windowhandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pratice_windowhandling {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.w3schools.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		 By jvptc=By.xpath("//a[@class=\"ga-bottom\" and text()=\"Java Certificate\"]");
		 WebElement javaptc=d.findElement(jvptc);
		 Thread.sleep(5000);

		 javaptc.click();
		 Thread.sleep(5000);
		 
			Set<String>allwindows=d.getWindowHandles();
			
			Object[] windows=allwindows.toArray();
			String window1=	windows[0].toString();
			String window2=windows[1].toString();
		 d.switchTo().window(window2);
		 
		 By adct=By.xpath("//button[@class=\"accordion\" and text()=\"Step 1: Add to cart\"]");
		 WebElement clk=d.findElement(adct);
		 Thread.sleep(5000);

		 clk.click();
		 Thread.sleep(5000);
		 
		 d.switchTo().window(window1);
		 
		 By sqlptc=By.xpath("//a[@class=\"ga-bottom\" and text()=\"SQL Examples\"]");
		 WebElement sql=d.findElement(sqlptc);
		 sql.click();
		 Thread.sleep(2000);
		 d.quit();
		 

	}

}
