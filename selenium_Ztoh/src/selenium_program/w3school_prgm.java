package selenium_program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class w3school_prgm {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.w3schools.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		
		
	}

}
