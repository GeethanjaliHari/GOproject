package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary {
	// In Library methods do not throw exception , just handle the exception using try catch, because it becomes difficult for user to use at test case level
	public static Object[][] getExcelSheetData(String fileName, String sheetName)
	{
		Object[][] objArr=null;
		try {
				Sheet sheet=WorkbookFactory.create(new FileInputStream(fileName)).getSheet(sheetName);
				int rowsCount=sheet.getPhysicalNumberOfRows();
				objArr=new Object[rowsCount-1][];
			
				for(int i=1, k=0; i<=rowsCount-1; i++, k++)
				{
					int cellsCount=sheet.getRow(i).getPhysicalNumberOfCells();
					objArr[k]=new String[cellsCount];
					for(int j=0; j<=cellsCount-1; j++)
					{
						objArr[k][j]=sheet.getRow(i).getCell(j).toString();
					}
				}
			}
		catch(IOException e) // 
		{
			System.out.println(e);	
		}
		return objArr;
		} 
		
		// Instead of this getExcelSheetData method we go for simple method which we use in frameworks. So go for this method
	
	public static String getCellData(String filePath, String sheetName, int rowCount, int cellCount)
	{
		String data=" ";
		try {
			Sheet sheet=WorkbookFactory.create(new FileInputStream(filePath)).getSheet(sheetName);
			data=sheet.getRow(rowCount).getCell(cellCount).toString();
		}
		catch(IOException e)
		{
			System.out.println(e); // gives exception when there is no data in excel sheet, or when there is mistake in the data
		}
		
		return data;
	}
}


