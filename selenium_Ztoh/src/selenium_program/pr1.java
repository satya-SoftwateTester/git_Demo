package selenium_program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pr1 {

	public static void main(String[] args) 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.youtube.com");

	}

}
