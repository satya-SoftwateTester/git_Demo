package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlyTesting {

	public static void main(String[] args) throws InterruptedException 
	{
WebDriver d=new ChromeDriver();
d.get("http://only-testing-blog.blogspot.com/");
d.manage().window().maximize();
Thread.sleep(2000);

By gndprnt=By.id("gparent_1");
WebElement grandpnt=d.findElement(gndprnt);
grandpnt.sendKeys("abc10");
Thread.sleep(2000);

By pnt=By.name("parent1");
WebElement prnt=d.findElement(pnt);
prnt.sendKeys("abc20");

By cld=By.id("child_1");
WebElement child=d.findElement(cld);
child.sendKeys("abc30");

By gndp2=By.id("gparent_2");
WebElement grndp2=d.findElement(gndp2);
grndp2.sendKeys("grand2");
Thread.sleep(2000);

By pnt2=By.id("parent_2");
WebElement prnt2=d.findElement(pnt2);
prnt2.sendKeys("pnt2");
Thread.sleep(2000);

By cld2=By.name("child2");
WebElement child2=d.findElement(cld2);
child2.sendKeys("child2");
Thread.sleep(2000);

By tm=By.xpath("//abbr[@class=\"published\" and text()=\"19:37\"]");
WebElement time=d.findElement(tm);
time.click();
Thread.sleep(2000);

By ttrp=By.xpath("//a[text()=\"Tooltip\"]");
WebElement tooltrip=d.findElement(ttrp);
tooltrip.click();
Thread.sleep(2000);


d.close();


	}

}
