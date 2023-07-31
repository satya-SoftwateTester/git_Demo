package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class w3school_prgm {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.w3schools.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		By sgn=By.xpath("//a[@id=\"signupbtn_topnav\"]");
		WebElement sgnup=d.findElement(sgn);
		sgnup.click();
		Thread.sleep(2000);
		
		By sgnfr=By.xpath("(//a[@class=\"signup-button w3-button w3-round-xxlarge ws-green ws-hover-green\"and text()=\"Sign Up For Free\"])[1]");
		WebElement sgnupfr=d.findElement(sgnfr);
		sgnupfr.click();
		Thread.sleep(2000);
		
		By unm=By.id("modalusername");
		WebElement uname=d.findElement(unm);
		uname.sendKeys("satya020rinku@gmail.com");
		Thread.sleep(2000);
		
		By pwd=By.name("new-password");
		WebElement pwdd=d.findElement(pwd);
		pwdd.sendKeys("Satya_2000");
		Thread.sleep(2000);
		
		By snfr=By.xpath("//button[@class=\"Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu\"]");
		WebElement sgnfre=d.findElement(snfr);
		sgnfre.click();
		Thread.sleep(2000);
		
		By fname=By.id("modal_first_name");
		WebElement frtnm=d.findElement(fname);
		frtnm.sendKeys("satya");
		Thread.sleep(2000);
		
		By lname=By.id("modal_last_name");
		WebElement lstnm=d.findElement(lname);
		lstnm.sendKeys("rinku");
		Thread.sleep(2000);
		
		By ctnu=By.xpath("//button[@class=\"Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu\"]");
		WebElement ctnue=d.findElement(ctnu);
		ctnue.click();
		Thread.sleep(2000);
		
		By vrflnk=By.xpath("//button[@class=\"Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu\"]");
		WebElement vrflink=d.findElement(vrflnk);
		vrflink.click();
		
	}

}
