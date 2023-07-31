package selenium_program;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm_crtpfl {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		
		By uname=By.xpath("//input[ @name=\"username\"]");
		WebElement user=d.findElement(uname);
		user.sendKeys("Admin");
		
		
		By pname=By.xpath("//input[@name=\"password\"]");
		WebElement pwdname=d.findElement(pname);
		pwdname.sendKeys("admin123");
		
		By lgn=By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]");
		WebElement login=d.findElement(lgn);
		login.click();
		Thread.sleep(2000);
		
		
		By myinf=By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"and text()=\"My Info\"]");
		//By myinf=By.xpath("//a[@class='oxd-main-menu-item active']");
		WebElement myinfo=d.findElement(myinf);
		myinfo.click();
		Thread.sleep(2000);
		
		By fname=By.xpath("//input[@class=\"oxd-input oxd-input--active orangehrm-firstname\" and @name=\"firstName\"]");
		WebElement frtname=d.findElement(fname);
		//Thread.sleep(1000);
		//frtname.click();
		//frtname.clear();
//		frtname.sendKeys(Keys.chord(Keys.CONTROL,"a"));
//		frtname.sendKeys(Keys.BACK_SPACE);
		frtname.sendKeys("satyabrata");
		
		By eid=By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[3]");
		WebElement empid=d.findElement(eid);
		empid.clear();
		empid.sendKeys("50");
		
		By sv=By.xpath("(//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"])[1]");
		WebElement save=d.findElement(sv);
		save.click();
		Thread.sleep(5000);
		
		d.close();
		
		
		
	}

}
