package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample4 {
	public static void main(String[] args) throws IOException {
		String filePath="./resources/multipleTestData2.xlsx";
		String sheetname="TC001";
		
		Sheet sheet=WorkbookFactory.create(new FileInputStream(filePath)).getSheet(sheetname);
		int rowsCount=sheet.getPhysicalNumberOfRows();
		String[][] sarr=new String[rowsCount][];
		for(int i=0; i<=rowsCount-1;i++)
		{
			int cellsCount=sheet.getRow(i).getPhysicalNumberOfCells();
			sarr[i]=new String[cellsCount];
			for(int j=0; j<=cellsCount-1; j++)
			{
				
				System.out.print(sheet.getRow(i).getCell(j)+" ");
			}
			System.out.println();
		}
	}

}
