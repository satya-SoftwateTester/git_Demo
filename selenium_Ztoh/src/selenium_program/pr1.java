package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pr1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.saucedemo.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		By uname=By.id("user-name");
		WebElement username=d.findElement(uname);
		username.sendKeys("standard_user");
		Thread.sleep(3000);
		By pwd=By.id("password");
		WebElement pwdname=d.findElement(pwd);
		pwdname.sendKeys("secret_sauce");
		Thread.sleep(3000);
		By lgn=By.id("login-button");
		WebElement login=d.findElement(lgn);
		login.click();
		Thread.sleep(5000);
		d.close();
		
		

	}

}
