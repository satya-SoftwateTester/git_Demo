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
		
		By tstlgn=By.xpath("//a[text()=\"Test Login Page\"]");
		WebElement testlogin=d.findElement(tstlgn);
		testlogin.click();
		Thread.sleep(2000);
		
		By unm=By.xpath("//input[@id=\"username\"]");
		WebElement usrnm=d.findElement(unm);
		usrnm.sendKeys("student");
		Thread.sleep(2000);
		
		By pwd=By.xpath("//input[@id=\"password\"]");
		WebElement pswd=d.findElement(pwd);
		pswd.sendKeys("Password123");
		Thread.sleep(2000);
		
		By smt=By.id("submit");
		WebElement submit=d.findElement(smt);
		submit.click();
		Thread.sleep(2000);
		
		By lgt=By.xpath("//a[text()=\"Log out\"]");
		WebElement logout=d.findElement(lgt);
		logout.click();
		
		
		
	}

}
