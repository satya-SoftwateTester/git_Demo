package selenium_program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Primus_bank {

	public static void main(String[] args) throws InterruptedException 
	{
WebDriver d=new ChromeDriver();
d.get("http://primusbank.qedgetech.com/");
d.manage().window().maximize();
Thread.sleep(2000);


	}

}
