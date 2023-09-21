package selenium_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {

	public static void main(String[] args) 
	{
WebDriver drv=new ChromeDriver();
drv.get("file:///C:/Users/Rinku/OneDrive/Desktop/ex.html");
drv.manage().window().maximize();
By r=By.xpath("html/body/table/tbody/tr");
List<WebElement> x=drv.findElements(r);
int row=x.size();//how many row are present in this tble
System.out.println(row);
By c=By.xpath("html/body/table/tbody/tr/th");
List<WebElement> y=drv.findElements(c);

int col=y.size();
System.out.println(col);

for(int i=2;i<=row;i++) 
{
	for(int j=1;j<=col;j++) 
	{
		By ech_prdt=By.xpath("html/body/table/tbody/tr[i]/td[j]");
		WebElement prdt=drv.findElement(ech_prdt);
		String s=prdt.getText();
		System.out.print(s);
		
	}
	System.out.println();
}


	}

}
