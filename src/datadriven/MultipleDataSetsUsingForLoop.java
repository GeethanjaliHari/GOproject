package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleDataSetsUsingForLoop {
	public static void main(String[] args) throws IOException {
		String filePath="./resources/multipleTestData.xlsx";
		String sheetName="TC001";
		
	//	FileInputStream excelFile=new FileInputStream(filePath);
	//	Workbook wb=WorkbookFactory.create(excelFile);
		Sheet sheet=WorkbookFactory.create(new FileInputStream(filePath)).getSheet(sheetName);
		
		for(int i=0;i<=4;i++) // rows--> 0,1,2,3,4
		{
			for(int j=0; j<=1; j++) // col-->0, 1
			{
				System.out.print(sheet.getRow(i).getCell(j)+" ");
			}
			System.out.println();
		}
		
	}

}
