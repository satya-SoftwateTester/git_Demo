package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHrm_pr1 {

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

		By pfl=By.xpath("//span[@class=\"oxd-userdropdown-tab\"]");
		WebElement profile=d.findElement(pfl);
		profile.click();
		Thread.sleep(2000);

		By lgt=By.xpath("//a[text()=\"Logout\"]");
		WebElement logout=d.findElement(lgt);
		logout.click();
		Thread.sleep(5000);
		d.close();



	}

}
