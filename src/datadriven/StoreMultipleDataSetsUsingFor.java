package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StoreMultipleDataSetsUsingFor {
	public static void main(String[] args) throws IOException {
		String filePath="./resources/multipleTestData.xlsx";
		String sheetName="TC001";
		
		Sheet sheet=WorkbookFactory.create(new FileInputStream(filePath)).getSheet(sheetName);
		int rowsCount=sheet.getPhysicalNumberOfRows();
		//String[][] sarr=new String[rowsCount][];
		System.out.println("RowsCount:"+ rowsCount);
		for(int i=0;i<rowsCount;i++)
		{
			int cellsCount=sheet.getRow(i).getPhysicalNumberOfCells();
		//	sarr[i]=new String[cellsCount];
		//	System.out.println("CellsCount:"+ cellsCount);
			for(int j=0; j<=cellsCount-1;j++)
			{
				System.out.print(sheet.getRow(i).getCell(j)+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
