package selenium_program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cyclos_prgm {

	public static void main(String[] args)
	{
		
WebDriver d=new ChromeDriver();
d.get("https://demo.cyclos.org/ui/home");
d.manage().window().maximize();



}

}
