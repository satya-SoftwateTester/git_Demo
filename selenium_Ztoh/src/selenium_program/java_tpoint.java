package selenium_program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_tpoint {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.javatpoint.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.close();

	}

}
