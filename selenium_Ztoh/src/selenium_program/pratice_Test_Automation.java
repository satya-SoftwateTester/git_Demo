package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pratice_Test_Automation {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://practicetestautomation.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		By ptc=By.xpath("//a[text()=\"Practice\"]");
		WebElement pratice=d.findElement(ptc);
		pratice.click();
		Thread.sleep(2000);
		
	}

}
