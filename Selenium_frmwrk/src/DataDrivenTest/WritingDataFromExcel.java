package DataDrivenTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataFromExcel {

	public static void main(String[] args) throws IOException
	{
		FileOutputStream file=new FileOutputStream("C:\\datadrivenexcel\\output.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("satya");
		for(int i=0;i<5;i++) 
		{
			XSSFRow row=sheet.createRow(i);
			for(int j=0;j<4;j++) 
			{
				row.createCell(j).setCellValue("Satya");
			}
		}
		workbook.write(file);
		file.close();
		System.out.println("Written data into excel is completed");
		
	}

}
