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


	}

}
