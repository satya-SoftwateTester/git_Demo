package selenium_program;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ajax_selenium {

	public static void main(String[] args) throws InterruptedException 
	{
     WebDriver drv=new ChromeDriver();
     drv.get("https://www.google.com/");
     drv.manage().window().maximize();
     drv.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
     
     By srch=By.id("APjFqb");
     WebElement search =drv.findElement(srch);
     search.sendKeys("selenium");
     Thread.sleep(3000);
     
     List<WebElement> allitem=drv.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
     System.out.println(allitem.size());
     for(WebElement ele:allitem) 
     {
    	 String one_item=ele.getText();
    	 Thread.sleep(2000);
    	 
    	 if(one_item.equalsIgnoreCase("selenium download")) 
    	 {
    		 ele.click();
    		 break;
    	 }
     }
		
		
	}

}
