package pratice_test_automation_frmwk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Execution_pratice_test_automation {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver drv = new ChromeDriver();
		drv.get("https://practicetestautomation.com/");

		drv.manage().window().maximize();
		Thread.sleep(2000);
		
		
		
	}

}
