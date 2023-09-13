package DataDrivenTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHrm_data_Driven {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver drv=new ChromeDriver();
		drv.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		//getting the excel file 
		FileInputStream file=new FileInputStream("C:\\datadrivenexcel\\demo.xlsx");
		//getting the workbook for xls file
		XSSFWorkbook wrkbk=new XSSFWorkbook(file);
		//geting the first  sheet from the workbook
		XSSFSheet sheet=wrkbk.getSheet("Sheet1");
		//get the row count
		int row_count=sheet.getLastRowNum();
		System.out.println("The row present is "+row_count);


		for(int i=1;i<=row_count;i++) 
		{
			//to find current row
			XSSFRow current_row=sheet.getRow(i);
			String username=current_row.getCell(0).getStringCellValue();
			String password=current_row.getCell(1).getStringCellValue();
			
            Thread.sleep(2000);

			By uname=By.xpath("//input[@name=\"username\"]");
			
			Thread.sleep(2000);
			
			By pwd=By.xpath("//input[@name=\"password\"]");
			By lgn=By.xpath("//button[@type=\"submit\"]");


			//WebElement user=drv.findElement(uname);
		    drv.findElement(uname).sendKeys(username);
			drv.findElement(pwd).sendKeys(password);
			drv.findElement(lgn).click();
			if(drv.getPageSource().contains("Invalid credential")) 
			{
				System.out.println("register failed for "+i+"record");
			}
			else 
			{
				System.out.println("Resister pass for "+i+"record");
			}
		}

	}

}
