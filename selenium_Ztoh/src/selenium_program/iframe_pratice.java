package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_pratice {

	public static void main(String[] args) throws InterruptedException
	{
WebDriver d=new ChromeDriver();
d.get("https://ui.vision/demo/webtest/frames/");
d.manage().window().maximize();
Thread.sleep(2000);

d.switchTo().frame(0);
By textbx=By.xpath("//input[@name=\"mytext1\"]");
WebElement bx=d.findElement(textbx);
bx.sendKeys("satya");

d.switchTo().parentFrame();

d.switchTo().frame(1);
By txtbx1=By.xpath("//input[@name=\"mytext2\"]");
WebElement bx1=d.findElement(txtbx1);
bx1.sendKeys("rinku");
Thread.sleep(2000);

d.switchTo().parentFrame();

d.switchTo().frame(2);
By txtbx2=By.xpath("//input[@name=\"mytext3\"]");
WebElement bx2=d.findElement(txtbx2);
bx2.sendKeys("satyabrata");
Thread.sleep(2000);





	}

}
