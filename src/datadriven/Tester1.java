package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Tester1 {
	public static void main(String[] args) throws IOException {
		
		//Strore the file path and sheet name
		String filePath="E:\\GO project\\Book1\\testData.xlsx";
		String sheetName="Sheet1";
		
		//Create an object of FileInputStream with excel filePath
		
		FileInputStream excelFile= new FileInputStream(filePath);
		Workbook wb=WorkbookFactory.create(excelFile);
		
		//Get the sheet you want to fetch the data
		
		Sheet sheet = wb.getSheet(sheetName);
		
		//Get the data from the  sheet's row and column
		
		Row row=sheet.getRow(1);
		String usernameData=row.getCell(1).getStringCellValue();
		System.out.println("uNameData:" + usernameData);
		
		String pwdData=row.getCell(2).getStringCellValue();
		System.out.println("pwdData:"+ pwdData);
	}

}
