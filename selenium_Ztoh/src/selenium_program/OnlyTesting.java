package selenium_program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlyTesting {

	public static void main(String[] args) 
	{
WebDriver d=new ChromeDriver();
d.get("http://only-testing-blog.blogspot.com/");
d.manage().window().maximize();


	}

}
