package w3school_iframepratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Return_parentpage extends iframe_operation
{
static By p_run=By.xpath("//button[@id=\"runbtn\"]");

public static WebElement pntrn() 
{
	drv.switchTo().parentFrame();
	WebElement pn=drv.findElement(p_run);
	return pn;
}

public static void action_run() throws InterruptedException 
{
	Thread.sleep(5000);
	pntrn().click();
	drv.close();
}
}
