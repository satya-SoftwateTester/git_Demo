package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_tpoint {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.javatpoint.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		By jva=By.xpath("(//a[@href=\"java-tutorial\"])[1]");
		WebElement java=d.findElement(jva);
	    java.click();
	    
	    By hist=By.xpath("//a[text()=\"History of Java\"] ");
	    WebElement history=d.findElement(hist);
	    history.click();
	    By eh=By.xpath("//fieldset[@class=\"gra1\"]//p[text()=\"Ethical Hacking\"]");
	    WebElement eithicalhacking=d.findElement(eh);
	    eithicalhacking.click();
		d.close();
		
		

	}

}
