package DataDrivenTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException 
	{
FileInputStream file=new FileInputStream("C:\\datadrivenexcel\\demo.xlsx");

XSSFWorkbook wb=new XSSFWorkbook(file);

//XSSFSheet sht=wb.getSheet("Sheet1");//providing sheet name

XSSFSheet st=wb.getSheetAt(0);

int rowcount=st.getLastRowNum();//how many row are present in the sheet

System.out.println(rowcount);

int colcount=st.getRow(0).getLastCellNum();//return last sell in row
System.out.println(colcount);
for(int i=0;i<=rowcount;i++) 
{
	XSSFRow currentrow=st.getRow(i);//focused on current row
	for(int j=0;j<colcount;j++) 
	{
		
		String value=currentrow.getCell(j).toString();//under row cell is present
		System.out.print(value);
	}
	System.out.println();
	
}

}

}
