package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cyclos_prgm {

	public static void main(String[] args) throws InterruptedException
	{
		
WebDriver d=new ChromeDriver();
d.get("https://demo.cyclos.org/ui/home");
d.manage().window().maximize();
Thread.sleep(4000);

By rstr=By.id("register-link");
WebElement register=d.findElement(rstr);
register.click();
Thread.sleep(4000);

By nm=By.id("id_1");
WebElement name=d.findElement(nm);
name.sendKeys("satyabrata");
Thread.sleep(4000);

By lgnnm=By.id("id_2");
WebElement loginnm=d.findElement(lgnnm);
loginnm.sendKeys("satya123");
Thread.sleep(4000);

By emlnm=By.id("id_3");
WebElement emailnm=d.findElement(emlnm);
emailnm.sendKeys("abc@gmail.com");
Thread.sleep(4000);

By webste=By.name("website");
WebElement website=d.findElement(webste);
website.sendKeys("w3school.com");
Thread.sleep(4000);

By gndr=By.xpath("(//label[@class=\"custom-control-label\"])[2]");
WebElement gender=d.findElement(gndr);
gender.click();
Thread.sleep(4000);

By bnstp=By.id("business_type");
WebElement businesstype=d.findElement(bnstp);
businesstype.click();
Thread.sleep(4000);

By drnlst=By.xpath("//a[@id=\"business_type_technical\" and text()=\" Technical \"]");
WebElement drnlist=d.findElement(drnlst);
drnlist.click();
Thread.sleep(4000);

By mobno=By.id("id_4");
WebElement mobileno=d.findElement(mobno);
mobileno.sendKeys("123456789");
Thread.sleep(4000);





}

}
