package w3school_windowhandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pratice_windowHandles_irctc {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.irctc.co.in/nget/train-search");
		d.manage().window().maximize();
		Thread.sleep(2000);

		String fstid=d.getWindowHandle();
		System.out.println("the first window id is "+fstid);

		//elplicit wait
		WebDriverWait mywait=new WebDriverWait(d,Duration.ofSeconds(5));
		WebElement element=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=\"a\" and text()=\" BUSES \"]")));
		element.click();
		
//		By bs=By.xpath("//a[@class=\"a\" and text()=\" BUSES \"]");
//		WebElement bus=d.findElement(bs);
		//bus.click();

		Set<String>allwindowid=d.getWindowHandles();

		for(String echid:allwindowid) 
		{
			if(!echid.equals(fstid)) 
			{
				d.switchTo().window(echid);
				Thread.sleep(2000);
				
				By x=By.xpath("//button[@class=\"btn btn-link px-3 collapsed\" and text()=\"What are the advantages of online bus booking?\"]");
				WebElement y=d.findElement(x);
				y.click();
				Thread.sleep(2000); 
				

			}
		}
		Thread.sleep(2000);
		d.switchTo().window(fstid);
		Thread.sleep(3000);
		By chartertn=By.xpath("//span[@class=\"allcircle circleight\"]");
		WebElement ch=d.findElement(chartertn);
		ch.click();
		




	}

}
