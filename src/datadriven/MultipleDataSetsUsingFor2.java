package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleDataSetsUsingFor2 {
	public static void main(String[] args) throws IOException {
		String filePath="./resources/multipleTestData.xlsx";
		String sheetName="TC001";
		Sheet sheet=WorkbookFactory.create(new FileInputStream(filePath)).getSheet(sheetName);
		int rowsCount=sheet.getPhysicalNumberOfRows();
		System.out.println("NumOfRows:"+ rowsCount);  //5 , including header row
		Object[][] sarr=new Object[rowsCount-1][]; //4 , Size=number of rows excluding header
		for(int i=1, k=0; i<=rowsCount-1;i++, k++)
		{
			int cellsCount=sheet.getRow(i).getPhysicalNumberOfCells();
			//System.out.println("CellCount:"+cellsCount);
			sarr[k]=new String[cellsCount];
			for(int j=0; j<=cellsCount-1; j++)
			{
				sarr[k][j]=sheet.getRow(i).getCell(j).toString();
				System.out.print(sarr[k][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("=============================");
		for(int i=0; i<=sarr.length-1; i++)
		{
			for(int j=0; j<=sarr[i].length-1; j++)
			{
				System.out.print(sarr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
