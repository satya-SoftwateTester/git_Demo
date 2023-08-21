package orangeHrmfrmwk;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_handles 
{
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();
		Thread.sleep(2000);

		By windowhandle=By.xpath("(//p[@class=\"oxd-text oxd-text--p orangehrm-copyright\"and //text()=\"OrangeHRM, Inc\"])[2]");
		WebElement x=d.findElement(windowhandle);
		x.click();

		String baseid=d.getWindowHandle();
		System.out.println(baseid);

		Set<String>allwindowid=d.getWindowHandles();
		for(String a:allwindowid) 
		{
			if(!a.equals(baseid)) 
			{
				d.switchTo().window(a);
				Thread.sleep(2000);

				By cntsl=By.xpath("(//button[@class=\"btn btn-ohrm btn-free-demo\" and text()=\"Contact Sales\"])[2]");
				WebElement free=d.findElement(cntsl);
				free.click();
				Thread.sleep(2000);

				By fnm=By.id("Form_getForm_FullName");
				WebElement nm=d.findElement(fnm);
				nm.sendKeys("satyabrata");
				Thread.sleep(2000);

				By phnnr=By.id("Form_getForm_Contact");
				WebElement phonenbr=d.findElement(phnnr);
				phonenbr.sendKeys("8018451554");
				Thread.sleep(2000);

				By email=By.id("Form_getForm_Email");
				WebElement eml=d.findElement(email);
				eml.sendKeys("abc@gmail.com");
				Thread.sleep(3000);

				By jbtl=By.name("JobTitle");
				WebElement job=d.findElement(jbtl);
				job.sendKeys("QA engineer");

				By msg=By.xpath("//textarea[@class=\"textarea\"]");
				WebElement message=d.findElement(msg);
				message.sendKeys("hii how are you");

				//d.close();

			}
		}

		d.switchTo().window(baseid);

		By unm=By.name("username");
		WebElement user=d.findElement(unm);
		user.sendKeys("Admin");
		Thread.sleep(2000);

		By pwd=By.name("password");
		WebElement password=d.findElement(pwd);
		password.sendKeys("admin123");
		Thread.sleep(2000);

		By lgn=By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]");
		WebElement login=d.findElement(lgn);
		login.click();

		d.quit();








	}

}
