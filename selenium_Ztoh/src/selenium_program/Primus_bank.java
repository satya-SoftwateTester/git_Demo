package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Primus_bank {

	public static void main(String[] args) throws InterruptedException 
	{
WebDriver d=new ChromeDriver();
d.get("http://primusbank.qedgetech.com/");
d.manage().window().maximize();
Thread.sleep(2000);

By prsnl=By.xpath("//input[@id=\"personal\"]");
WebElement personal=d.findElement(prsnl);
personal.click();
Thread.sleep(2000);

By unm=By.id("idtxt");
WebElement usrnm=d.findElement(unm);
usrnm.sendKeys("person");
Thread.sleep(2000);

By pwd=By.name("pswdtxt");
WebElement pawd=d.findElement(pwd);
pawd.sendKeys("person@123");
//Thread.sleep(5000);
//pawd.clear();
Thread.sleep(3000);

By lgn=By.id("btnGO");
WebElement login=d.findElement(lgn);
login.click();


	}

}
